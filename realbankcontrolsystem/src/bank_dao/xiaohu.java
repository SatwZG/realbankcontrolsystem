package bank_dao;
import java.sql.*;
public class xiaohu {
	public static void delete(String Id) throws Exception{
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			//��������
			conn = lianjie.getConn();
			//�������
			String sql = "delete from useifo where Id = ?";
			 st = conn.prepareStatement(sql);
			 st.setString(1, Id);
			 st.executeUpdate(); 
		}finally {
			lianjie.free(rs,st,conn);//�ͷ���Դ
		}
	}
}
