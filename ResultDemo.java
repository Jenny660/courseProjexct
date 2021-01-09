package org.dbUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultDemo {
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

		Statement stmt = null;// 数据库操作
		ResultSet rs = null;// 保存查询结果
		String sql = "SELECT * FROM student";
		try {
			Class.forName(DBDRIVER);
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();// 实例化ResultSet对象
			rs = stmt.executeQuery(sql);// 实例化Result对象
			while (rs.next()) {// 指针向下移动
				int sno = rs.getInt("sno");// 取得sno的内容
				String sname = rs.getString("sname");// 取得sname的内容
				String dept = rs.getString("dept");// 取得dept的内容
				System.out.print("学号：" + sno);// 输出编号
				System.out.print("姓名：" + sname);// 输出xingming
				System.out.print("院系：" + dept);// 输出dept
				System.out.println("");// 换行
			}
			rs.close();// 关闭结果集
			stmt.close();// 操作关闭
			conn.close();// 关闭数据库
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 加载驱动程序
		// 连接MySQL数据库时，要写上连接的用户名和密码

	}

}
