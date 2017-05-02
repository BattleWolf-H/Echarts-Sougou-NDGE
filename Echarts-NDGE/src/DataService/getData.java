package DataService;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import AccessDataDAO.AccessDao;
import DataModel.DataEntity;

public class getData extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//±‡¬Î¿‡–Õ
		response.setContentType("text/html;charset=utf-8");
		String[] dbName= {"movie","animation","book","people","auto","game","song","tvplay","tvshow"};
		AccessDao dao=new AccessDao();
		List<DataEntity> list0,list1,list2,list3,list4,list5,list6,list7,list8;
		list0=dao.getAttribute(dbName[0]);
		list1=dao.getAttribute(dbName[1]);
		list2=dao.getAttribute(dbName[2]);
		list3=dao.getAttribute(dbName[3]);
		list4=dao.getAttribute(dbName[4]);
		list5=dao.getAttribute(dbName[5]);
		list6=dao.getAttribute(dbName[6]);
		list7=dao.getAttribute(dbName[7]);
		list8=dao.getAttribute(dbName[8]);
		String jsonString0=JSON.toJSONString(list0);
		String jsonString1="?"+JSON.toJSONString(list1);
		String jsonString2="?"+JSON.toJSONString(list2);
		String jsonString3="?"+JSON.toJSONString(list3);
		String jsonString4="?"+JSON.toJSONString(list4);
		String jsonString5="?"+JSON.toJSONString(list5);
		String jsonString6="?"+JSON.toJSONString(list6);
		String jsonString7="?"+JSON.toJSONString(list7);
		String jsonString8="?"+JSON.toJSONString(list8);
		System.err.println(jsonString0);
		System.err.println(jsonString1);
		System.err.println(jsonString2);
		System.err.println(jsonString3);
		System.err.println(jsonString4);
		System.err.println(jsonString5);
		System.err.println(jsonString6);
		System.err.println(jsonString7);
		System.err.println(jsonString8);
		PrintWriter out = response.getWriter();
		out.print(jsonString0);
		out.print(jsonString1);
		out.print(jsonString2);
		out.print(jsonString3);
		out.print(jsonString4);
		out.print(jsonString5);
		out.print(jsonString6);
		out.print(jsonString7);
		out.print(jsonString8);
		//System.out.println(list.toString());
		out.flush();
		out.close();
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
