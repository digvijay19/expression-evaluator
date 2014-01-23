package digvijag.evaluator.lib;

import java.util.HashMap;
import java.util.Map;

interface Evaluable {
    int evaluate(int leftOperand, int rightOperand);
}

public class SingleOperationEvaluator {
    Map<String, Evaluable> operationMap;

    public SingleOperationEvaluator() {
        Map<String, Evaluable> operationMap = new HashMap<String, Evaluable>();

        operationMap.put("+", new Evaluable() {
            @Override
            public int evaluate(int leftOperand, int rightOperand) {
                return leftOperand + rightOperand;
            }
        });

        operationMap.put("-", new Evaluable() {
            @Override
            public int evaluate(int leftOperand, int rightOperand) {
                return leftOperand - rightOperand;
            }
        });

        operationMap.put("*", new Evaluable() {
            @Override
            public int evaluate(int leftOperand, int rightOperand) {
                return leftOperand * rightOperand;
            }
        });

        operationMap.put("/", new Evaluable() {
            @Override
            public int evaluate(int leftOperand, int rightOperand) {
                return leftOperand / rightOperand;
            }
        });

        operationMap.put("^", new Evaluable() {
            @Override
            public int evaluate(int leftOperand, int rightOperand) {
                return (int) Math.pow(leftOperand, rightOperand);
            }
        });

        this.operationMap = operationMap;
    }

    public int evaluateOperation(String expression) {
        String operations = "+-*/^";
        String operation = null;
        int operand1 = 0, operand2 = 0;
        for (int i = 0; i < expression.length(); i++) {
            String currentCharacter = Character.toString(expression.charAt(i));
            if (operations.contains(currentCharacter)) {
                operand1 = Integer.parseInt(expression.substring(0, i));
                operand2 = Integer.parseInt(expression.substring(i + 1, expression.length()));
                operation = currentCharacter;
            }
        }

        if (operation == null) return Integer.parseInt(expression);

        return operationMap.get(operation).evaluate(operand1, operand2);
    }
}