package co.scan.d;

public class Circle extends AbstractShape {
	private int radius;
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public Circle(String colour, int radius) {
		super(colour);
		this.radius = radius;
	}

	@Override
	public double getArea() {
		double area = (Math.PI * radius * radius);
		return  Math.round(area);
	}

	@Override
	public double getPerimeter() {
		double per = (Math.PI * 2 * radius);
		return Math.round(per);
	}
	
	@Override
	public String toString() {
		return "Circle [colour=" + getColour() + ", radius=" + radius + "]";
	}
	

}
