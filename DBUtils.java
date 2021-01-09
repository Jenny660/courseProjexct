package org.dbUtils;

//连接数据库
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
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
			Class.forName(DBDRIVER);// 加载驱动程序

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			// 连接数据库时，要写上连接的用户名和密码
			conn = DriverManager.getConnection(url, user, password);
		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(conn);
		try {
			conn.close();// 数据库的关闭
		} catch (SQLException e) {
			e.printStackTrace();

		}

	}

}
