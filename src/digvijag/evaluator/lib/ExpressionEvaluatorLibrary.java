package digvijag.evaluator.lib;

public class ExpressionEvaluatorLibrary {

    public double evaluate(String expression) {
        String modifiedExpression = expression;

        if (modifiedExpression.contains("(")) {
            modifiedExpression = evaluateExpressionWithBrackets(expression);
            return evaluate(modifiedExpression);
        }

        return evaluateExpression(expression);
    }

    private double evaluateExpression(String expression) {
        String modifiedExpression;
        String availableOperations = "+-*/^";
        Double resultOfSingleOperation;
        int resetValue = 0;
        int operationCheck = 0;
        SingleOperationEvaluator singleOperation = new SingleOperationEvaluator();
        modifiedExpression = getExpressionWithoutSpacesForSignedNumbers(expression);
        for (int i = 1; i < modifiedExpression.length(); i++) {
            String singleOperationExpression;
            String currentCharacter = Character.toString(modifiedExpression.charAt(i));
            if (availableOperations.contains(currentCharacter)) {
                operationCheck++;
                if (operationCheck == 2) {
                    singleOperationExpression = modifiedExpression.substring(0, i);
                    resultOfSingleOperation = singleOperation.evaluateOperation(singleOperationExpression);
                    modifiedExpression = getModifiedExpression(resultOfSingleOperation, modifiedExpression, i);
                    operationCheck = resetValue;
                    i = resetValue;
                }
                i++;
            }
        }
        return singleOperation.evaluateOperation(modifiedExpression);
    }

    private String getExpressionWithoutSpacesForSignedNumbers(String expression) {
        return expression.replaceAll(" +", " ")
                .replaceAll(" -", "-")
                .replaceAll("- ", "-");
    }

    private String evaluateExpressionWithBrackets(String expression) {
        String newExpression, expressionInBracket;
        int indexOfOpeningBracket = 0;
        int indexOfClosingBracket = 0;
        double resultOfBracket;
        for (int index = 0; index < expression.length(); index++) {
            if ('(' == expression.charAt(index)) {
                indexOfOpeningBracket = index;
            }
            if (')' == expression.charAt(index)) {
                indexOfClosingBracket = index;
                break;
            }
        }
        expressionInBracket = expression.substring(indexOfOpeningBracket + 1, indexOfClosingBracket);
        resultOfBracket = this.evaluate(expressionInBracket);
        newExpression = expression.replace('(' + expressionInBracket + ')', " " + Double.toString(resultOfBracket));
        return newExpression;
    }

    private String getModifiedExpression(Double numberToConcat, String tempExpression, int position) {
        String one = Double.toString(numberToConcat);
        String two = tempExpression.substring(position, tempExpression.length());
        return one + two;
    }
}