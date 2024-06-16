
/*
 *
      IF time is 18:00 and weather is rainy THEN turn on lights
      IF time is 07:00 and day is Monday THEN turn off alarm
      IF day is Tuesday and weather is sunny THEN go to gym
      IF day is Wednesday THEN don't go to office
 */


grammar HomeAutomationRules;

rules: homeRule+ EOF;

homeRule
    : ifCondition thenCondition
    ;

ifCondition
    : 'IF' 'time is' time=TIME 'and' condition1
    | 'IF' 'time is' time=TIME 'and' condition2
    | 'IF' 'day is' day=STRING 'and' condition1
    | 'IF' 'day is' day=STRING
    ;

condition1
    : 'weather is' weather=STRING
    ;

condition2
    : 'day is' day=STRING
    ;

thenCondition
    : 'THEN' 'turn on lights'
    | 'THEN' 'turn off alarm'
    | 'THEN' 'go to gym'
    | 'THEN' 'don\'t go to office'
    ;

TIME: [0-2][0-9]':'[0-5][0-9];

STRING: [a-zA-Z]+;

WS: [ \t\r\n]+ -> skip;
