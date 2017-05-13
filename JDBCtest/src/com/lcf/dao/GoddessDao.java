package com.lcf.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.lcf.db.DBUtil;
import com.lcf.model.Goddess;

public class GoddessDao {

	public  void  addGoddess(){
		
	}
	public  void  updateGoddess(){
		
	}
	public  void delGoddess(){
		
	}
	//查询可能返回多个对象，所以用list
	public  List<Goddess> query() throws Exception{
		//获取那个连接后执行3.创建Statement对象
		Connection conn=DBUtil.getConnection();
		Statement  stmt=conn.createStatement();
		ResultSet rs=stmt.executeQuery("select  user_name,age from imooc_goddess");
		
		List<Goddess> gs=new ArrayList<Goddess>();
		Goddess g=null;
		while(rs.next()){
			g=new Goddess();
			g.setUser_name(rs.getString("user_name"));
			g.setAge(rs.getInt("age"));
			
			gs.add(g);
		}
		return  gs;
	}
	//查询单个对象
	public  Goddess get(){
		
		return  null;
	}
}
