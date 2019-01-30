package mate.academy;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		DBWorker db = new DBWorker();
		db.createShapeTable();
		//Circle circle1 = new Circle("white", "circle1", "Aleksey", 5);
		//EquilateralTriangle triangle1 = new EquilateralTriangle("black", "triangle1", "Aleksey", 7);
		//Square square1 = new Square("red", "square1", "Aleksey" , 3);
		//db.addShape(circle1);
		//db.addShape(triangle1);
		//db.addShape(square1);
		System.out.println("test getShapebyID");
		//db.getShapeByID(1).getInfo();
		
		
		System.out.println("test getALLShape");
		Iterator<Shape> iterator = db.getAllShape().iterator();
		while (iterator.hasNext()) {
			System.out.println("1");
			Shape temp = iterator.next();
			System.out.println(temp);
		}
		
		Config config = new Config();
		ConfigController.writeConfig(config);
		
		//db.deleteShapeByID(1);
	}
}