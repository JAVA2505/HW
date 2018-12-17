package mate.academy;

public class EquilateralTriangle extends Shape {

	private int side;

	public EquilateralTriangle() {
		super();
	}

	public EquilateralTriangle(String colour, String name, int side) {
		super(colour, name);
		this.side = side;
	}

	@Override
	public void countPerimeter() {
		double perimeter = Math.round(side * 3);
		setPerimeter(perimeter);
	}

	@Override
	public void countArea() {
		double area = Math.round(Math.pow(side, 2) * Math.sqrt(3) / 4);
		setArea(area);
	}

	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("Side: " + side + "\n");
	}
}
