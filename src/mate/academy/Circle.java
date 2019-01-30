package mate.academy;

public class Circle extends Shape {

	private int radius;

	public Circle() {
		super();
	}

	public Circle(String colour, String name, String user, int radius) throws IllegalArgumentException {
		super(colour, name, user);
		if (radius <= 0) {
			throw new IllegalArgumentException();
		}
		this.radius = radius;
		countPerimeter();
		countArea();
		
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
