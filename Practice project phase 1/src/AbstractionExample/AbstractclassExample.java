package AbstractionExample;

abstract class shape{
	abstract void draw();
}
class Rectangle extends shape{
	void draw() {
		System.out.println("Rectanle Draw");
	
	}
}

class Circle extends shape{
	void draw() {
		System.out.println("Circle draw");
	}
}

public class AbstractclassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        shape shp = new Rectangle();
        shp.draw();
	}

}
