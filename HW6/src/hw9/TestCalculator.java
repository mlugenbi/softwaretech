package hw9;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;





class TestCalculator {

	Calculator calculator = new Calculator();

	@Test
	public void Should_add_two_numbers_and_return_result() {
		// Implement
		assertEquals(2, calculator.add(1, 1));
	}

	@ParameterizedTest
	@CsvSource({
	    "1, 11",
	    "-5, 7"
	})	

	
	public void Should_add_two_numbers_and_return_result_parameterized(int valueOne, int valueTwo) {
		// Implement
		
		assertEquals((valueOne + valueTwo), calculator.add(valueOne, valueTwo));

	}
	
	
	
	@Test
	public void Should_substract_two_numbers_and_return_result() {
		// Implement
		assertEquals(2, calculator.sub(3, 1));
	}
	
	@Test
	public void Should_multiply_two_numbers_and_return_result() {
		// Implement
		
		assertEquals(45, calculator.multiply(5, 9));
	}
	
	@Test
	public void Should_divide_two_numbers_and_return_result() {
		// Implement
		assertEquals(4, calculator.divide(32, 8));

	}
	
	@Test
	public void Should_throw_an_arithmetic_exception_if_denominator_is_zero() {
		// Implement
//		val exception = assertThrows<ArithmeticException> ("Should throw an exception") {
//            calculator.divide(1, 0)
//        }
//        assertEquals("/ by zero", exception.message)
		
		
		Exception exception = assertThrows(ArithmeticException.class, () ->
        calculator.divide(1, 0));
		assertEquals("ZeroDivisionError", exception.getMessage());

	}
}