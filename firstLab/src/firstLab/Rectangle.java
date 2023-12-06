package firstLab;

public class Rectangle extends Shape{
	//additional attributes
	private double Height;
	private double Width;
	
	
	//constructor
	public Rectangle (double Height, double Width) {
		this.Height= Height;
		this.Width= Width;
	}
	
	//Getter for height and width
	
	public double getHeight() {
		return Height;
	}
	
	public double getWidth() {
		return Width;
	}
	
	
	//setter for height and width
	
	public void setWidth(double Width) {
		this.Width = Width;
	}
	
	public void setHeight(double Height) {
		this.Height= Height;
	}
	
	//implementation of getArea() method for the Rectangle class
	
	@Override
	public double getArea() {
		return Height*Width;
	}



}
