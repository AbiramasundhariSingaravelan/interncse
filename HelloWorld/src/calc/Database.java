package calc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection c=DriverManager.
				getConnection("jdbc:mysql://localhost:3306/demodatabase","root","arthi");
		Statement s=c.createStatement();
		ResultSet rs=s.executeQuery("select * from student");
		while(rs.next())
		{
			System.out.println("ID:"+rs.getInt(1)+"NAME:"+rs.getString(2)+"DEPT:"+rs.getString(3)+"MARKS"+rs.getInt(4));
		}
		s.executeUpdate("insert into student values(104,'abinaya','CSE',100)");
		s.executeUpdate("update student set marks=95 where id=104");
		s.executeUpdate("delete from student where id=104)";)
	}

}
