package AccessDataDButil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {
	
private Connection connection;
	
	public Connection getConnection(){
		
		try {
			//��������
			Class.forName("org.gjt.mm.mysql.Driver");
			//�����������ݿ�
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/resou","root","wph");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//����connection
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
