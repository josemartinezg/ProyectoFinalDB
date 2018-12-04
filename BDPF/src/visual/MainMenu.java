package visual;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenu window = new MainMenu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 720, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnConfiguracinDelUsuario = new JMenu("Configuraci\u00F3n del Usuario");
		menuBar.add(mnConfiguracinDelUsuario);
		
		JMenuItem mntmInicioDeSesin = new JMenuItem("Inicio de Sesi\u00F3n");
		mntmInicioDeSesin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login logIn = new Login();
				logIn.setVisible(true);
				logIn.setVisible(true);
			}
		});
		mnConfiguracinDelUsuario.add(mntmInicioDeSesin);
		
		JMenu mnCreadores = new JMenu("Creadores");
		menuBar.add(mnCreadores);
		
		JMenuItem mntmDashboard = new JMenuItem("Dashboard");
		mnCreadores.add(mntmDashboard);
	}
}
