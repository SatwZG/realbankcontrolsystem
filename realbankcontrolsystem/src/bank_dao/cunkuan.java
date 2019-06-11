package bank_dao;
import java.sql.*;
public class cunkuan {
	public static int add(double money, String Id) throws Exception{
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			//建立连接
			conn = lianjie.getConn();
			//创建语句
			if(find.findId(Id)==0)
				return 0;//账号不存在
			else
			{String sql = "update useifo set money=money + ? where Id = ?";
			 st = conn.prepareStatement(sql);
			 st.setDouble(1, money);
			 st.setString(2, Id);
			//执行语句
		
			st.executeUpdate();}
			
			
		}finally {
			lianjie.free(rs,st,conn);//释放资源
		}
		return 1;
	}
	
}
