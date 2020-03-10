import java.util.*;

interface Color {

	public void applyColor();
}

abstract class Shape {
	protected Color color;
	
	public Shape(Color c){
		this.color=c;
	}
	
	abstract public void applyColor();
}

class Triangle extends Shape{

	public Triangle(Color c) {
		super(c);
	}

	public void applyColor() {
		System.out.print("Triangle filled with color ");
		color.applyColor();
	}
}
class Pentagon extends Shape{

	public Pentagon(Color c) {
		super(c);
	}

	public void applyColor() {
		System.out.print("Pentagon filled with color ");
		color.applyColor();
	} 

}

class RedColor implements Color{

	public void applyColor(){
		System.out.println("red.");
	}
}

class GreenColor implements Color{

	public void applyColor(){
		System.out.println("green.");
	}
}

public class BridgePatternTest {

	public static void main(String[] args) {
		Shape tri = new Triangle(new RedColor());
		tri.applyColor();
		
		Shape pent = new Pentagon(new GreenColor());
		pent.applyColor();
	}

}