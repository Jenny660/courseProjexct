package org.dbUtils;

//���ݿ��ɾ��
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
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
		Statement stmt = null;// ���ݿ����
		String sno = "20200140";// sno
		String sql = "DELETE FROM user WHERE sno=" + sno;// ƴ�ճ�һ��������SQL���
		try {
			Class.forName(DBDRIVER);
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();// ʵ����Statement����
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
