package com.newroad.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * 封装一个类，实现数据库的增删改查
 * @author Administrator
 *
 */
public class DBUtil {
	/**
	 * 封装属性
	 */
	private static String driver;
	private static String url;
	private static String user;
	private static String pwd;
	private static Connection conn=null;
	/**
	 * 在静态代码块中加载配置文件
	 */
	static {
		//创建Properties对象
		Properties p=new Properties();
		try {
			//加载配置文件
			p.load(DBUtil.class.getResourceAsStream("/jdbc.properties"));
			//从配置文件获取数据
			driver=p.getProperty("driver");
			url=p.getProperty("url");
			user=p.getProperty("user");
			pwd=p.getProperty("pwd");
			//加载驱动
			Class.forName(driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 执行增删改的操作
	 * @param sql SQL语句
	 * @param values ps的值
	 * @return int 受影响的行数
	 */
	public static int update(String sql,Object[] values) {
		//建立连接
		getConn();
		//创建执行语句
		PreparedStatement ps=null;
		int num=0;
		try {
			ps=conn.prepareStatement(sql);
			//给？赋值
			for(int i=0;i<values.length;i++) {
				//单独处理char
				if(values[i]==null) {
					continue;
				}
				if(values[i].getClass()==char.class) {
					ps.setObject(i+1, values[i]+"");
				}else {
					ps.setObject(i+1, values[i]);
				}
			}
			//执行sql语句
			num=ps.executeUpdate();
			return num;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(ps!=null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return num;
	}
	/**
	 * 实现查询
	 * @param sql
	 * @param values
	 * @return
	 */
	public static List<Map<String,String>> query(String sql,Object[] values){
		//连接数据库
		getConn();
		//存储查询结果
		List<Map<String,String>> list=new ArrayList<>();
		//创建执行语句
		PreparedStatement ps=null;
		//创建结果集
		ResultSet rs=null;
		//创建列的集合
		ResultSetMetaData rsmd=null;
		try {
			//开始查询
			ps=conn.prepareStatement(sql);
			if(values!=null&&values.length>0) {
				//给？赋值
				for(int i=0;i<values.length;i++) {
					//单独处理char
					if(values[i].getClass()==char.class) {
						ps.setObject(i+1, values[i]+"");
					}else {
						ps.setObject(i+1, values[i]);
					}
				}
			}
			    //执行sql语句
				rs=ps.executeQuery();
				//获得列数据
				rsmd=rs.getMetaData();
				//获得列长度
				int columnCount=rsmd.getColumnCount();
				//遍历结果集
				while(rs.next()) {
					Map<String,String> map=new HashMap<>();
					for(int i=1;i<=columnCount;i++) {
						String k=rsmd.getColumnName(i);
						String v=rs.getString(i);
						map.put(k, v);
					}
					list.add(map);
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//关闭资源
			if(rs!=null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(ps!=null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		return list;
	}
	public static Map<String,String> querySingle(String sql,Object[] values){
		List<Map<String, String>> list = query(sql, values);
		if(list.size()==0) {
			return null;
		}else {
			return list.get(0);
		}
	}
	/**
	 * 实现连接数据库
	 */
	private static void getConn() {
		try {
			if(conn==null||conn.isClosed()) {
				conn=DriverManager.getConnection(url, user, pwd);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
