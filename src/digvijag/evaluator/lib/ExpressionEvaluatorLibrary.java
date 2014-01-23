package digvijag.evaluator.lib;

public class ExpressionEvaluatorLibrary {

    public int evaluate(String expression) {
        String modifiedExpression = expression;
        String singleExpression;
        SingleOperationEvaluator singleOperation = new SingleOperationEvaluator();
        String availableOperations = "+-*/^";
        int resultOfSingleOperation, resetValue = 0;
        int operationCheck = 0;
        if (modifiedExpression.contains("(")) {
            modifiedExpression = solveBrackets(expression);
        }
        for (int i = 0; i < modifiedExpression.length(); i++) {
            String currentCharacter = Character.toString(modifiedExpression.charAt(i));
            if (availableOperations.contains(currentCharacter)) {
                operationCheck++;
                if (operationCheck == 2) {
                    singleExpression = modifiedExpression.substring(0, i);
                    resultOfSingleOperation = singleOperation.evaluateOperation(singleExpression);
                    modifiedExpression = getModifiedExpression(resultOfSingleOperation, modifiedExpression, i);
                    operationCheck = resetValue;
                    i = resetValue;
                }
            }
        }
        return singleOperation.evaluateOperation(modifiedExpression);
    }

    private String solveBrackets(String expression) {
        String newExpression, expressionInBracket;
        int indexOfOpeningBracket = 0;
        int indexOfClosingBracket = 0;
        int resultOfBracket;
        for (int index = 0; index < expression.length(); index++) {
            if ('(' == expression.charAt(index)) {
                indexOfOpeningBracket = index;
            }
            if (')' == expression.charAt(index)) {
                indexOfClosingBracket = index;
            }
        }
        expressionInBracket = expression.substring(indexOfOpeningBracket + 1, indexOfClosingBracket);
        resultOfBracket = this.evaluate(expressionInBracket);
        newExpression = expression.replace('(' + expressionInBracket + ')', Integer.toString(resultOfBracket));
        return newExpression;
    }

    private String getModifiedExpression(int numberToConcat, String tempExpression, int position) {
        String one = Integer.toString(numberToConcat);
        String two = tempExpression.substring(position, tempExpression.length());
        return one + two;
    }
}