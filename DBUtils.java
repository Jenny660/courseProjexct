package org.dbUtils;

//�������ݿ�
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
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
			Class.forName(DBDRIVER);// ������������

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			// �������ݿ�ʱ��Ҫд�����ӵ��û���������
			conn = DriverManager.getConnection(url, user, password);
		}

		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(conn);
		try {
			conn.close();// ���ݿ�Ĺر�
		} catch (SQLException e) {
			e.printStackTrace();

		}

	}

}
