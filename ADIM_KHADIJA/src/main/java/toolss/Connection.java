package toolss;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connection {
	static Statement st;
    static java.sql.Connection con;
    static String url;
    
	public static  void Connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		    
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Bibleo","root","KHadija");
			 st=con.createStatement();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static int Maj(String sql) {
		int nb=0;
		try {
			nb = st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erreur dans le MAj");

		}
		return nb;
	}
    public static ResultSet select(String sql) {
    	
    	ResultSet res=null;
		try {
			res = st.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erreur dans le select");

		}
    	return res;
    }
    public static void disconnect() {
    	try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Erreur dans le disconnect");

		}
    }
}

