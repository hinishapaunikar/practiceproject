package exception;

class InvalidAgeException extends Exception {
	
	
	
	
	
	private static final long serialversionUID = 1L;
	
	
}



public class TestcustomExample {

	void validAge(int age) throws InvalidAgeException{
		if(age<18) {
			throw new InvalidAgeException();
		}
		System.out.println("Age is perfect");
	}
	
	public static void main(String[] args) {
		TestCustomException obj = new TestCustomException();
		try {
			
			obj.validAge(17);
			
		}catch(InavlidAgeException e) {
		
			e.printStackTrace();
	}
	
	
	
	
	}
}
