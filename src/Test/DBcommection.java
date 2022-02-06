package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBcommection {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		// Optional// Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "Aneesh@123");
		Statement stm = con.createStatement();
		ResultSet result = stm.executeQuery("select * from eproduct");

		while (result.next()) {
			System.out.println(result.getInt("ID"));
			System.out.println(result.getString("name"));
			System.out.println(result.getString("Price"));
		}

		ResultSet result1 = stm.executeQuery("select count(*) as count from eproduct");
		System.out.println("*********************");
		
		System.out.print("The total row count is ");
		while (result1.next()) {
			System.out.print(result1.getInt("count"));

		}
		con.close();
	}

	private static String count() {
		// TODO Auto-generated method stub
		return null;
	}

}
