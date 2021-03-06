package org.xtext.example.mydsl.debugger.processing;

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.xtext.example.mydsl.debugger.context.CallStack;
import org.xtext.example.mydsl.debugger.context.CallStackItem;
import org.xtext.example.mydsl.debugger.context.Symbol;
import org.xtext.example.mydsl.debugger.context.SymbolTable;
import org.xtext.example.mydsl.debugger.processing.expression.OperationExpressionExecutor;
import org.xtext.example.mydsl.myDsl.ArrayDimension;
import org.xtext.example.mydsl.myDsl.ArrayReference;
import org.xtext.example.mydsl.myDsl.Atomic;
import org.xtext.example.mydsl.myDsl.BooleanReference;
import org.xtext.example.mydsl.myDsl.ComparisionExpression;
import org.xtext.example.mydsl.myDsl.ConstantVariableExpression;
import org.xtext.example.mydsl.myDsl.FloatReference;
import org.xtext.example.mydsl.myDsl.HexadecimalReference;
import org.xtext.example.mydsl.myDsl.SharedVariableExpression;
import org.xtext.example.mydsl.myDsl.LongReference;
import org.xtext.example.mydsl.myDsl.NextTaskExpression;
import org.xtext.example.mydsl.myDsl.PrimitiveReference;
import org.xtext.example.mydsl.myDsl.StringReference;
import org.xtext.example.mydsl.myDsl.Variable;
import org.xtext.example.mydsl.myDsl.VariableDeclerationExpression;
import org.xtext.example.mydsl.myDsl.VariableReference;
import org.xtext.example.mydsl.myDsl.VariableSymbol;


public abstract class AbstractStackHelper {
    protected static boolean isBreak = false;
    protected static final int RAND_MAX = 32767;
    static boolean isReturn = false;
    static Object lastFunctionReturn = null;
    
    protected static CallStackItem lookupStackItem(String id) {
        Iterator<CallStackItem> callStackIterator = CallStack.getCallStack().iterator();
        
        while(callStackIterator.hasNext()) {
            CallStackItem item = callStackIterator.next();
            
            if(item.getId() == id) {
                return item;
            }
        }
        
        return null;
    }
    
    protected static String getParentId() {
        CallStackItem item = CallStack.getCallStack().getLast();
        return item.getId();
    }
    
    protected static Symbol lookupSymbolByAtomic(Atomic atomic, String id) {        
//        if Atomic is StringReference or LongReference or FloatReference or BooleanReference, HexadecimalReference
//        the value is not inside call stack. So make dummy symbol and return it.
//        System.out.println("lookupSymbolByAtomic: atomic: " + atomic.toString() + " id: " + id);
        if(isDummy(atomic)) {
            Symbol dummy = dummySymbol(atomic);
            return dummy;
        }
        
        String variableName = getAtomicName(atomic);
        Symbol symbol = lookupSymbolByString(variableName, id);
        
        return symbol;
    }
    
    protected static Symbol lookupSymbolByString(String variableName, String id) {
        Symbol symbol = null;
        
        symbol = searchByString(variableName, id);
        
        if (symbol == null) {
            // Look for SHARED variables
            symbol = searchByString(variableName, "shared");
        }
        
        if (symbol == null) {
            // Look for CONSTANT variables
            symbol = searchByString(variableName, "constant");
        }
        return symbol;
    }
    
    private static Symbol searchByString(String variableName, String id) {
        Symbol symbol = null;
        CallStackItem callStackItem = lookupStackItem(id);
        Iterator<Symbol> iterator = callStackItem.getSymbolTable().getSymbolTable().iterator();
        
        while(iterator.hasNext()) {
            symbol = iterator.next();
            
            if(symbol.getName() == variableName) {
                return symbol;
            }
        }
        return null;
    }
    
    private static Symbol dummySymbol(Atomic atomic) {
        Object value = null;
        String type = null;
        
        if(atomic instanceof StringReference) {
            value = (String) ((StringReference) atomic).getValue();
            type = "string";
        } else if (atomic instanceof LongReference) {
            value = (long) ((LongReference) atomic).getValue();
            type = "integer";
        } else if (atomic instanceof FloatReference) {
            value = (float) ((FloatReference) atomic).getValue();
            type = "float";
        } else if (atomic instanceof BooleanReference) {
            value = (boolean) ((BooleanReference) atomic).isValue();
            type = "boolean";
        } else if (atomic instanceof HexadecimalReference) {
            value = Long.decode(((HexadecimalReference) atomic).getValue());
        }
        
        Symbol dummySymbol = new Symbol("dummy", type);
        dummySymbol.setVariableValue(value);
        return dummySymbol;
    }
    
    private static boolean isDummy(Atomic atomic) {
        boolean result = false;
        
        if (atomic instanceof PrimitiveReference) {
            result = true;
        }
        return result;
    }
    
