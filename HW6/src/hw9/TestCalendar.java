package hw9;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.GregorianCalendar;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TestCalendar {

	

	
	@ParameterizedTest
	@ValueSource(ints = {2000,2004,2008,2012,2400})
	public void Should_return_true(int year) {
		// Implement
		Calendar calendar = new Calendar(year);
		assertTrue(calendar.isLeapYear());
	}

	@ParameterizedTest
	@ValueSource(ints = {2001,2005,2009,2013,1900})
	public void Should_return_false(int year) {
		// Implement
		Calendar calendar = new Calendar(year);
		assertFalse(calendar.isLeapYear());
	}

	@ParameterizedTest
	@ValueSource(ints = {2000,20059,20029,1013,1900})
	public void Should_return_if_year_is_leap(int year) {
		// Implement
		
		GregorianCalendar gregCalendar = new GregorianCalendar();
		Calendar calendar = new Calendar(year);
		boolean leapYearCheck = calendar.isLeapYear();
		boolean gregLeapYearCheck = gregCalendar.isLeapYear(year);
		assertEquals(leapYearCheck, gregLeapYearCheck);
	}

	// Create a new method for boundary testing
	@Test
	public void Should_test_boundaries() {
		// Implement
		//Assumption: There are no negative years and the year 0 is not a leap year
		Calendar calendar1 = new Calendar(Integer.MIN_VALUE);
		assertFalse(calendar1.isLeapYear());
		
		Calendar calendar2 = new Calendar(-1);
		assertFalse(calendar2.isLeapYear());
		
		Calendar calendar3 = new Calendar(0);
		assertFalse(calendar3.isLeapYear());
		
		Calendar calendar4 = new Calendar(1);
		assertFalse(calendar4.isLeapYear());
		
		Calendar calendar5 = new Calendar(Integer.MAX_VALUE);
		assertFalse(calendar5.isLeapYear());
	}
}