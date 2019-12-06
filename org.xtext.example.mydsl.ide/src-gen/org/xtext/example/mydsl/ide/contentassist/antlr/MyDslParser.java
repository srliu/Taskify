/*
 * generated by Xtext 2.19.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getOperatorAccess().getAlternatives(), "rule__Operator__Alternatives");
			builder.put(grammarAccess.getVariableTypeAccess().getAlternatives(), "rule__VariableType__Alternatives");
			builder.put(grammarAccess.getTaskAccess().getAlternatives_5(), "rule__Task__Alternatives_5");
			builder.put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
			builder.put(grammarAccess.getArrayDimensionAccess().getAlternatives_2(), "rule__ArrayDimension__Alternatives_2");
			builder.put(grammarAccess.getVariableDeclerationAccess().getAlternatives_1(), "rule__VariableDecleration__Alternatives_1");
			builder.put(grammarAccess.getVariableSymbolAccess().getAlternatives(), "rule__VariableSymbol__Alternatives");
			builder.put(grammarAccess.getAtomicAccess().getAlternatives(), "rule__Atomic__Alternatives");
			builder.put(grammarAccess.getAtomicOrFunctionCallAccess().getAlternatives(), "rule__AtomicOrFunctionCall__Alternatives");
			builder.put(grammarAccess.getAbstractFunctionCallAccess().getAlternatives(), "rule__AbstractFunctionCall__Alternatives");
			builder.put(grammarAccess.getInkAppAccess().getGroup(), "rule__InkApp__Group__0");
			builder.put(grammarAccess.getBreakAccess().getGroup(), "rule__Break__Group__0");
			builder.put(grammarAccess.getVariableTypeAccess().getGroup_0(), "rule__VariableType__Group_0__0");
			builder.put(grammarAccess.getVariableTypeAccess().getGroup_1(), "rule__VariableType__Group_1__0");
			builder.put(grammarAccess.getVariableTypeAccess().getGroup_2(), "rule__VariableType__Group_2__0");
			builder.put(grammarAccess.getGlobalVariableAccess().getGroup(), "rule__GlobalVariable__Group__0");
			builder.put(grammarAccess.getMainAccess().getGroup(), "rule__Main__Group__0");
			builder.put(grammarAccess.getFunctionBodyAccess().getGroup(), "rule__FunctionBody__Group__0");
			builder.put(grammarAccess.getEntryTaskAccess().getGroup(), "rule__EntryTask__Group__0");
			builder.put(grammarAccess.getTaskAccess().getGroup(), "rule__Task__Group__0");
			builder.put(grammarAccess.getTaskAccess().getGroup_5_0(), "rule__Task__Group_5_0__0");
			builder.put(grammarAccess.getIfExpressionAccess().getGroup(), "rule__IfExpression__Group__0");
			builder.put(grammarAccess.getIfExpressionAccess().getGroup_8(), "rule__IfExpression__Group_8__0");
			builder.put(grammarAccess.getIfExpressionAccess().getGroup_9(), "rule__IfExpression__Group_9__0");
			builder.put(grammarAccess.getForExpressionAccess().getGroup(), "rule__ForExpression__Group__0");
			builder.put(grammarAccess.getWhileExpressionAccess().getGroup(), "rule__WhileExpression__Group__0");
			builder.put(grammarAccess.getOperationAccess().getGroup(), "rule__Operation__Group__0");
			builder.put(grammarAccess.getOperationAccess().getGroup_1(), "rule__Operation__Group_1__0");
			builder.put(grammarAccess.getOperationAccess().getGroup_1_1(), "rule__Operation__Group_1_1__0");
			builder.put(grammarAccess.getArrayDimensionAccess().getGroup(), "rule__ArrayDimension__Group__0");
			builder.put(grammarAccess.getVariableDeclerationAccess().getGroup(), "rule__VariableDecleration__Group__0");
			builder.put(grammarAccess.getVariableDeclerationAccess().getGroup_1_1(), "rule__VariableDecleration__Group_1_1__0");
			builder.put(grammarAccess.getFunctionParameterAccess().getGroup(), "rule__FunctionParameter__Group__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_0(), "rule__Atomic__Group_0__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_1(), "rule__Atomic__Group_1__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_2(), "rule__Atomic__Group_2__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_3(), "rule__Atomic__Group_3__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_4(), "rule__Atomic__Group_4__0");
			builder.put(grammarAccess.getAtomicAccess().getGroup_5(), "rule__Atomic__Group_5__0");
			builder.put(grammarAccess.getVariableReturnAccess().getGroup(), "rule__VariableReturn__Group__0");
			builder.put(grammarAccess.getFunctionDefinitionAccess().getGroup(), "rule__FunctionDefinition__Group__0");
			builder.put(grammarAccess.getFunctionDefinitionAccess().getGroup_4(), "rule__FunctionDefinition__Group_4__0");
			builder.put(grammarAccess.getFunctionDefinitionAccess().getGroup_4_1(), "rule__FunctionDefinition__Group_4_1__0");
			builder.put(grammarAccess.getFunctionCallAccess().getGroup(), "rule__FunctionCall__Group__0");
			builder.put(grammarAccess.getFunctionCallAccess().getGroup_3(), "rule__FunctionCall__Group_3__0");
			builder.put(grammarAccess.getFunctionCallAccess().getGroup_3_1(), "rule__FunctionCall__Group_3_1__0");
			builder.put(grammarAccess.getBuiltinFunctionCallAccess().getGroup(), "rule__BuiltinFunctionCall__Group__0");
			builder.put(grammarAccess.getBuiltinFunctionCallAccess().getGroup_3(), "rule__BuiltinFunctionCall__Group_3__0");
			builder.put(grammarAccess.getBuiltinFunctionCallAccess().getGroup_3_1(), "rule__BuiltinFunctionCall__Group_3_1__0");
			builder.put(grammarAccess.getInkAppAccess().getGlobalsAssignment_0(), "rule__InkApp__GlobalsAssignment_0");
			builder.put(grammarAccess.getInkAppAccess().getTasksAssignment_1(), "rule__InkApp__TasksAssignment_1");
			builder.put(grammarAccess.getInkAppAccess().getEntryAssignment_2(), "rule__InkApp__EntryAssignment_2");
			builder.put(grammarAccess.getBreakAccess().getBreakAssignment_1(), "rule__Break__BreakAssignment_1");
			builder.put(grammarAccess.getGlobalVariableAccess().getVariableAssignment_2(), "rule__GlobalVariable__VariableAssignment_2");
			builder.put(grammarAccess.getMainAccess().getVariableDeclerationsAssignment_1(), "rule__Main__VariableDeclerationsAssignment_1");
			builder.put(grammarAccess.getMainAccess().getBodyAssignment_2(), "rule__Main__BodyAssignment_2");
			builder.put(grammarAccess.getFunctionBodyAccess().getVariableDeclerationsAssignment_1(), "rule__FunctionBody__VariableDeclerationsAssignment_1");
			builder.put(grammarAccess.getFunctionBodyAccess().getBodyAssignment_2(), "rule__FunctionBody__BodyAssignment_2");
			builder.put(grammarAccess.getEntryTaskAccess().getTaskAssignment_1(), "rule__EntryTask__TaskAssignment_1");
			builder.put(grammarAccess.getTaskAccess().getNameAssignment_1(), "rule__Task__NameAssignment_1");
			builder.put(grammarAccess.getTaskAccess().getBodyAssignment_3(), "rule__Task__BodyAssignment_3");
			builder.put(grammarAccess.getTaskAccess().getBodyAssignment_4(), "rule__Task__BodyAssignment_4");
			builder.put(grammarAccess.getTaskAccess().getTaskAssignment_5_0_1(), "rule__Task__TaskAssignment_5_0_1");
			builder.put(grammarAccess.getIfExpressionAccess().getIfconditionAssignment_2(), "rule__IfExpression__IfconditionAssignment_2");
			builder.put(grammarAccess.getIfExpressionAccess().getIfbodyAssignment_5(), "rule__IfExpression__IfbodyAssignment_5");
			builder.put(grammarAccess.getIfExpressionAccess().getIfbodyAssignment_6(), "rule__IfExpression__IfbodyAssignment_6");
			builder.put(grammarAccess.getIfExpressionAccess().getElseconditionAssignment_8_3(), "rule__IfExpression__ElseconditionAssignment_8_3");
			builder.put(grammarAccess.getIfExpressionAccess().getElseifbodyAssignment_8_6(), "rule__IfExpression__ElseifbodyAssignment_8_6");
			builder.put(grammarAccess.getIfExpressionAccess().getElseifbodyAssignment_8_7(), "rule__IfExpression__ElseifbodyAssignment_8_7");
			builder.put(grammarAccess.getIfExpressionAccess().getElsebodyAssignment_9_2(), "rule__IfExpression__ElsebodyAssignment_9_2");
			builder.put(grammarAccess.getIfExpressionAccess().getElseifbodyAssignment_9_3(), "rule__IfExpression__ElseifbodyAssignment_9_3");
			builder.put(grammarAccess.getForExpressionAccess().getInitialAssignment_2(), "rule__ForExpression__InitialAssignment_2");
			builder.put(grammarAccess.getForExpressionAccess().getTestAssignment_4(), "rule__ForExpression__TestAssignment_4");
			builder.put(grammarAccess.getForExpressionAccess().getUpdateAssignment_6(), "rule__ForExpression__UpdateAssignment_6");
			builder.put(grammarAccess.getForExpressionAccess().getBodyAssignment_9(), "rule__ForExpression__BodyAssignment_9");
			builder.put(grammarAccess.getForExpressionAccess().getBodyAssignment_10(), "rule__ForExpression__BodyAssignment_10");
			builder.put(grammarAccess.getWhileExpressionAccess().getTestAssignment_2(), "rule__WhileExpression__TestAssignment_2");
			builder.put(grammarAccess.getWhileExpressionAccess().getBodyAssignment_5(), "rule__WhileExpression__BodyAssignment_5");
			builder.put(grammarAccess.getWhileExpressionAccess().getBodyAssignment_6(), "rule__WhileExpression__BodyAssignment_6");
			builder.put(grammarAccess.getOperationAccess().getOperatorAssignment_1_1_0(), "rule__Operation__OperatorAssignment_1_1_0");
			builder.put(grammarAccess.getOperationAccess().getRightAssignment_1_1_1(), "rule__Operation__RightAssignment_1_1_1");
			builder.put(grammarAccess.getArrayDimensionAccess().getIndexAssignment_2_0(), "rule__ArrayDimension__IndexAssignment_2_0");
			builder.put(grammarAccess.getArrayDimensionAccess().getSizeAssignment_2_1(), "rule__ArrayDimension__SizeAssignment_2_1");
			builder.put(grammarAccess.getVariableDeclerationAccess().getTypeAssignment_0(), "rule__VariableDecleration__TypeAssignment_0");
			builder.put(grammarAccess.getVariableDeclerationAccess().getNameAssignment_1_0(), "rule__VariableDecleration__NameAssignment_1_0");
			builder.put(grammarAccess.getVariableDeclerationAccess().getNameAssignment_1_1_0(), "rule__VariableDecleration__NameAssignment_1_1_0");
			builder.put(grammarAccess.getVariableDeclerationAccess().getDimensionAssignment_1_1_1(), "rule__VariableDecleration__DimensionAssignment_1_1_1");
			builder.put(grammarAccess.getFunctionParameterAccess().getTypeAssignment_0(), "rule__FunctionParameter__TypeAssignment_0");
			builder.put(grammarAccess.getFunctionParameterAccess().getNameAssignment_1(), "rule__FunctionParameter__NameAssignment_1");
			builder.put(grammarAccess.getAtomicAccess().getValueAssignment_0_1(), "rule__Atomic__ValueAssignment_0_1");
			builder.put(grammarAccess.getAtomicAccess().getValueAssignment_1_1(), "rule__Atomic__ValueAssignment_1_1");
			builder.put(grammarAccess.getAtomicAccess().getValueAssignment_2_1(), "rule__Atomic__ValueAssignment_2_1");
			builder.put(grammarAccess.getAtomicAccess().getValueAssignment_3_1(), "rule__Atomic__ValueAssignment_3_1");
			builder.put(grammarAccess.getAtomicAccess().getVariableReferenceAssignment_4_1(), "rule__Atomic__VariableReferenceAssignment_4_1");
			builder.put(grammarAccess.getAtomicAccess().getDimensionAssignment_4_2(), "rule__Atomic__DimensionAssignment_4_2");
			builder.put(grammarAccess.getAtomicAccess().getVariableReferenceAssignment_5_1(), "rule__Atomic__VariableReferenceAssignment_5_1");
			builder.put(grammarAccess.getVariableReturnAccess().getReturnAssignment_1(), "rule__VariableReturn__ReturnAssignment_1");
			builder.put(grammarAccess.getFunctionDefinitionAccess().getReturnAssignment_1(), "rule__FunctionDefinition__ReturnAssignment_1");
			builder.put(grammarAccess.getFunctionDefinitionAccess().getNameAssignment_2(), "rule__FunctionDefinition__NameAssignment_2");
			builder.put(grammarAccess.getFunctionDefinitionAccess().getParametersAssignment_4_0(), "rule__FunctionDefinition__ParametersAssignment_4_0");
			builder.put(grammarAccess.getFunctionDefinitionAccess().getParametersAssignment_4_1_1(), "rule__FunctionDefinition__ParametersAssignment_4_1_1");
			builder.put(grammarAccess.getFunctionDefinitionAccess().getBodyAssignment_7(), "rule__FunctionDefinition__BodyAssignment_7");
			builder.put(grammarAccess.getFunctionCallAccess().getFunctionAssignment_1(), "rule__FunctionCall__FunctionAssignment_1");
			builder.put(grammarAccess.getFunctionCallAccess().getParametersAssignment_3_0(), "rule__FunctionCall__ParametersAssignment_3_0");
			builder.put(grammarAccess.getFunctionCallAccess().getParametersAssignment_3_1_1(), "rule__FunctionCall__ParametersAssignment_3_1_1");
			builder.put(grammarAccess.getBuiltinFunctionCallAccess().getFunctionAssignment_1(), "rule__BuiltinFunctionCall__FunctionAssignment_1");
			builder.put(grammarAccess.getBuiltinFunctionCallAccess().getParametersAssignment_3_0(), "rule__BuiltinFunctionCall__ParametersAssignment_3_0");
			builder.put(grammarAccess.getBuiltinFunctionCallAccess().getParametersAssignment_3_1_1(), "rule__BuiltinFunctionCall__ParametersAssignment_3_1_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyDslGrammarAccess grammarAccess;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}