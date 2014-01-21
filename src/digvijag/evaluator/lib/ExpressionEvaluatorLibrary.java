package digvijag.evaluator.lib;

public class ExpressionEvaluatorLibrary {
    String expression = "";
    int numberOne, numberTwo, result;

    public int evaluate(String expression) {
        this.expression = expression;
        for (int i = 0; i < expression.length(); i++) {
            if ('+' == expression.charAt(i)) {
                numberOne = Integer.parseInt(expression.substring(0, i));
                numberTwo = Integer.parseInt(expression.substring(i, expression.length()));
                result = numberOne + numberTwo;
            }
            if ('-' == expression.charAt(i)) {
                numberOne = Integer.parseInt(expression.substring(0, i));
                numberTwo = Integer.parseInt(expression.substring(i, expression.length()));
                result = numberOne + numberTwo;
            }
        }
        return result;
    }
}