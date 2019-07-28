package co.scan.d;

public abstract class AbstractShape implements shape {
    private String colour;

	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}

	public AbstractShape(String colour) {
		super();
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "AbstractShape [colour=" + colour + "]";
	}
    
}
