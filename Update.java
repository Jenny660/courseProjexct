package org.dbUtils;

//���ݿ���޸�
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
	// ����mysql�����ݿ���������
	public static final String url = "jdbc:mysql://localhost:3306/course?serverTimezone=UTC";
	// ����mysql���ݿ�����ӵ�ַ
	public static final String DBDRIVER = "com.mysql.cj.jdbc.Driver";
	// mysql���ݿ�������û���
	public static final String user = "root";
	// Mysql���ݿ����������
	public static final String password = "123456";

	public static void main(String agrs[]) {
		Connection conn = null;// ���ݿ�����

		try {
			Class.forName(DBDRIVER);
			conn = DriverManager.getConnection(url, user, password);
			Statement stmt = null;// ���ݿ����
			String sno = "20200140";// sno
			String sname = "";
			String password = "mldn";// ����
			String site = "";
			String className = "";
			String classroom = "";
			String dept = "";
			String sql = "APDATE user SET sname='" + sname + "',site='" + site + "',class='" + className
					+ "',classroom='" + classroom + "',dept='" + dept + "' WHERE sno='" + sno + "'";// ƴ��һ��������SQL���Demo

			stmt.executeUpdate(sql);// ִ�����ݿ���в���
			stmt.close();// �����ر�
			conn.close();// �ر����ݿ�
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
