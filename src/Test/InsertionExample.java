package Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertionExample {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		// Optional// Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "Aneesh@123");
		Statement stm = con.createStatement();
		stm.executeUpdate("insert into eproduct (name, price, date_added) values ('OLEDTV', 100000, now())");
		ResultSet result = stm.executeQuery("select * from eproduct");
		while (result.next()) {
			System.out.println(result.getInt("ID"));
			System.out.println(result.getString("name"));
			System.out.println(result.getString("Price"));

		}
		con.close();
	}

}
