package exception;

public class ExceptionPropagation {

	void a() {
		int data = 50/0;
		
	}
	void b() {
		a();
	}
	void c() {
		
	try {
	
		b();
	}catch(Exception e) {
		//e.printStackTrace();
		System.out.println(e.getMessage());
		System.out.println("Internal error handled by c");
	}
	}
	
	public static void main(String[] args){
	  
		ExceptionPropagation obj = new ExceptionPropagation();
		obj.c();
	}

	}
