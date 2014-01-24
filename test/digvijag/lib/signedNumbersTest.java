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
}
