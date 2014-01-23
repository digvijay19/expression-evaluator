package digvijag.evaluator.lib;

import java.util.HashMap;
import java.util.Map;

interface Evaluable {
    double evaluate(double leftOperand, double rightOperand);
}

public class SingleOperationEvaluator {
    Map<String, Evaluable> operationMap;

    public SingleOperationEvaluator() {
        Map<String, Evaluable> operationMap = new HashMap<String, Evaluable>();

        operationMap.put("+", new Evaluable() {
            @Override
            public double evaluate(double leftOperand, double rightOperand) {
                return leftOperand + rightOperand;
            }
        });

        operationMap.put("-", new Evaluable() {
            @Override
            public double evaluate(double leftOperand, double rightOperand) {
                return leftOperand - rightOperand;
            }
        });

        operationMap.put("*", new Evaluable() {
            @Override
            public double evaluate(double leftOperand, double rightOperand) {
                return leftOperand * rightOperand;
            }
        });

        operationMap.put("/", new Evaluable() {
            @Override
            public double evaluate(double leftOperand, double rightOperand) {
                return leftOperand / rightOperand;
            }
        });

        operationMap.put("^", new Evaluable() {
            @Override
            public double evaluate(double leftOperand, double rightOperand) {
                return Math.pow(leftOperand, rightOperand);
            }
        });

        this.operationMap = operationMap;
    }

    public double evaluateOperation(String expression) {
        String operations = "+-*/^";
        String operation = null;
        double leftOperand = 0, rightOperand = 0;
        String tempOperand;
        for (int i = 0; i < expression.length(); i++) {
            String currentCharacter = Character.toString(expression.charAt(i));
            if (operations.contains(currentCharacter)) {
                tempOperand = expression.substring(0, i).trim();
                leftOperand = Double.parseDouble(tempOperand);
                tempOperand = expression.substring(i + 1, expression.length()).trim();
                rightOperand = Double.parseDouble(tempOperand);
                operation = currentCharacter;
            }
        }
        expression = expression.trim();
        if (operation == null) return Double.parseDouble(expression);

        return operationMap.get(operation).evaluate(leftOperand, rightOperand);
    }
}