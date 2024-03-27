package studio7;

public class Rectangle {
	//instance variables
	private double length;
	private double width;

	//constructor: set instance variables to default values
	public Rectangle(double l, double w) {
		// set the instance variables to default values
		length = l;
		width = w;
	}

	//print area
	public double getArea() {
		double area = this.length*this.width;
		return area;
	}

	public double getPerimeter() {
		double perimeter = (2*(this.length))+(2*(this.width));
		return perimeter;
	}

	public void compareRectangle(Rectangle other) {
		if (this.getArea() < other.getArea()) {
			System.out.println("Rectangle is smaller");
		}
		else {
			System.out.println("Rectangle is not smaller");
		}
	}

	public void isSquare() {
		if (length == 0 || width == 0) {
			System.out.println("Rectangle is not a square");
		}
		else if (length==width) {
			System.out.println("Rectangle is a square");
		}
		else {
			System.out.println("Rectangle is not a square");
		}

	}

	public static void main(String[] args) {

		Rectangle rect1 = new Rectangle(2.0, 3.0);
		Rectangle rect2 = new Rectangle(3.0, 2.0);
		System.out.println(rect1.getArea());
		System.out.println(rect1.getPerimeter());
		rect1.isSquare();
		rect1.compareRectangle(rect2);
	}

}
