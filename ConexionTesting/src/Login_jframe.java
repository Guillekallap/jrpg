import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Login_jframe extends JFrame{
	Connection conn=null;
	ResultSet rs = null;
	PreparedStatement pst = null;
	private JTextField txt_username;
	private JPasswordField txt_password;
	public Login_jframe() {
		getContentPane().setLayout(null);
		conn=Javaconnect.ConnecrDb();
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Login", TitledBorder.LEFT, TitledBorder.BELOW_BOTTOM, null, Color.RED));
		panel.setBounds(96, 65, 221, 98);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("UserName");
		lblNewLabel.setBounds(10, 3, 69, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(10, 28, 69, 14);
		panel.add(lblNewLabel_1);
		
		txt_username = new JTextField();
		txt_username.setBounds(98, 0, 117, 20);
		panel.add(txt_username);
		txt_username.setColumns(10);
		
		txt_password = new JPasswordField();
		txt_password.setBounds(98, 25, 117, 20);
		panel.add(txt_password);
		
		JButton cmd_login = new JButton("Login");
		cmd_login.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent arg0) {
				String sql = "select * from Empoyee_info where username=? and password=?";
				try{
					pst = conn.prepareStatement(sql);
					pst.setString(1, txt_username.getText());
					pst.setString(2, txt_password.getText());
					
					rs=pst.executeQuery();
					if(rs.next()){
						JOptionPane.showMessageDialog(null, "Username and Password correctos");
						Employee_info s =new Employee_info();
						s.setVisible(true);
					}
					else{
						JOptionPane.showMessageDialog(null, "Username or Password Incorrectos");
					}
				}
				catch(Exception e){
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		cmd_login.setBounds(65, 53, 89, 23);
		panel.add(cmd_login);
	}
}
