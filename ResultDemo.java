package org.dbUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultDemo {
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
		ResultSet rs = null;// �����ѯ���
		String sql = "SELECT * FROM student";
		try {
			Class.forName(DBDRIVER);
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();// ʵ����ResultSet����
			rs = stmt.executeQuery(sql);// ʵ����Result����
			while (rs.next()) {// ָ�������ƶ�
				int sno = rs.getInt("sno");// ȡ��sno������
				String sname = rs.getString("sname");// ȡ��sname������
				String dept = rs.getString("dept");// ȡ��dept������
				System.out.print("ѧ�ţ�" + sno);// ������
				System.out.print("������" + sname);// ���xingming
				System.out.print("Ժϵ��" + dept);// ���dept
				System.out.println("");// ����
			}
			rs.close();// �رս����
			stmt.close();// �����ر�
			conn.close();// �ر����ݿ�
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// ������������
		// ����MySQL���ݿ�ʱ��Ҫд�����ӵ��û���������

	}

}
