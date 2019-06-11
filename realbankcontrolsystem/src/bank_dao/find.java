package bank_dao;
import java.sql.*;

public class find {
	public static int findId(String Id) throws Exception{
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		int count = 0;
		try {
			//建立连接
			conn = lianjie.getConn();
			//创建语句
			String sql = "select * from useifo where Id= ?";
			 st = conn.prepareStatement(sql);
			 st.setString(1, Id);
			//执行语句
		
			rs = st.executeQuery();
			//处理结果
			while(rs.next()) {
				count++;
			}
			
			
		}finally {
			lianjie.free(rs,st,conn);//释放资源
		}
		return count;
	}
	public static int findkey(String Id, String key) throws SQLException {
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			//建立连接
			conn = lianjie.getConn();
			//创建语句
			String sql = "select * from useifo where Id= ?";
			 st = conn.prepareStatement(sql);
			 st.setString(1, Id);
			//执行语句
		
			rs = st.executeQuery();
			//处理结果
			
			while(rs.next()) {
		   if(key.equals((String) rs.getObject(4)))
		   {
			return 1;
		   }		
			}
			
			
			
		}finally {
			lianjie.free(rs,st,conn);//释放资源
		}
		return 0;
		
	}
	public static Double findmoney(String Id) throws SQLException {
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			//建立连接
			conn = lianjie.getConn();
			//创建语句
			String sql = "select * from useifo where Id= ?";
			 st = conn.prepareStatement(sql);
			 st.setString(1, Id);
			//执行语句
		
			rs = st.executeQuery();
			//处理结果
			
			while(rs.next()) {
		       return (Double) rs.getObject(3);
			}
			
			
			
		}finally {
			lianjie.free(rs,st,conn);//释放资源
		}
		return 0.0;
		
	}
	public static String findname(String Id) throws SQLException {
		String name = "";
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			//建立连接
			conn = lianjie.getConn();
			//创建语句
			String sql = "select * from useifo where Id= ?";
			 st = conn.prepareStatement(sql);
			 st.setString(1, Id);
			//执行语句
		
			rs = st.executeQuery();
			//处理结果
			
			while(rs.next()) {
		       return (String) rs.getObject(2);
			}
			
			
			
		}finally {
			lianjie.free(rs,st,conn);//释放资源
		}
		return name;
		
	}
	public static String finddate(String Id) throws SQLException {
		String name = "";
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			//建立连接
			conn = lianjie.getConn();
			//创建语句
			String sql = "select * from useifo where Id= ?";
			 st = conn.prepareStatement(sql);
			 st.setString(1, Id);
			//执行语句
		
			rs = st.executeQuery();
			//处理结果
			
			while(rs.next()) {
		       return (String) rs.getObject(5);
			}
			
			
			
		}finally {
			lianjie.free(rs,st,conn);//释放资源
		}
		return name;
		
	}
	public static String findall(String Id) throws SQLException {
		String all = "";
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			//建立连接
			conn = lianjie.getConn();
			//创建语句
			String sql = "select * from useifo where Id= ?";
			 st = conn.prepareStatement(sql);
			 st.setString(1, Id);
			//执行语句
		
			rs = st.executeQuery();
			//处理结果
			
			while(rs.next()) {
		       all = "密码："+ rs.getObject(4) + "  旧密码："+ rs.getObject(6);
			}
			
			
			
		}finally {
			lianjie.free(rs,st,conn);//释放资源
		}
		//System.out.println(all);
		return all;
		
	}
}
