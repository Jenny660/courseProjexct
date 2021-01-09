package org.dbUtils;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

public class LoginDia extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	/**
	 * @wbp.nonvisual location=-14,394
	 */
	private final JList list_1 = new JList();
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginDia frame = new LoginDia();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
					
					
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginDia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 534, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUser = new JLabel("\u7528\u6237\u540D\uFF1A");
		lblUser.setFont(new Font("宋体", Font.PLAIN, 20));
		lblUser.setBounds(127, 84, 80, 42);
		contentPane.add(lblUser);
		
		JButton btnOk = new JButton("\u767B\u5F55");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("登录成功");
			}
		});
		
		btnOk.setFont(new Font("宋体", Font.PLAIN, 20));
		btnOk.setBounds(127, 259, 97, 42);
		contentPane.add(btnOk);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(493, 155, 17, 372);
		contentPane.add(scrollBar);
		
		JLabel label = new JLabel("\u5BC6\u7801\uFF1A");
		label.setFont(new Font("宋体", Font.PLAIN, 21));
		label.setBounds(127, 143, 80, 23);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("\u7528\u6237\u7C7B\u578B");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 20));
		lblNewLabel.setBounds(124, 194, 83, 25);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("\u6E05\u9664");
		btnNewButton.setFont(new Font("宋体", Font.PLAIN, 21));
		btnNewButton.setBounds(314, 259, 97, 42);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(242, 142, 123, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u5409\u9996\u5927\u5B66\u6392\u8BFE\u7CFB\u7EDF");
		lblNewLabel_1.setFont(new Font("宋体", Font.PLAIN, 27));
		lblNewLabel_1.setBounds(156, 24, 227, 30);
		contentPane.add(lblNewLabel_1);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("");
		tglbtnNewToggleButton.setBounds(242, 189, 123, 30);
		contentPane.add(tglbtnNewToggleButton);
		
		textField_1 = new JTextField();
		textField_1.setBounds(242, 96, 123, 30);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}
