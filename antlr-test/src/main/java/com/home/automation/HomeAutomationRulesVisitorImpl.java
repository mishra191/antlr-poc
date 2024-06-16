package com.home.automation;


import generated.antlr4.HomeAutomationRulesBaseVisitor;
import generated.antlr4.HomeAutomationRulesParser;

public class HomeAutomationRulesVisitorImpl extends HomeAutomationRulesBaseVisitor<Void> {

    @Override
    public Void visitHomeRule(HomeAutomationRulesParser.HomeRuleContext ctx)
    {
        String time = "";
        String condition = "";

        if (ctx.ifCondition().time !=null){
            time = ctx.ifCondition().time.getText();
        }


//        if (ctx.ifCondition().condition().weather != null) {

//            condition = "Weather is " + ctx.ifCondition().condition().weather.getText();
//        } else {
//            condition = "Day is " + ctx.ifCondition().condition().day.getText();
//        }

//        thenCondition
//        : 'THEN' 'turn on lights'
//                | 'THEN' 'turn off alarm'
//                | 'THEN' 'go to gym'
//                | 'THEN' 'don\'t go to office'
//        ;

        if (ctx.ifCondition().condition1() !=null && ctx.ifCondition().condition1().weather !=null) {
            condition = "Weather is " + ctx.ifCondition().condition1().weather.getText();
        }

        else if (ctx.ifCondition().condition2() !=null && ctx.ifCondition().condition2().day!=null) {
            condition = "Day is " + ctx.ifCondition().condition2().day.getText();
        }
        String action;

        if (ctx.thenCondition().getText().contains("turn on lights")) {
            action = "Turn on lights";
        }
        else if (ctx.thenCondition().getText().contains("turn off alarm")) {
            action = "Turn off alarm";
        }
        else if (ctx.thenCondition().getText().contains("go to gym")) {
            action = "go to gym";
        }
        else {
            action = "don\'t go to office";
        }

        System.out.println("Rule detected:");
        System.out.println("Time: " + time);
        System.out.println("Condition: " + condition);
        System.out.println("Action: " + action);

        return null;
    }
}
