package com.home.automation;


import generated.antlr4.HomeAutomationRulesLexer;
import generated.antlr4.HomeAutomationRulesParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class HomeAutomationRuleProcessor {
    public static void main(String[] args) throws IOException {
//        String rules = """
//            IF time is 18:00 and weather is rainy THEN turn on lights
//            IF time is 07:00 and day is Monday THEN turn off alarm
//            IF day is Tuesday and weather is sunny THEN go to gym
//            IF day is Wednesday THEN don't go to office
//        """;

        String rules = new String(Files.readAllBytes(Paths.get("rules.txt")));


        HomeAutomationRulesLexer lexer = new HomeAutomationRulesLexer(CharStreams.fromString(rules));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HomeAutomationRulesParser parser = new HomeAutomationRulesParser(tokens);
        ParseTree tree = parser.rules();

        HomeAutomationRulesVisitorImpl visitor = new HomeAutomationRulesVisitorImpl();
        visitor.visit(tree);
    }
}
