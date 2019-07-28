package co.scan.d;

public class Rectangle extends AbstractShape {
	
	private int length;
	private int breadth;
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public Rectangle(String colour, int length, int breadth) {
		super(colour);
		this.length = length;
		this.breadth = breadth;
		}	
	
	@Override
	public double getArea() {
		int Area = length*breadth;
		return Area;
	}

	@Override
	public double getPerimeter() {
		int Per = 2*(length+breadth);
		return Per;
	}

	@Override
	public String toString() {
		return "Rectangle [colour=" + getColour() + ", length=" + length + ", breadth=" + breadth + "]";
	}
	
	
	

}
