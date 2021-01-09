package org.dbUtils;

//数据库的修改
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
	// 定义mysql的数据库驱动程序
	public static final String url = "jdbc:mysql://localhost:3306/course?serverTimezone=UTC";
	// 定义mysql数据库的连接地址
	public static final String DBDRIVER = "com.mysql.cj.jdbc.Driver";
	// mysql数据库的连接用户名
	public static final String user = "root";
	// Mysql数据库的连接密码
	public static final String password = "123456";

	public static void main(String agrs[]) {
		Connection conn = null;// 数据库连接

		try {
			Class.forName(DBDRIVER);
			conn = DriverManager.getConnection(url, user, password);
			Statement stmt = null;// 数据库操作
			String sno = "20200140";// sno
			String sname = "";
			String password = "mldn";// 密码
			String site = "";
			String className = "";
			String classroom = "";
			String dept = "";
			String sql = "APDATE user SET sname='" + sname + "',site='" + site + "',class='" + className
					+ "',classroom='" + classroom + "',dept='" + dept + "' WHERE sno='" + sno + "'";// 拼凑一个完整的SQL语句Demo

			stmt.executeUpdate(sql);// 执行数据库更行操作
			stmt.close();// 操作关闭
			conn.close();// 关闭数据库
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
