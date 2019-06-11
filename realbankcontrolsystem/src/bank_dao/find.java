package bank_dao;
import java.sql.*;

public class find {
	public static int findId(String Id) throws Exception{
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		int count = 0;
		try {
			//��������
			conn = lianjie.getConn();
			//�������
			String sql = "select * from useifo where Id= ?";
			 st = conn.prepareStatement(sql);
			 st.setString(1, Id);
			//ִ�����
		
			rs = st.executeQuery();
			//������
			while(rs.next()) {
				count++;
			}
			
			
		}finally {
			lianjie.free(rs,st,conn);//�ͷ���Դ
		}
		return count;
	}
	public static int findkey(String Id, String key) throws SQLException {
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			//��������
			conn = lianjie.getConn();
			//�������
			String sql = "select * from useifo where Id= ?";
			 st = conn.prepareStatement(sql);
			 st.setString(1, Id);
			//ִ�����
		
			rs = st.executeQuery();
			//������
			
			while(rs.next()) {
		   if(key.equals((String) rs.getObject(4)))
		   {
			return 1;
		   }		
			}
			
			
			
		}finally {
			lianjie.free(rs,st,conn);//�ͷ���Դ
		}
		return 0;
		
	}
	public static Double findmoney(String Id) throws SQLException {
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			//��������
			conn = lianjie.getConn();
			//�������
			String sql = "select * from useifo where Id= ?";
			 st = conn.prepareStatement(sql);
			 st.setString(1, Id);
			//ִ�����
		
			rs = st.executeQuery();
			//������
			
			while(rs.next()) {
		       return (Double) rs.getObject(3);
			}
			
			
			
		}finally {
			lianjie.free(rs,st,conn);//�ͷ���Դ
		}
		return 0.0;
		
	}
	public static String findname(String Id) throws SQLException {
		String name = "";
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			//��������
			conn = lianjie.getConn();
			//�������
			String sql = "select * from useifo where Id= ?";
			 st = conn.prepareStatement(sql);
			 st.setString(1, Id);
			//ִ�����
		
			rs = st.executeQuery();
			//������
			
			while(rs.next()) {
		       return (String) rs.getObject(2);
			}
			
			
			
		}finally {
			lianjie.free(rs,st,conn);//�ͷ���Դ
		}
		return name;
		
	}
	public static String finddate(String Id) throws SQLException {
		String name = "";
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			//��������
			conn = lianjie.getConn();
			//�������
			String sql = "select * from useifo where Id= ?";
			 st = conn.prepareStatement(sql);
			 st.setString(1, Id);
			//ִ�����
		
			rs = st.executeQuery();
			//������
			
			while(rs.next()) {
		       return (String) rs.getObject(5);
			}
			
			
			
		}finally {
			lianjie.free(rs,st,conn);//�ͷ���Դ
		}
		return name;
		
	}
	public static String findall(String Id) throws SQLException {
		String all = "";
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			//��������
			conn = lianjie.getConn();
			//�������
			String sql = "select * from useifo where Id= ?";
			 st = conn.prepareStatement(sql);
			 st.setString(1, Id);
			//ִ�����
		
			rs = st.executeQuery();
			//������
			
			while(rs.next()) {
		       all = "���룺"+ rs.getObject(4) + "  �����룺"+ rs.getObject(6);
			}
			
			
			
		}finally {
			lianjie.free(rs,st,conn);//�ͷ���Դ
		}
		//System.out.println(all);
		return all;
		
	}
}
