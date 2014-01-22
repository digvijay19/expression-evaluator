package digvijag.lib;

import digvijag.evaluator.lib.ExpressionEvaluatorLibrary;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ExpressionEvaluatorMultipleOperationsTest {
    @Test
    public void test_add_three_integers() {
        ExpressionEvaluatorLibrary evaluator = new ExpressionEvaluatorLibrary();
        int expected = 7;
        int actual = evaluator.evaluate("2+3+2");
        assertEquals(expected, actual);
    }
}
