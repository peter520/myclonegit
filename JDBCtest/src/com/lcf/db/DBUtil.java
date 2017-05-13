package com.lcf.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DBUtil {
	
	private static final String URL="jdbc:oracle:thin:@localhost:1521:orcl";
	private static final String  USER="lcforacle";
	private static final String  PASSWORD="lcforacle";

	private static Connection  conn=null;
	//静态方法是执行最早的	
	static{
		try {
			//1.加载驱动
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//2.获得数据库的连接
			conn=DriverManager.getConnection(URL,USER,PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	//对外提供这个连接的方法
	public  static  Connection getConnection(){
		return  conn;
	}


}
