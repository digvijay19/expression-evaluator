package digvijag.lib;

import digvijag.evaluator.lib.ExpressionEvaluatorLibrary;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class signedNumbersTest {
    @Test
    public void test_one_negative_numbers_in_addition() {
        ExpressionEvaluatorLibrary evaluator = new ExpressionEvaluatorLibrary();
        double expected = -1;
        double actual = evaluator.evaluate("-2 + 1");
        assertEquals(expected, actual);
    }

    @Test
    public void test_two_negative_numbers_in_addition() {
        ExpressionEvaluatorLibrary evaluator = new ExpressionEvaluatorLibrary();
        double expected = -3;
        double actual = evaluator.evaluate("-2+-1");
        assertEquals(expected, actual);
    }

    @Test
    public void test_two_negative_numbers_in_multiplication() {
        ExpressionEvaluatorLibrary evaluator = new ExpressionEvaluatorLibrary();
        double expected = 2;
        double actual = evaluator.evaluate("-2*-1");
        assertEquals(expected, actual);
    }

    @Test
    public void test_addition_of_two_negative_numbers_with_single_space() {
        ExpressionEvaluatorLibrary evaluator = new ExpressionEvaluatorLibrary();
        double expected = -3;
        double actual = evaluator.evaluate("-2+ -1");
        assertEquals(expected, actual);
    }

    @Test
    public void test_addition_of_two_negative_numbers_with_spaces() {
        ExpressionEvaluatorLibrary evaluator = new ExpressionEvaluatorLibrary();
        double expected = -3;
        double actual = evaluator.evaluate("-2+  -1");
        assertEquals(expected, actual);
    }

    @Test
    public void test_addition_of_two_signed_positive_numbers_with_spaces() {
        ExpressionEvaluatorLibrary evaluator = new ExpressionEvaluatorLibrary();
        double expected = 3;
        double actual = evaluator.evaluate("+2+ 1");
        assertEquals(expected, actual);
    }

    @Test
    public void test_addition_with_brackets() {
        ExpressionEvaluatorLibrary evaluator = new ExpressionEvaluatorLibrary();
        double expected = 1;
        double actual = evaluator.evaluate("(+2+ -1)");
        assertEquals(expected, actual);
    }
}