    public static void addCallStackItem(String id) {
        CallStack.getCallStack().add(new CallStackItem(id, new SymbolTable()));
    }

    protected static void removeCallStackItem(String id) {
        CallStackItem item = lookupStackItem(id);
        CallStack.getCallStack().remove(item);
    }
    
    protected static void updateCallStackBySymbol(Symbol symbol, Object value) {
        symbol.setVariableValue(value);
    }
    
    protected static void updateCallStackByAtomic(Atomic atomic, Object value, String id) {
        Symbol symbol = lookupSymbolByAtomic(atomic, id);
        updateCallStackBySymbol(symbol, value);
    }
    
    protected static void updateCallStackBySymbol(Symbol symbol, Object[] values) {
        if (symbol.getVariableValue() instanceof Object[]) {
            Object[] oldValues = (Object[]) symbol.getVariableValue();
            if (oldValues.length == values.length) {
                symbol.setVariableValue(values);
            } else {
                System.out.println("Array values are out of index for variable " + symbol.getName());
            }
        } else {
            System.out.println("Symbol " + symbol.getName() + " is not an array instance.");
        }
    }

    protected static void addCallStackBySymbol(Symbol symbol, String id) {
        CallStackItem item = lookupStackItem(id);
        
        if (item != null) {
            item.getSymbolTable().getSymbolTable().add(symbol);
        }
    }
    
    protected static void removeCallStackBySymbol(Symbol symbol, String id) {
        CallStackItem item = lookupStackItem(id);
        
        if (item != null) {
            item.getSymbolTable().getSymbolTable().remove(symbol);
        }
    }
    
    protected static void removeCallStack(String id) {
        CallStackItem item = lookupStackItem(id);
        
        if (item != null) { 
            item.getSymbolTable().getSymbolTable().clear();
            CallStack.getCallStack().remove(item);
        }
    }
    
    private static Object decouplePrimitiveAtomic(Atomic atomic) {
        Object m_return = null;
        if(atomic instanceof StringReference) {
            m_return = ((StringReference) atomic).getValue();
        } else if(atomic instanceof BooleanReference) {
            m_return = ((BooleanReference) atomic).isValue();
        } else if(atomic instanceof LongReference) {
            m_return = ((LongReference) atomic).getValue();
        } else if(atomic instanceof FloatReference) {
            m_return = ((FloatReference) atomic).getValue();
        } else if (atomic instanceof HexadecimalReference) {
            m_return = Long.decode(((HexadecimalReference) atomic).getValue());
        }
        return m_return;
    }
    
    private static Object decoupleVariableAtomic(Atomic atomic, String id) {
        Object m_return = null;
        if (atomic instanceof ArrayReference) {
            long index = 0;
            Symbol symbol = lookupSymbolByAtomic(atomic, id);
            Object[] arrayValues = (Object[]) symbol.getVariableValue();
            ArrayDimension dimension = ((ArrayReference) atomic).getIndex();
            
            if (dimension.getIndex() != null) {
                Atomic atomicIndex = dimension.getIndex();
                Object result = decoupleAtomic(atomicIndex, id);
                if (result != null) {
                    try {
                        index = (long) result;
                    } catch (Exception e) {
                        stopExecution(getExpressionText(atomicIndex) + ", as index, must be integer line #" + getLineNumber(atomic));
                    }
                } else {
                    stopExecution(getExpressionText(atomicIndex) + " is not in the scope at line #" + getLineNumber(atomic));
                }
                
                
            }
            
            if (index < 0 || index > arrayValues.length - 1) {
                stopExecution("Index " + index + " is out of bounds for length " + arrayValues.length + getLineNumberText(atomic));
            } 
            m_return = arrayValues[(int) index];            
        } else if (atomic instanceof VariableReference) {
            Symbol symbol = lookupSymbolByAtomic(atomic, id);
            m_return = symbol.getVariableValue();
        }
        return m_return;
    }
    
    protected static Object decoupleAtomic(Atomic atomic, String id) {
        Object m_return = null; 
        if (atomic instanceof PrimitiveReference) {
            m_return = decouplePrimitiveAtomic(atomic);
        } else if(atomic instanceof Variable) {
            m_return = decoupleVariableAtomic(atomic, id);
        } else {
            stopExecution("Type of symbol <" + getExpressionText(atomic) + "> could not be recognised at line #" + getLineNumber(atomic));
        }
        return m_return;
    }
    
    private static boolean updateCallStackByArray(String target, long index, CallStackItem callStackItem, Object value) {        
        for(Symbol symbol: callStackItem.getSymbolTable().getSymbolTable()) {
            if(target.equals(symbol.getName())) {
                Object[] values = (Object[]) symbol.getVariableValue();
                try {
                values[(int) index] = value;
                symbol.setVariableValue(values);
                } catch (Exception e) {
                    System.out.println("");
                }
                return true;
            }
        }
        return false;
    }
    
