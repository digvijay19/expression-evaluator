package digvijag.evaluator.lib;

public class ExpressionEvaluatorLibrary {

    public int evaluate(String expression) {
        String modifiedExpression = expression;
        String singleExpression;
        SingleOperationEvaluator singleOperation = new SingleOperationEvaluator();
        String availableOperations = "+-*/^";
        int resultOfSingleOperation;
        int check = 0;

        for (int i = 0; i < modifiedExpression.length(); i++) {
            String currentCharacter = Character.toString(modifiedExpression.charAt(i));
            if (availableOperations.contains(currentCharacter)) {
                check++;
                if (check == 2) {
                    singleExpression = modifiedExpression.substring(0, i);
                    resultOfSingleOperation = singleOperation.evaluateOperation(singleExpression);
                    modifiedExpression = getModifiedExpression(resultOfSingleOperation, modifiedExpression, i);
                    check = 0;
                    i = 0;
                }
            }
        }
        return singleOperation.evaluateOperation(modifiedExpression);
    }

    private String getModifiedExpression(int numberToConcat, String tempExpression, int position) {
        String one = Integer.toString(numberToConcat);
        String two = tempExpression.substring(position, tempExpression.length());
        return one + two;
    }
}