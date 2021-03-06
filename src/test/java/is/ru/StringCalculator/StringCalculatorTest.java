package is.ru.StringCalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringCalculatorTest {
  @Test
 	public void testEmptyString() {
 		assertEquals(0, Calculator.add(""));
 	}
  @Test
 	public void testOneNumber() {
 		assertEquals(1, Calculator.add("1"));
 	}
  @Test
 	public void testTwoNumbers() {
 		assertEquals(3, Calculator.add("1,2"));
 	}
  @Test
 	public void testMultipleNumbers() {
 		assertEquals(12, Calculator.add("1,2,4,5"));
 	}
}
