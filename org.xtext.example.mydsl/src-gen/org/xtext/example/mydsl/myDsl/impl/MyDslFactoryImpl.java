/**
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.example.mydsl.myDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslFactoryImpl extends EFactoryImpl implements MyDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MyDslFactory init()
  {
    try
    {
      MyDslFactory theMyDslFactory = (MyDslFactory)EPackage.Registry.INSTANCE.getEFactory(MyDslPackage.eNS_URI);
      if (theMyDslFactory != null)
      {
        return theMyDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MyDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MyDslPackage.INK_APP: return createInkApp();
      case MyDslPackage.BREAK_EXPRESSION: return createBreakExpression();
      case MyDslPackage.VARIABLE_TYPE: return createVariableType();
      case MyDslPackage.GLOBAL_VARIABLE_EXPRESSION: return createGlobalVariableExpression();
      case MyDslPackage.ENTRY_TASK: return createEntryTask();
      case MyDslPackage.TASK: return createTask();
      case MyDslPackage.IF_EXPRESSION: return createIfExpression();
      case MyDslPackage.FOR_EXPRESSION: return createForExpression();
      case MyDslPackage.WHILE_EXPRESSION: return createWhileExpression();
      case MyDslPackage.BUILTIN_FUNCTION_CALL_EXPRESSION: return createBuiltinFunctionCallExpression();
      case MyDslPackage.TASK_BODY: return createTaskBody();
      case MyDslPackage.STATEMENT_BODY: return createStatementBody();
      case MyDslPackage.BLOCK_EXPRESSIONS: return createBlockExpressions();
      case MyDslPackage.EXPRESSION: return createExpression();
      case MyDslPackage.OPERATION_EXPRESSION: return createOperationExpression();
      case MyDslPackage.ARRAY_DIMENSION: return createArrayDimension();
      case MyDslPackage.VARIABLE_DECLERATION_EXPRESSION: return createVariableDeclerationExpression();
      case MyDslPackage.VARIABLE_SYMBOL: return createVariableSymbol();
      case MyDslPackage.ATOMIC: return createAtomic();
      case MyDslPackage.OPERATION: return createOperation();
      case MyDslPackage.INTEGER_REFERENCE: return createIntegerReference();
      case MyDslPackage.DOUBLE_REFERENCE: return createDoubleReference();
      case MyDslPackage.STRING_REFERENCE: return createStringReference();
      case MyDslPackage.BOOLEAN_REFERENCE: return createBooleanReference();
      case MyDslPackage.ARRAY_REFERENCE: return createArrayReference();
      case MyDslPackage.VARIABLE_REFERENCE: return createVariableReference();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public InkApp createInkApp()
  {
    InkAppImpl inkApp = new InkAppImpl();
    return inkApp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BreakExpression createBreakExpression()
  {
    BreakExpressionImpl breakExpression = new BreakExpressionImpl();
    return breakExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VariableType createVariableType()
  {
    VariableTypeImpl variableType = new VariableTypeImpl();
    return variableType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GlobalVariableExpression createGlobalVariableExpression()
  {
    GlobalVariableExpressionImpl globalVariableExpression = new GlobalVariableExpressionImpl();
    return globalVariableExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EntryTask createEntryTask()
  {
    EntryTaskImpl entryTask = new EntryTaskImpl();
    return entryTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Task createTask()
  {
    TaskImpl task = new TaskImpl();
    return task;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IfExpression createIfExpression()
  {
    IfExpressionImpl ifExpression = new IfExpressionImpl();
    return ifExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ForExpression createForExpression()
  {
    ForExpressionImpl forExpression = new ForExpressionImpl();
    return forExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public WhileExpression createWhileExpression()
  {
    WhileExpressionImpl whileExpression = new WhileExpressionImpl();
    return whileExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BuiltinFunctionCallExpression createBuiltinFunctionCallExpression()
  {
    BuiltinFunctionCallExpressionImpl builtinFunctionCallExpression = new BuiltinFunctionCallExpressionImpl();
    return builtinFunctionCallExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TaskBody createTaskBody()
  {
    TaskBodyImpl taskBody = new TaskBodyImpl();
    return taskBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StatementBody createStatementBody()
  {
    StatementBodyImpl statementBody = new StatementBodyImpl();
    return statementBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BlockExpressions createBlockExpressions()
  {
    BlockExpressionsImpl blockExpressions = new BlockExpressionsImpl();
    return blockExpressions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OperationExpression createOperationExpression()
  {
    OperationExpressionImpl operationExpression = new OperationExpressionImpl();
    return operationExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArrayDimension createArrayDimension()
  {
    ArrayDimensionImpl arrayDimension = new ArrayDimensionImpl();
    return arrayDimension;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VariableDeclerationExpression createVariableDeclerationExpression()
  {
    VariableDeclerationExpressionImpl variableDeclerationExpression = new VariableDeclerationExpressionImpl();
    return variableDeclerationExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VariableSymbol createVariableSymbol()
  {
    VariableSymbolImpl variableSymbol = new VariableSymbolImpl();
    return variableSymbol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Atomic createAtomic()
  {
    AtomicImpl atomic = new AtomicImpl();
    return atomic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Operation createOperation()
  {
    OperationImpl operation = new OperationImpl();
    return operation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IntegerReference createIntegerReference()
  {
    IntegerReferenceImpl integerReference = new IntegerReferenceImpl();
    return integerReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DoubleReference createDoubleReference()
  {
    DoubleReferenceImpl doubleReference = new DoubleReferenceImpl();
    return doubleReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StringReference createStringReference()
  {
    StringReferenceImpl stringReference = new StringReferenceImpl();
    return stringReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BooleanReference createBooleanReference()
  {
    BooleanReferenceImpl booleanReference = new BooleanReferenceImpl();
    return booleanReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArrayReference createArrayReference()
  {
    ArrayReferenceImpl arrayReference = new ArrayReferenceImpl();
    return arrayReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VariableReference createVariableReference()
  {
    VariableReferenceImpl variableReference = new VariableReferenceImpl();
    return variableReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MyDslPackage getMyDslPackage()
  {
    return (MyDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MyDslPackage getPackage()
  {
    return MyDslPackage.eINSTANCE;
  }

} //MyDslFactoryImpl
