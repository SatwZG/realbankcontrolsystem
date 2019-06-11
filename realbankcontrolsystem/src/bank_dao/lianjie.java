package bank_dao;
import java.sql.*;
public class lianjie {
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String url = "jdbc:mysql://127.0.0.1:3306/sys?useSSL=false&serverTimezone=GMT";
	private static String username = "root";
	private static String password = "";
	private lianjie(){
	}
	static {
		try {
			Class.forName(driver);
		}catch(ClassNotFoundException e) {
			throw new ExceptionInInitializerError(e);
		} 
	}
	
	public static Connection getConn() throws SQLException {
	    return DriverManager.getConnection(url, username, password);
	}

	public static void free(ResultSet rs, PreparedStatement st, Connection conn) {
		try {
			if(rs!=null)
				rs.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(st != null)
					st.close();
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				if(conn != null)
					try {
						conn.close();
					}catch(SQLException e) {
						e.printStackTrace();
						
					}
			}
		}
	}
}
