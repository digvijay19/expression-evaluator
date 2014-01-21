expression-evaluator
====================
expression-evaluator evaluates the given expression.

### How do get Start with it.
* Clone this repository on your machine.
* Build the project using ant tools.
* Extract the "expression-evaluator.zip".
* Set the environment variable with the name of `EVALUATOR_HOME`.
* Use shell file to run evaluator.

### How to use evaluator and what precautions must be taken.

* The expression takes one operation `(+,-,*,/,^)` and two operands(Do not use brackets `()`).
* No spaces will be allowed in the expression.
* Only positive Integers will be supported.
```
eg :- 3+2
```

#### expression-evaluator :

* use `expression-evaluator.sh` file to run this evaluator.
* This shell file takes one argument which is expression.
```
eg:- expression-evaluator.sh '3+2'
will give 5 as answer.
```