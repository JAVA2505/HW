package mate.academy;

public class Shape {

	private String colour;
	private String name;
	private double perimeter;
	private double area;

	public Shape() {
	}

	public Shape(String colour, String name) {
		this.colour = colour;
		this.name = name;

	}
	
	public void getInfo() {
		System.out.println("Name of shape: " + name + "\n" + "Color: " + colour + "\n" + "Perimeter: " + perimeter + "\n" + "Area: " + area);
	}
	
	public void countPerimeter () {
	}
	
	public void countArea () {
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	

}
