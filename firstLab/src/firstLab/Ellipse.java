package firstLab;

public class Ellipse extends Rectangle{
	private double axisa;
	private double axisb;
	
	public Ellipse(double axisa, double axisb) {
		// Call the constructor of the Rectangle class with parameters
        super(0, 0); // You should provide appropriate values for the Rectangle constructor
        
		this.axisa = axisa;
		this.axisb = axisb;
	}
	
	//getter and setter
	public double getAxisa(){
		return axisa;
	}
	
	public double getAxisb() {
		return axisb;
	}
	
	public void setAxisa(double axisa) {
		this.axisa = axisa;
	}
	
	public void setAxisb(double axisb) {
		this.axisb = axisb;
	}
	
    @Override
    public double getArea() {
    	return Math.PI*axisa*axisb;
    }
    
    @Override
    public String toString() {
        return "Ellipse - Semi-Major Axis: " + axisa +
               ", Semi-Minor Axis: " + axisb +
               ", Area: " + getArea();
    }
    


	
	

}