    protected static String getArrayReferenceName(VariableSymbol array) {
        String name = null;
        if (array instanceof SharedVariableExpression) {
            name = ((SharedVariableExpression) array).getName();
        } else if (array instanceof ConstantVariableExpression) {
            name = ((ConstantVariableExpression) array).getName();
        } else if (array instanceof VariableDeclerationExpression) {
            name = ((VariableDeclerationExpression) array).getName();
        }
        return name;
    }
    
    protected static void updateCallStackByArray(ArrayReference array, Object value, String callerId) {
        Atomic atomicIndex = array.getIndex().getIndex();
        long index = (long) decoupleAtomic(atomicIndex, callerId);
        String target = getArrayReferenceName(array.getArrayReference());
        CallStackItem callStackItem = lookupStackItem(callerId);
        
        boolean found = updateCallStackByArray(target, index, callStackItem, value);
        
        // Update shared, in case of non-local
        if (!found) {
            callStackItem = lookupStackItem("shared");
            updateCallStackByArray(target, index, callStackItem, value);
        }
    }
    
    private static String getAtomicName(Atomic atomic) {
        String atomicName = "";
        
        if (atomic instanceof Variable) {
            if(atomic instanceof VariableReference) {
                atomicName = getVariableSymbolName(((VariableReference) atomic).getVariableReference());
            } else if(atomic instanceof ArrayReference) {
                atomicName = getVariableSymbolName(((ArrayReference) atomic).getArrayReference());
            }
        }
        
        return atomicName;
    }
    
    private static String getVariableSymbolName(VariableSymbol variableSymbol) {
        String symbolName = "";
        symbolName = variableSymbol.getName();
        return symbolName;
    }
    
    protected static Object[] generateArrayValue(String type, int size) {
        Object array[] = null;
        switch (type) {
            case "integer":
                array = new Long[size]; 
                break;
            case "float":
                array = new Float[size];
                break;
            case "string":
                array = new String[size];
                break;
            case "boolean":
                array = new Boolean[size];
                break;
        }
        return array;
    }
    
    /* Create the value of symbol with its default values by its data type */
    protected static Object generateValue(String type) {
        Object value = null;
        switch (type) {
            case "integer":
                value = 0; 
                break;
            case "float":
                value = 0.0F;
                break;
            case "string":
                value = null;
                break;
            case "boolean":
                value = false;
                break;
        }
        return value;
    }
    
    protected static void setArrayValue(Symbol symbol, int size) {
        Object array[] = null;
        switch (symbol.getType()) {
            case "integer":
                array = new Integer[size]; 
                break;
            case "float":
                array = new Float[size];
                break;
            case "string":
                array = new String[size];
                break;
            case "boolean":
                array = new Boolean[size];
                break;
        }
        symbol.setVariableValue(array);
    }

    protected static void addToSymbolTable(Symbol symbol, String id) {
        CallStackItem item = lookupStackItem(id);
        
        if (item != null) {
            SymbolTable symbolTable = item.getSymbolTable();
            symbolTable.getSymbolTable().add(symbol);
        }
    }
    
    protected static boolean checkCondition(EObject expression, String id) {
        boolean isApplicable = false;
        // TODO: make type more proper instead of hardcoded "float", it would fail in case of boolean comparision
        if (expression instanceof ComparisionExpression) {
            isApplicable = OperationExpressionExecutor.evaluateComparisionExpression((ComparisionExpression) expression, id, "float");
        }
        return isApplicable;
    }
    
    protected static void executeExpressionList(EList<EObject> body, ExpressionSwitcher executor, String id) {        
        if (body.size() > 0) {
            for (EObject bodyElement: body) {
                if (isBreak) {
                    // Check if previous element was break
                    break;
                }
                
                executor.execute(bodyElement, id);
                
                if (bodyElement instanceof NextTaskExpression) {
                    break;
                }
                
                if (isBreak) {
                    // Last executor may be break.
                    break;
                }
            }
            // Make it reset
            // isBreak = false;
        }
    }
    
    public static void stopExecution(String reason) {
        System.err.println("Error while processing, reason: " + reason);
        System.exit(0);
    }
    
    public static int getLineNumber(EObject expression) {
        INode node = NodeModelUtils.getNode(expression);
        if (node != null) {
            return node.getStartLine();            
        }
        return -1;
    }
    
    public static String getLineNumberText(EObject expression) {
        return " at line #" + getLineNumber(expression);
    }
    
    public static String getExpressionText(EObject expression) {
        INode node = NodeModelUtils.getNode(expression);
        if (node != null) {
            return node.getText();
        }
        return null;
    }
    
}
