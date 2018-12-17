package mate.academy;

public class Circle extends Shape {

	private int radius;

	public Circle() {
		super();
	}

	public Circle(String colour, String name, int radius) {
		super(colour, name);
		this.radius = radius;
	}

	@Override
	public void countPerimeter() {
		double perimeter = Math.round(2 * Math.PI * radius);
		setPerimeter(perimeter);
	}

	@Override
	public void countArea() {
		double area = Math.round(2 * Math.PI * Math.pow(radius, 2));
		setArea(area);
	}

	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("Side: " + radius + "\n");
	}

}
