Expression-Evaluator
====================
expression-evaluator evaluates the given expression.

### How do get Start with it.
* Clone this repository on your machine.
* Build the project using ant tools.
* Extract the "expression-evaluator.zip".
* Set the environment variable with the name of `EVALUATOR_HOME`.
* Use shell file to run evaluator.

### Release 0.1 :-

* The expression takes one operation `( + , - , * , / , ^ )` and two operands
* Do not support brackets `()`.
* No spaces will be allowed in the expression.
* Only positive Integers will be supported.

#### expression-evaluator :

* use `expression-evaluator.sh` file to run this evaluator.
* This shell file takes one argument which is expression.
```
eg:- expression-evaluator.sh '3+2'
will give answer 5.
```