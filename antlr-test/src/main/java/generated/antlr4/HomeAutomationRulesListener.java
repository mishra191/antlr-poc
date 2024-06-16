package generated.antlr4;// Generated from HomeAutomationRules.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HomeAutomationRulesParser}.
 */
public interface HomeAutomationRulesListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HomeAutomationRulesParser#rules}.
	 * @param ctx the parse tree
	 */
	void enterRules(HomeAutomationRulesParser.RulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HomeAutomationRulesParser#rules}.
	 * @param ctx the parse tree
	 */
	void exitRules(HomeAutomationRulesParser.RulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HomeAutomationRulesParser#homeRule}.
	 * @param ctx the parse tree
	 */
	void enterHomeRule(HomeAutomationRulesParser.HomeRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link HomeAutomationRulesParser#homeRule}.
	 * @param ctx the parse tree
	 */
	void exitHomeRule(HomeAutomationRulesParser.HomeRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link HomeAutomationRulesParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void enterIfCondition(HomeAutomationRulesParser.IfConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HomeAutomationRulesParser#ifCondition}.
	 * @param ctx the parse tree
	 */
	void exitIfCondition(HomeAutomationRulesParser.IfConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HomeAutomationRulesParser#condition1}.
	 * @param ctx the parse tree
	 */
	void enterCondition1(HomeAutomationRulesParser.Condition1Context ctx);
	/**
	 * Exit a parse tree produced by {@link HomeAutomationRulesParser#condition1}.
	 * @param ctx the parse tree
	 */
	void exitCondition1(HomeAutomationRulesParser.Condition1Context ctx);
	/**
	 * Enter a parse tree produced by {@link HomeAutomationRulesParser#condition2}.
	 * @param ctx the parse tree
	 */
	void enterCondition2(HomeAutomationRulesParser.Condition2Context ctx);
	/**
	 * Exit a parse tree produced by {@link HomeAutomationRulesParser#condition2}.
	 * @param ctx the parse tree
	 */
	void exitCondition2(HomeAutomationRulesParser.Condition2Context ctx);
	/**
	 * Enter a parse tree produced by {@link HomeAutomationRulesParser#thenCondition}.
	 * @param ctx the parse tree
	 */
	void enterThenCondition(HomeAutomationRulesParser.ThenConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HomeAutomationRulesParser#thenCondition}.
	 * @param ctx the parse tree
	 */
	void exitThenCondition(HomeAutomationRulesParser.ThenConditionContext ctx);
}