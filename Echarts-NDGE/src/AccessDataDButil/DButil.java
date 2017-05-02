package AccessDataDButil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {
	
private Connection connection;
	
	public Connection getConnection(){
		
		try {
			//加载驱动
			Class.forName("org.gjt.mm.mysql.Driver");
			//驱动连接数据库
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/resou","root","wph");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//返回connection
		return connection;
	}
	public void ConnClose(){
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	

}
