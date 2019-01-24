package mate.academy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (Exception ex) {
		}

		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://s3.thehost.ua/itea2?" 
		+ "user=helen&password=123456");
		} catch (SQLException ex) {
			// handle any errors
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
		System.out.println("Connection is Ok");
		Statement st = null;
		try {
			st = conn.createStatement();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		String sql = "SHOW TABLES;";
		try {
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getString(1));
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		sql = "DESCRIBE ss;";
		try {
			ResultSet rs = st.executeQuery(sql);
			System.out.println("Description of ss table:" + "\n");
			System.out.printf("%-10s%-15s%-7s%-7s%-10s%-7s%n",
					"Field", "Type", "Null", "Key", "Default", "Extra");
			
			System.out.println("----------------------------------------------------------------\n");
			while(rs.next()) {
				System.out.printf("%-10s%-15s%-7s%-7s%-10s%-7s%n", rs.getString("Field"), rs.getString("Type"),
						rs.getString("Null"), rs.getString("Key"),
						rs.getString("Default"), rs.getString("Extra"));
				
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		sql = "INSERT INTO ss (animal, name, type, age) VALUES ('Gubenko', 'Aleksey', 'human', 34);";
		try {
			st.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		sql = "SELECT * FROM ss;";
		try {
			ResultSet rs = st.executeQuery(sql);
			System.out.println("Table ss:" + "\n");
			System.out.printf("%-5s%-15s%-12s%-15s%-7s%n",
					"id", "animal", "name", "type", "age");
			
			System.out.println("---------------------------------------------------\n");
			while(rs.next()) {
				System.out.printf("%-5s%-15s%-12s%-15s%-7s%n", rs.getString("id"), rs.getString("animal"),
						rs.getString("name"), rs.getString("type"),
						rs.getString("age"));
				
			}
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
		try {
			st.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

