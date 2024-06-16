// Generated from HomeAutomationRules.g4 by ANTLR 4.9.2

package generated.antlr4;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HomeAutomationRulesParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HomeAutomationRulesVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HomeAutomationRulesParser#rules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRules(HomeAutomationRulesParser.RulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HomeAutomationRulesParser#homeRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHomeRule(HomeAutomationRulesParser.HomeRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link HomeAutomationRulesParser#ifCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfCondition(HomeAutomationRulesParser.IfConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HomeAutomationRulesParser#condition1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition1(HomeAutomationRulesParser.Condition1Context ctx);
	/**
	 * Visit a parse tree produced by {@link HomeAutomationRulesParser#condition2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition2(HomeAutomationRulesParser.Condition2Context ctx);
	/**
	 * Visit a parse tree produced by {@link HomeAutomationRulesParser#thenCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThenCondition(HomeAutomationRulesParser.ThenConditionContext ctx);
}