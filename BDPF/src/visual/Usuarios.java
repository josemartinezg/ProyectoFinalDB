package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Usuarios extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usuarios frame = new Usuarios();
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
	public Usuarios() {
		setTitle("Main Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 417, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.setBounds(10, 36, 380, 63);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UsuarioAgregar usuarioagregar = new UsuarioAgregar();
				usuarioagregar.setVisible(true);
				
			}
		});
		btnAgregar.setBounds(28, 29, 89, 23);
		panel.add(btnAgregar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UsuarioModificar usuariomodificar = new UsuarioModificar();
				usuariomodificar.setVisible(true);
			}
		});
		btnModificar.setBounds(145, 29, 89, 23);
		panel.add(btnModificar);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UsuarioBorrar usuarioborrar = new UsuarioBorrar ();
				usuarioborrar.setVisible(true);
			}
		});
		btnBorrar.setBounds(262, 29, 89, 23);
		panel.add(btnBorrar);
		
		JLabel lblUsuarios = new JLabel("Usuarios:");
		lblUsuarios.setBounds(10, 4, 71, 14);
		panel.add(lblUsuarios);
		lblUsuarios.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel_1.setBounds(10, 146, 380, 79);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblArtistas = new JLabel("Artistas:");
		lblArtistas.setBounds(10, 11, 62, 14);
		panel_1.add(lblArtistas);
		lblArtistas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnColeccion = new JButton("Coleccion");
		btnColeccion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ArtistasColeccion artistascoleccion = new ArtistasColeccion();
				artistascoleccion.setVisible(true);
				
			}
		});
		btnColeccion.setBounds(121, 43, 128, 23);
		panel_1.add(btnColeccion);
	}
}
