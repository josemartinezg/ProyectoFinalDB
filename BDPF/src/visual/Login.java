package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("Music Management Database");
		//ImageIcon windowIcon = new ImageIcon(this.getClass().getResource("/spotify_copyrighted-24.png"));
	     //setIconImage(windowIcon.getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Log in", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(40, 54, 72, 14);
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(40, 97, 72, 14);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(123, 54, 214, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(122, 96, 215, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(123, 146, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sign up");
		btnNewButton_1.setBounds(248, 146, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Recover");
		btnNewButton_2.setBounds(50, 214, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblForgotPassword = new JLabel("Forgot Password?");
		lblForgotPassword.setBounds(40, 184, 119, 19);
		lblForgotPassword.setForeground(Color.RED);
		lblForgotPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblForgotPassword);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(347, 41, 24, 32);
		//Image img=new ImageIcon(this.getClass().getResource("/Lock.png")).getImage(); 
		//lblNewLabel.setIcon(new ImageIcon(img));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(347, 97, 24, 20);
		//Image img2=new ImageIcon(this.getClass().getResource("/key.png")).getImage(); 
		//lblNewLabel_1.setIcon(new ImageIcon(img2));
		contentPane.add(lblNewLabel_1);
	}
}
