import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 * 测试用例设计总体原则：
 *  全面覆盖：涵盖各种可能的输入情况，包括正常值、边界值和异常值。
 *  独立性：每个测试方法独立运行，互不影响，确保测试的准确性和可重复性。
 *  可读性：测试方法命名清晰，能够直观反映测试内容。
 *  验证预期结果：使用assertEquals方法验证实际输出与预期结果是否一致，确保方法的正确性。
 *  边界条件：特别关注边界条件，如零值、单个数字和大数字，确保方法在极端情况下也能正确处理。
 */
public class L2022211966_12_Test {

    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    //测试乘法方法，当任意一个操作数为0时，结果应为0。
    @Test
    public void multiply_WithZero_ReturnsZero() {
        assertEquals("0", solution.multiply("0", "123"));
        assertEquals("0", solution.multiply("123", "0"));
        assertEquals("0", solution.multiply("0", "0"));
    }

    //测试乘法方法，当任意一个操作数为1时，结果应为另一个操作数。
    @Test
    public void multiply_SingleDigit_ReturnsProduct() {
        assertEquals("3", solution.multiply("1", "3"));
        assertEquals("6", solution.multiply("2", "3"));
    }

    //测试乘法方法，当两个操作数是一位数或多位数时，结果是否正确。
    @Test
    public void multiply_MultiDigit_ReturnsProduct() {
        assertEquals("111", solution.multiply("3", "37"));
        assertEquals("56088", solution.multiply("123", "456"));
    }

    //测试乘法方法，当两个操作数是较大的数字时，结果是否正确。
    @Test
    public void multiply_LargeNumbers_ReturnsProduct() {
        assertEquals("18442836390488288791983829563485956896", solution.multiply("2842794765450839478", "6487572235121741232"));
    }

    //测试加法方法，当两个操作数是是一位数时，结果是否正确。
    @Test
    public void addStrings_SingleDigit_ReturnsSum() {
        assertEquals("3", solution.addStrings("1", "2"));
        assertEquals("9", solution.addStrings("5", "4"));
    }

    //测试加法方法，当两个操作数是多位数时，结果是否正确。
    @Test
    public void addStrings_MultiDigit_ReturnsSum() {
        assertEquals("500", solution.addStrings("123", "377"));
        assertEquals("1000", solution.addStrings("500", "500"));
    }

    //测试加法方法，当两个操作数是较大的数字时，结果是否正确。
    @Test
    public void addStrings_LargeNumbers_ReturnsSum() {
        assertEquals("5690367000572680710", solution.addStrings("2842794765450839478", "2847572235121841232"));
    }
}

