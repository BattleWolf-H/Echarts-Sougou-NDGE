package AccessDataDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import AccessDataDButil.DButil;
import DataModel.DataEntity;

public class AccessDao {
	
	Connection conn;
	DButil db;
	ResultSet set;
	Statement st;
	public List<DataEntity> getAttribute(String TableName){
		
		db=new DButil();
		conn=db.getConnection();
		
		String sql = "select name,value from "+TableName;
		List<DataEntity> list = new ArrayList<DataEntity>();
		try {
			st = conn.createStatement();
			set = st.executeQuery(sql);
			while (set.next()) {
				DataEntity entity = new DataEntity();
				entity.setName(set.getString("name"));
				entity.setValue(Float.parseFloat(set.getString("value")));
				list.add(entity);
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		return list;
	}

}
