package mate.academy;

public class Shape {

	private int id;
	private String colour;
	private String name;
	private String user;
	private double perimeter;
	private double area;

	public Shape() {
	}

	public Shape(String colour, String name, String user) {
		this.colour = colour;
		this.name = name;
		this.user = user;

	}

	public void getInfo() {
		System.out.println("Name of shape: " + "id " + id + " " + name + "\n" + "Color: "
	+ colour + "\n" + "Perimeter: " + perimeter
				+ "\n" + "Area: " + area + "\n" + "User " + user);
	}

	public void countPerimeter() {
		
	};

	public void countArea() {
		
	};
	
	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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