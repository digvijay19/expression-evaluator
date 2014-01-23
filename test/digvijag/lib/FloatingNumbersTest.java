package digvijag.lib;

import digvijag.evaluator.lib.ExpressionEvaluatorLibrary;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class FloatingNumbersTest {

    @Test
    public void test_floating_number_addition() {
        ExpressionEvaluatorLibrary evaluator = new ExpressionEvaluatorLibrary();
        double expected = 3.1;
        double actual = evaluator.evaluate("2.0+1.1");
        assertEquals(expected, actual);
    }

    @Test
    public void test_floating_number_subtraction() {
        ExpressionEvaluatorLibrary evaluator = new ExpressionEvaluatorLibrary();
        double expected = 1.1;
        double actual = evaluator.evaluate("2.1-1.0");
        assertEquals(expected, actual);
    }

    @Test
    public void test_division_where_answer_is_floating() {
        ExpressionEvaluatorLibrary evaluator = new ExpressionEvaluatorLibrary();
        double expected = 7.333333333333333;
        double actual = evaluator.evaluate("22/3");
        assertEquals(expected, actual);
    }

    @Test
    public void test_multiple_operations_with_floating_numbers() {
        ExpressionEvaluatorLibrary evaluator = new ExpressionEvaluatorLibrary();
        double expected = 4.2;
        double actual = evaluator.evaluate("2.1+3.1-1.0");
        assertEquals(expected, actual);
    }

    @Test
    public void test_floating_numbers_with_spaces() {
        ExpressionEvaluatorLibrary evaluator = new ExpressionEvaluatorLibrary();
        double expected = 4.2;
        double actual = evaluator.evaluate(" 2.1 + 3.1 - 1.0 ");
        assertEquals(expected, actual);
    }

    @Test
    public void test_floating_numbers_with_brackets() {
        ExpressionEvaluatorLibrary evaluator = new ExpressionEvaluatorLibrary();
        double expected = 4.2;
        double actual = evaluator.evaluate(" ((2.1 + 3.1) - 1.0 )");
        assertEquals(expected, actual);
    }
}
