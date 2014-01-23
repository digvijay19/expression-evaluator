package digvijag.lib;

import digvijag.evaluator.lib.ExpressionEvaluatorLibrary;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class BracketsTest {
    @Test
    public void test_solve_expression_with_single_bracket() {
        ExpressionEvaluatorLibrary evaluator = new ExpressionEvaluatorLibrary();
        int expected = 5;
        int actual = evaluator.evaluate("(3+2)");
        assertEquals(expected, actual);
    }

    @Test
    public void test_solve_expression_with_two_bracket() {
        ExpressionEvaluatorLibrary evaluator = new ExpressionEvaluatorLibrary();
        int expected = 10;
        int actual = evaluator.evaluate("(3+2)+(3+2)");
        assertEquals(expected, actual);
    }
}
