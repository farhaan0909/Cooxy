package CoOxy.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection implements DBConnfig{
	private static Connection con;
	public static Connection getConn()
	{
		try{
			Class.forName(Driver);
			con = DriverManager.getConnection(Conn,Usernm,Passwd);
		}		
		catch (SQLException e) {
            // Handle SQLNonTransientConnectionException or other SQLExceptions
            System.err.println("SQL Exception: " + e.getMessage());
            e.printStackTrace();
        } 
		catch(Exception ee) {System.out.println(ee+" ???? Connection Eror----");}

	return con;
	}
}