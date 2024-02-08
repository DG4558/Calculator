
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

    public class CalculatorTest {
        private Calculator calc;

        @Before
        public void setUp() {
            calc = new Calculator();
        }

        @Test
        public void testAddition() {
            double a = 10;
            double b = 5;
            double expectedResult = 15;
            double result = calc.performAddition(a, b);
            Assert.assertEquals(expectedResult, result, 0.0001);
        }

        @Test
        public void testSubtraction() {
            double a = 10;
            double b = 5;
            double expectedResult = 5;
            double result = calc.performSubtraction(a, b);
            Assert.assertEquals(expectedResult, result, 0.0001);
        }

        @Test
        public void testMultiplication() {
            double a = 10;
            double b = 5;
            double expectedResult = 50;
            double result = calc.performMultiplication(a, b);
            Assert.assertEquals(expectedResult, result, 0.0001);
        }

        @Test
        public void testDivision() {
            double a = 10;
            double b = 5;
            double expectedResult = 2;
            double result = calc.performDivision(a, b);
            Assert.assertEquals(expectedResult, result, 0.0001);
        }

        @Test
        public void testSquareRoot() {
            double val = 16.0;
            double expectedResult = 4.0;
            double result = calc.performSquareRoot(val);
            Assert.assertEquals(expectedResult, result, 0.0001);
        }

        @Test
        public void testFactorial() {
            int a = 5;
            long expectedResult = 120;
            long result = calc.performFactorial(a);
            Assert.assertEquals(expectedResult, result);
        }

        @Test
        public void testNaturalLog() {
            double a = 2.718;
            double expectedResult = 1.0;
            double result = calc.performLog(a);
            Assert.assertEquals(expectedResult, result, 0.001);
        }

        @Test
        public void testPower() {
            double a = 2.0;
            double b = 5.0;
            double expectedResult = 32.0;
            double result = calc.performPower(a, b);
            Assert.assertEquals(expectedResult, result, 0.0001);
        }
    }


