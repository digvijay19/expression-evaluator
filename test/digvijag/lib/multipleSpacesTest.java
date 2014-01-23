package digvijag.lib;

import digvijag.evaluator.lib.ExpressionEvaluatorLibrary;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class multipleSpacesTest {
    @Test
    public void test_single_operation_with_space_between_leftOperand_and_operation_for_addition() {
        ExpressionEvaluatorLibrary evaluator = new ExpressionEvaluatorLibrary();
        int expected = 5;
        int actual = evaluator.evaluate("2 +3");
        assertEquals(expected, actual);
    }

    @Test
    public void test_single_operation_with_space_between_rightOperand_and_operation_for_addition() {
        ExpressionEvaluatorLibrary evaluator = new ExpressionEvaluatorLibrary();
        int expected = 5;
        int actual = evaluator.evaluate("2+ 3");
        assertEquals(expected, actual);
    }

    @Test
    public void test_multiple_operations_with_spaces_in_between() {
        ExpressionEvaluatorLibrary evaluator = new ExpressionEvaluatorLibrary();
        int expected = 9;
        int actual = evaluator.evaluate("2+ 3+ 3 + 2-1");
        assertEquals(expected, actual);
    }

}
