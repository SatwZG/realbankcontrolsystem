package bank_dao;
import java.sql.*;
public class xiugai {
	public static void password(String Id, String key) throws Exception{
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			//��������
			conn = lianjie.getConn();
			//�������
			String sql1 = "update useifo set oldkey = keyo";
			String sql = "update useifo set keyo = ? where Id = ?";
			 st = conn.prepareStatement(sql1);
			 st.executeUpdate();
			 st = conn.prepareStatement(sql);
			 st.setString(1, key);
			 st.setString(2, Id);
			 st.executeUpdate(); 
		}finally {
			lianjie.free(rs,st,conn);//�ͷ���Դ
		}
	}
}
