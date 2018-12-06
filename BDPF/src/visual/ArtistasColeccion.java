package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ArtistasColeccion extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArtistasColeccion frame = new ArtistasColeccion();
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
	public ArtistasColeccion() {
		setTitle("Informacion Artistas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1099, 581);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdArtista = new JLabel("Id Artista");
		lblIdArtista.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblIdArtista.setBounds(79, 47, 82, 16);
		contentPane.add(lblIdArtista);
		
		JList list = new JList();
		list.setBounds(12, 76, 208, 425);
		contentPane.add(list);
		
		JLabel lblInformacion = new JLabel("Informacion");
		lblInformacion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInformacion.setBounds(261, 47, 99, 16);
		contentPane.add(lblInformacion);
		
		JLabel lblNombreArtistico = new JLabel("Nombre Artistico");
		lblNombreArtistico.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombreArtistico.setBounds(244, 76, 123, 16);
		contentPane.add(lblNombreArtistico);
		
		textField = new JTextField();
		textField.setBounds(244, 102, 145, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPais = new JLabel("Pais");
		lblPais.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPais.setBounds(244, 137, 56, 16);
		contentPane.add(lblPais);
		
		textField_1 = new JTextField();
		textField_1.setBounds(244, 166, 145, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblAgrupacion = new JLabel("Agrupacion");
		lblAgrupacion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAgrupacion.setBounds(246, 212, 76, 16);
		contentPane.add(lblAgrupacion);
		
		textField_2 = new JTextField();
		textField_2.setBounds(244, 241, 145, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblRol = new JLabel("Rol");
		lblRol.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRol.setBounds(244, 276, 56, 16);
		contentPane.add(lblRol);
		
		textField_3 = new JTextField();
		textField_3.setBounds(244, 309, 145, 22);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblTemas = new JLabel("Temas");
		lblTemas.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTemas.setBounds(476, 47, 64, 16);
		contentPane.add(lblTemas);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(401, 74, 208, 114);
		contentPane.add(textArea);
		
		JLabel lblProducciones = new JLabel("Producciones");
		lblProducciones.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblProducciones.setBounds(675, 47, 133, 16);
		contentPane.add(lblProducciones);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(621, 74, 212, 114);
		contentPane.add(textArea_1);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Foto", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(226, 344, 169, 161);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(9, 15, 151, 136);
		panel.add(lblNewLabel);
		
		JLabel lblTituloTema = new JLabel("Titulo tema");
		lblTituloTema.setBounds(411, 213, 88, 16);
		contentPane.add(lblTituloTema);
		
		textField_4 = new JTextField();
		textField_4.setBounds(411, 241, 198, 22);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblFechaLanzamiento = new JLabel("Fecha Lanzamiento");
		lblFechaLanzamiento.setBounds(411, 277, 123, 16);
		contentPane.add(lblFechaLanzamiento);
		
		textField_5 = new JTextField();
		textField_5.setBounds(411, 309, 198, 22);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setBounds(411, 344, 56, 16);
		contentPane.add(lblGenero);
		
		textField_6 = new JTextField();
		textField_6.setBounds(411, 373, 198, 22);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblDuracion = new JLabel("Duracion");
		lblDuracion.setBounds(411, 408, 56, 16);
		contentPane.add(lblDuracion);
		
		textField_7 = new JTextField();
		textField_7.setBounds(411, 437, 198, 22);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblTituloProduccion = new JLabel("Titulo Produccion");
		lblTituloProduccion.setBounds(621, 213, 123, 16);
		contentPane.add(lblTituloProduccion);
		
		textField_8 = new JTextField();
		textField_8.setBounds(621, 241, 201, 22);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblFechaLanzamiento_1 = new JLabel("Fecha Lanzamiento");
		lblFechaLanzamiento_1.setBounds(621, 277, 123, 16);
		contentPane.add(lblFechaLanzamiento_1);
		
		textField_9 = new JTextField();
		textField_9.setBounds(621, 309, 201, 22);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(621, 408, 56, 16);
		contentPane.add(lblPrecio);
		
		textField_10 = new JTextField();
		textField_10.setBounds(621, 373, 201, 22);
		contentPane.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblTemasProduccion = new JLabel("Temas Produccion");
		lblTemasProduccion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTemasProduccion.setBounds(891, 48, 163, 16);
		contentPane.add(lblTemasProduccion);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(845, 74, 223, 114);
		contentPane.add(textArea_2);
		
		JLabel lblGeneroPrincipal = new JLabel("Genero Principal");
		lblGeneroPrincipal.setBounds(621, 344, 123, 16);
		contentPane.add(lblGeneroPrincipal);
		
		textField_11 = new JTextField();
		textField_11.setBounds(621, 437, 201, 22);
		contentPane.add(textField_11);
		textField_11.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Album Cover", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_1.setBounds(834, 213, 235, 207);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(12, 15, 211, 179);
		panel_1.add(label);
		
		JButton btnNewButton = new JButton("Volver\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton.setBounds(972, 496, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnPlay = new JButton("Play");
		btnPlay.setBounds(459, 496, 120, 25);
		contentPane.add(btnPlay);
	}
}
