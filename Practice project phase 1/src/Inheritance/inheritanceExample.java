package Inheritance;

public class shape{ 
	        int lenght;
	        int breadth; 
}        
	
public class Rectangle extends shape
{
	      int area;
	      public void calculateArea()
	      {
	           area = lenght*breadth;
	        
	      }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle r = new Rectangle();
		
		       r.lenght = 10;
		       r.breadth = 20;
		r.calculareArea();
		
		System.out.println("Area of rectangle \""+r.lenght+"\" and breadth \""r.breadth+"\" is \""+r.area+"\"");;
		
	

	}

}
