package bank_dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class kaihu {
	public static String row() throws Exception{
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		String zhanghao = "";
		try {
			//建立连接
			conn = lianjie.getConn();
			//创建语句
			st = (PreparedStatement) conn.prepareStatement("select replace(replace(replace(CONVERT(varchar, getdate(), 120 ),'-',''),' ',''),':','')"); 
			rs = st.executeQuery(); 
			while(rs.next()) {
				rs.getString(zhanghao);
			}
			
		}finally {
			lianjie.free(rs,st,conn);//释放资源
		}
		return zhanghao;

	}
	
	public static void insert(String zhanghao, String name, Double money, String key, String kaihudate) throws Exception{
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			//建立连接
			conn = lianjie.getConn();
			//创建语句
			
			//执行语句
			//String sql = "insert into useifo(Id,Name,money,key) values('1001','zzy',100,'123456')";
			String sql = "insert into useifo (Id,Name,money,keyo,kaihudate) values(?,?,?,?,?)";
			st = (PreparedStatement) conn.prepareStatement(sql);
			st.setString(1, zhanghao);
			st.setString(2, name);
			st.setDouble(3, money);
			st.setString(4, key);
			st.setString(5, kaihudate);
			int a = st.executeUpdate();   
			
			
		}finally {
			lianjie.free(rs,st,conn);//释放资源
		}
	}
}
