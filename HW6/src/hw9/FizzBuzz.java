package hw9;

public class FizzBuzz {
	
	public String convertNumber(int number) {
		// Implement
		
		if(((number % 5) == 0) && ((number % 7)== 0)) {
				
			
			return "FizzBuzz";
			
		}
		if(((number % 5) == 0) && ((number % 7)!= 0)) {
			
			return "Fizz";
			
		}
		
		if(((number % 5) != 0) && ((number % 7)== 0)) {
			
			return "Buzz";
			
		}
		
		
		return "";
	}
}