package mate.academy;

public class Square extends Shape {
	
	private int side;

	public Square() {
		super();
	}

	public Square(String colour, String name, String user, int side) {
		super(colour, name, user);
		if (side <= 0) {
			throw new IllegalArgumentException();
		}
		this.side = side;
		countPerimeter();
		countArea();
	}

	@Override
	public void countPerimeter() {
		double perimeter = 4*side;
		setPerimeter(perimeter);
	}

	@Override
	public void countArea() {
		double area = Math.round(Math.pow(side, 2));
		setArea(area);
	}

	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("Side: " + side + "\n");
	}

}