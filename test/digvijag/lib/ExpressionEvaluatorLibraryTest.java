package digvijag.lib;

import digvijag.evaluator.lib.ExpressionEvaluatorLibrary;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ExpressionEvaluatorLibraryTest {
    @Test
    public void test_addition_of_two_integers() {
        ExpressionEvaluatorLibrary evaluator = new ExpressionEvaluatorLibrary();
        int expected = 5;
        int actual = evaluator.evaluate("2+3");
        assertEquals(expected,actual);
    }
    @Test
    public void test_subtraction_of_two_integers() {
        ExpressionEvaluatorLibrary evaluator = new ExpressionEvaluatorLibrary();
        int expected = 1;
        int actual = evaluator.evaluate("3-2");
        assertEquals(expected,actual);
    }
    @Test
    public void test_multiplication_of_two_integers() {
        ExpressionEvaluatorLibrary evaluator = new ExpressionEvaluatorLibrary();
        int expected = 6;
        int actual = evaluator.evaluate("3*2");
        assertEquals(expected,actual);
    }
}
