package firstLab;

public class Drivers {
	public static void main(String[]args) {
		
		Rectangle rect1 = new Rectangle(2.0, 2.0);
		Rectangle rect2 = new Rectangle(3.0,2.0);
		
		System.out.println("area of Rect1 :" +  rect1.getArea()+ " m^2");
		System.out.println("area of Rect2 :" + rect2.getArea()+ " m^2");
		
		
		Circle circle = new Circle(2.0);
		
		System.out.println("radius of circle: "+ circle.getRadius());
		System.out.println("area of circle: "+ circle.getArea());
		
		
		
		Ellipse ellipse = new Ellipse(3.0,4.0);
		
		System.out.println("area of ellipse: "+ ellipse.getArea());
		System.out.println("axisa of ellipse: "+ ellipse.getAxisa());
		System.out.println("axisb of ellipse: "+ ellipse.getAxisb());
		
		
		System.out.println(ellipse.toString());
	}

}
