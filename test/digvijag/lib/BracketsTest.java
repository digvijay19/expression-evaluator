package digvijag.lib;

import digvijag.evaluator.lib.ExpressionEvaluatorLibrary;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class BracketsTest {
    @Test
    public void test_solve_expression_with_single_bracket() {
        ExpressionEvaluatorLibrary evaluator = new ExpressionEvaluatorLibrary();
        int expected = 5;
        int actual = (int) evaluator.evaluate("(3+2)");
        assertEquals(expected, actual);
    }

    @Test
    public void test_solve_expression_with_two_brackets() {
        ExpressionEvaluatorLibrary evaluator = new ExpressionEvaluatorLibrary();
        int expected = 10;
        int actual = (int) evaluator.evaluate("(3+2)+(3+2)");
        assertEquals(expected, actual);
    }

    @Test
    public void test_solve_expression_solves_brackets_first() {
        ExpressionEvaluatorLibrary evaluator = new ExpressionEvaluatorLibrary();
        int expected = 13;
        int actual = (int) evaluator.evaluate("3+(5*2)");
        assertEquals(expected, actual);
    }

    @Test
    public void test_solve_expression_solves_nested_brackets() {
        ExpressionEvaluatorLibrary evaluator = new ExpressionEvaluatorLibrary();
        int expected = 10;
        int actual = (int) evaluator.evaluate("(3+(5+2))");
        assertEquals(expected, actual);
    }

    @Test
    public void test_solve_expression_solves_multiple_nested_brackets() {
        ExpressionEvaluatorLibrary evaluator = new ExpressionEvaluatorLibrary();
        int expected = 7;
        int actual = (int) evaluator.evaluate("(3+(2+1)+(1))");
        assertEquals(expected, actual);
    }

    @Test(expected = NumberFormatException.class)
    public void test_throws_exception_when_no_operation_provided() {
        ExpressionEvaluatorLibrary evaluator = new ExpressionEvaluatorLibrary();
        int actual = (int) evaluator.evaluate("3(3)");
        System.out.println(actual);
    }
}
