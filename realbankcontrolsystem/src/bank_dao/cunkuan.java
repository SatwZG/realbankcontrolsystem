package bank_dao;
import java.sql.*;
public class cunkuan {
	public static int add(double money, String Id) throws Exception{
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			//��������
			conn = lianjie.getConn();
			//�������
			if(find.findId(Id)==0)
				return 0;//�˺Ų�����
			else
			{String sql = "update useifo set money=money + ? where Id = ?";
			 st = conn.prepareStatement(sql);
			 st.setDouble(1, money);
			 st.setString(2, Id);
			//ִ�����
		
			st.executeUpdate();}
			
			
		}finally {
			lianjie.free(rs,st,conn);//�ͷ���Դ
		}
		return 1;
	}
	
}
