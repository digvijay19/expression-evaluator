package digvijag.evaluator.cli;

import digvijag.evaluator.lib.ExpressionEvaluatorLibrary;

public class ExpressionEvaluator {
    public static void main(String[] args) {
        String expression = args[0];
        int result = new ExpressionEvaluatorLibrary().evaluate(expression);
        System.out.println(result);
    }
}