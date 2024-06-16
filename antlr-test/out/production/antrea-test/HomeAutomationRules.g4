grammar HomeAutomationRules;

rules: rule+ EOF;

rule
    : ifCondition thenCondition
    ;

ifCondition
    : 'IF' 'time is' time=TIME 'and' condition
    ;

condition
    : 'weather is' weather=STRING
    | 'day is' day=STRING
    ;

thenCondition
    : 'THEN' 'turn on lights'
    | 'THEN' 'turn off alarm'
    ;

TIME: [0-2][0-9]':'[0-5][0-9];

STRING: [a-zA-Z]+;

WS: [ \t\r\n]+ -> skip;
