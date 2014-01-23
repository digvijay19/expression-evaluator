Expression-Evaluator
====================
expression-evaluator evaluates the given expression.

### How do get Start with it.
* Clone this repository on your machine.
* Build the project using ant tools.
* Extract the "expression-evaluator.zip".
* Set the environment variable with the name of `EVALUATOR_HOME`.
* Use shell file to run evaluator.

### Release 0.4 :-
* This release can handle multiple spaces in the operands and operations. `eg:- "3 + 2"`
* Work with spaces or no spaces. `eg:- "3-2 + 1"`
* Also handles spaces between brackets. `eg:- " ( 4 + 2 ) "`
* Operations available are `( + , - , * , / , ^ )`
* Give expression in quotes( "" / '' ) on commandline when expression contains spaces `eg :- "3 + 2" `.
* Only unsigned Integers will be supported.
* May not give proper result when result exceeds Integer type limit.`eg:- 2^31`
* If the result of Division is in floating type, result will be parsed in Integer.

### Release 0.3 :-
* This release can handle expression with brackets `(3+2)`.
* Evaluator can evaluate multiple,nested brackets `eg:- (3+2*(3-1))+(1-1)`
* Operations available are `( + , - , * , / , ^ )`
* No spaces will be allowed in the expression.
* Only positive Integers will be supported.
* May not give proper result when result exceeds Integer type limit.`eg:- 2^31`
* If the result of Division is in floating type, result will be parsed in Integer.

### Release 0.2 :-

* The expression can evaluate multiple operations.
    `eg :- 2+3*2`
* Operations available are `( + , - , * , / , ^ )`
* Does not support brackets `()`.
* No spaces will be allowed in the expression.
* Only positive Integers will be supported.
* May not give proper result when result exceeds Integer type limit.`eg:- 2^31`
* If the result of Division is in floating type, result will be parsed in Integer.

### Release 0.1 :-

* The expression takes one operation `( + , - , * , / , ^ )` and two operands
* Does not support brackets `()`.
* No spaces will be allowed in the expression.
* Only positive Integers will be supported.
* May not give proper result when result exceeds Integer type limit.`eg:- 2^31`
* If the result of Division is in floating type, result will be parsed in Integer.

#### expression-evaluator :

* use `expression-evaluator.sh` file to run this evaluator.
* This shell file takes one argument which is expression.
```
eg:- expression-evaluator.sh '3+2'
will give answer 5.
```