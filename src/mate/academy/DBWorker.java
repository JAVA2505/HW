package mate.academy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBWorker {

	private final static String SHOW_TABLES = "SHOW TABLES";
	private final static String DESCRIBE_TABLE = "DESCRIBE ?";
	private final static String ADD_SHAPE = "INSERT INTO `shape` (name, colour, area, perim, user)"
			+ " VALUES (?, ?, ?, ?, ?)";
	private final static String GET_SHAPE = "SELECT * FROM `shape` WHERE id =";
	private final static String DELETE_SHAPE = "DELETE FROM `shape` WHERE id =";
	private final static String GET_ALL_SHAPE = "SELECT * FROM `shape`";
	private Connection conn;
	private Statement st;
	

	public DBWorker() {
		try {
			Config config = new Config();
			conn = DriverManager.getConnection("jdbc:mysql://" + config.getHost() + "/" + config.getDb() + "?" 
			+ "user=" + config.getUser() + "&password=" + config.getPsw());
			st = conn.createStatement();
		} catch (SQLException ex) {
			System.out.println("SQLExeption: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
	}

	public boolean addShape(Shape shape) {
		try {
			PreparedStatement prs = conn.prepareStatement(ADD_SHAPE);
			prs.setString(1, shape.getName());
			prs.setString(2, shape.getColour());
			prs.setDouble(3, shape.getArea());
			prs.setDouble(4, shape.getPerimeter());
			prs.setString(5, shape.getUser());
			System.out.println(prs.execute());
			prs.close();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

	}

	public Shape getShapeByID(int id) {
		Shape shape = null;
		try {
			ResultSet rs = st.executeQuery(GET_SHAPE + id);
			if (rs.next()) {
				shape = new Shape();
				shape.setId(id);
				shape.setName(rs.getString("name"));
				shape.setColour(rs.getString("colour"));
				shape.setArea(rs.getDouble("area"));
				shape.setPerimeter(rs.getDouble("perim"));
				shape.setUser(rs.getString("user"));
			}
		} catch (SQLException e) {
			System.out.println("SQL exception..." + e.getMessage());
		}
		return shape;
	}

	public List<Shape> getAllShape() {
		List<Shape> shapeList = new ArrayList<>();
		try {
			ResultSet rs = st.executeQuery(GET_ALL_SHAPE);
			while (rs.next()) {
				Shape shape = new Shape();
				shape.setId(rs.getInt("id"));
				shape.setName(rs.getString("name"));
				shape.setColour(rs.getString("colour"));
				shape.setArea(rs.getDouble("area"));
				shape.setPerimeter(rs.getDouble("perim"));
				shape.setUser(rs.getString("user"));
			}
		} catch (SQLException e) {
			System.out.println("SQL exception..." + e.getMessage());
		}
		return shapeList;
	}

	public void deleteShapeByID(int id) {
		try {
			st.execute(DELETE_SHAPE + id);
			System.out.println("Shape with id " + id + " was deleted from table");
		} catch (SQLException e) {
			System.out.println("SQL exception..." + e.getMessage());
		}
	}

	public void createShapeTable() {
		try {
			st.execute("CREATE TABLE IF NOT EXISTS shape (id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,"
					+ " name VARCHAR(30), colour VARCHAR(30),"
					+ "area DOUBLE(8,2), perim DOUBLE(8,2), user VARCHAR(30))");
			System.out.println("Create table OK");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void close() {
		try {
			st.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
