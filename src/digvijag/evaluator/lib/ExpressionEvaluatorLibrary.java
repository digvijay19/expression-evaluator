package digvijag.evaluator.lib;

public class ExpressionEvaluatorLibrary {
    int numberOne, numberTwo, result;

    private int evaluateSingleOperation(String expression) {
        for (int i = 0; i < expression.length(); i++) {
            if ('+' == expression.charAt(i)) {
                numberOne = Integer.parseInt(expression.substring(0, i));
                numberTwo = Integer.parseInt(expression.substring(i + 1, expression.length()));
                result = numberOne + numberTwo;
                return result;
            }
            if ('-' == expression.charAt(i)) {
                numberOne = Integer.parseInt(expression.substring(0, i));
                numberTwo = Integer.parseInt(expression.substring(i + 1, expression.length()));
                result = numberOne - numberTwo;
                return result;
            }
            if ('*' == expression.charAt(i)) {
                numberOne = Integer.parseInt(expression.substring(0, i));
                numberTwo = Integer.parseInt(expression.substring(i + 1, expression.length()));
                result = numberOne * numberTwo;
                return result;
            }
            if ('/' == expression.charAt(i)) {
                numberOne = Integer.parseInt(expression.substring(0, i));
                numberTwo = Integer.parseInt(expression.substring(i + 1, expression.length()));
                result = numberOne / numberTwo;
                return result;
            }
            if ('^' == expression.charAt(i)) {
                result = 1;
                numberOne = Integer.parseInt(expression.substring(0, i));
                numberTwo = Integer.parseInt(expression.substring(i + 1, expression.length()));
                for (int j = 0; j < numberTwo; j++) {
                    result *= numberOne;
                }
                return result;
            }
        }
        return Integer.parseInt(expression);
    }

    public int evaluate(String expression) {
        String tempExpression = expression;
        String singleExpression ;
        int resultOfSingleOperation;
        int check = 0;
        for (int i = 1; i < tempExpression.length(); i++) {
            if ('+' == tempExpression.charAt(i)) {
                check++;
                if(check > 1){
                    singleExpression = tempExpression.substring(0, i);
                    resultOfSingleOperation = this.evaluateSingleOperation(singleExpression);
                    tempExpression = Integer.toString(resultOfSingleOperation) + tempExpression.substring(i,tempExpression.length());
                }
            }
        }
        return this.evaluateSingleOperation(tempExpression);
    }
}