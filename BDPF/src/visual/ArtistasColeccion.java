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

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

public class ArtistasColeccion extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombreArtistico;
	private JTextField txtPais;
	private JTextField txtAgrupacion;
	private JTextField txtRol;
	private JTextField TituloTema;
	private JTextField txtFechaLanzamiento;
	private JTextField txtGenero;
	private JTextField textField_7;
	private JTextField txtTituloProduccion;
	private JTextField txtFecha_Lanzamiento;
	private JTextField txtGeneroPrincipal;
	private JTextField txtPrecio;
	private ArrayList<String> misArtistas = new ArrayList();
	
	private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;

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
		
		JList lstID_Artista = new JList();
		lstID_Artista.setBounds(12, 76, 208, 425);
		contentPane.add(lstID_Artista);
		
		JLabel lblInformacion = new JLabel("Informacion");
		lblInformacion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblInformacion.setBounds(261, 47, 99, 16);
		contentPane.add(lblInformacion);
		
		JLabel lblNombreArtistico = new JLabel("Nombre Artistico");
		lblNombreArtistico.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombreArtistico.setBounds(244, 76, 123, 16);
		contentPane.add(lblNombreArtistico);
		
		txtNombreArtistico = new JTextField();
		txtNombreArtistico.setBounds(244, 102, 145, 22);
		contentPane.add(txtNombreArtistico);
		txtNombreArtistico.setColumns(10);
		
		JLabel lblPais = new JLabel("Pais");
		lblPais.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPais.setBounds(244, 137, 56, 16);
		contentPane.add(lblPais);
		
		txtPais = new JTextField();
		txtPais.setBounds(244, 166, 145, 22);
		contentPane.add(txtPais);
		txtPais.setColumns(10);
		
		JLabel lblAgrupacion = new JLabel("Agrupacion");
		lblAgrupacion.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAgrupacion.setBounds(246, 212, 76, 16);
		contentPane.add(lblAgrupacion);
		
		txtAgrupacion = new JTextField();
		txtAgrupacion.setBounds(244, 241, 145, 22);
		contentPane.add(txtAgrupacion);
		txtAgrupacion.setColumns(10);
		
		JLabel lblRol = new JLabel("Rol");
		lblRol.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRol.setBounds(244, 276, 56, 16);
		contentPane.add(lblRol);
		
		txtRol = new JTextField();
		txtRol.setBounds(244, 309, 145, 22);
		contentPane.add(txtRol);
		txtRol.setColumns(10);
		
		JLabel lblTemas = new JLabel("Temas");
		lblTemas.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTemas.setBounds(476, 47, 64, 16);
		contentPane.add(lblTemas);
		
		JTextArea lstTema = new JTextArea();
		lstTema.setBounds(401, 74, 208, 114);
		contentPane.add(lstTema);
		
		JLabel lblProducciones = new JLabel("Producciones");
		lblProducciones.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblProducciones.setBounds(675, 47, 133, 16);
		contentPane.add(lblProducciones);
		
		JTextArea lstProducciones = new JTextArea();
		lstProducciones.setBounds(621, 74, 212, 114);
		contentPane.add(lstProducciones);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Foto", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(226, 344, 169, 161);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(9, 15, 151, 136);
		panel.add(lblNewLabel);
		
		JLabel lblTituloTema = new JLabel("Titulo Tema");
		lblTituloTema.setBounds(411, 213, 88, 16);
		contentPane.add(lblTituloTema);
		
		TituloTema = new JTextField();
		TituloTema.setBounds(411, 241, 198, 22);
		contentPane.add(TituloTema);
		TituloTema.setColumns(10);
		
		JLabel lblFechaLanzamiento = new JLabel("Fecha Lanzamiento");
		lblFechaLanzamiento.setBounds(411, 277, 123, 16);
		contentPane.add(lblFechaLanzamiento);
		
		txtFechaLanzamiento = new JTextField();
		txtFechaLanzamiento.setBounds(411, 309, 198, 22);
		contentPane.add(txtFechaLanzamiento);
		txtFechaLanzamiento.setColumns(10);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setBounds(411, 344, 56, 16);
		contentPane.add(lblGenero);
		
		txtGenero = new JTextField();
		txtGenero.setBounds(411, 373, 198, 22);
		contentPane.add(txtGenero);
		txtGenero.setColumns(10);
		
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
		
		txtTituloProduccion = new JTextField();
		txtTituloProduccion.setBounds(621, 241, 201, 22);
		contentPane.add(txtTituloProduccion);
		txtTituloProduccion.setColumns(10);
		
		JLabel lblFechaLanzamiento_1 = new JLabel("Fecha Lanzamiento");
		lblFechaLanzamiento_1.setBounds(621, 277, 123, 16);
		contentPane.add(lblFechaLanzamiento_1);
		
		txtFecha_Lanzamiento = new JTextField();
		txtFecha_Lanzamiento.setBounds(621, 309, 201, 22);
		contentPane.add(txtFecha_Lanzamiento);
		txtFecha_Lanzamiento.setColumns(10);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(621, 408, 56, 16);
		contentPane.add(lblPrecio);
		
		txtGeneroPrincipal = new JTextField();
		txtGeneroPrincipal.setBounds(621, 373, 201, 22);
		contentPane.add(txtGeneroPrincipal);
		txtGeneroPrincipal.setColumns(10);
		
		JLabel lblTemasProduccion = new JLabel("Temas Produccion");
		lblTemasProduccion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTemasProduccion.setBounds(891, 48, 163, 16);
		contentPane.add(lblTemasProduccion);
		
		JTextArea lstTemasProduccion = new JTextArea();
		lstTemasProduccion.setBounds(845, 74, 223, 114);
		contentPane.add(lstTemasProduccion);
		
		JLabel lblGeneroPrincipal = new JLabel("Genero Principal");
		lblGeneroPrincipal.setBounds(621, 344, 123, 16);
		contentPane.add(lblGeneroPrincipal);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(621, 437, 201, 22);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
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
				
			}
		});
		btnNewButton.setBounds(972, 496, 97, 25);
		contentPane.add(btnNewButton);
		
		JButton btnPlay = new JButton("Play");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					readDataBase();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				dispose();
			}
		});
		btnPlay.setBounds(459, 496, 120, 25);
		contentPane.add(btnPlay);
	}
	
	
	 public void readDataBase() throws Exception {
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            connect = DriverManager.getConnection("jdbc:mysql://localhost/trabajofinaldb", "chema", "Nom@sde16");
	            statement = connect.createStatement();
	            resultSet = statement.executeQuery("select * from trabajofinaldb.artistas");
	            writeResultSet(resultSet);

	        } catch (Exception e) {
	            throw e;
	        } finally {
	            close();
	        }

	    }

	    private void writeMetaData(ResultSet resultSet) throws SQLException {
	        //  Now get some metadata from the database
	        // Result set get the result of the SQL query

	        System.out.println("The columns in the table are: ");

	        System.out.println("Table: " + resultSet.getMetaData().getTableName(1));
	        for  (int i = 1; i<= resultSet.getMetaData().getColumnCount(); i++){
	            System.out.println("Column " +i  + " "+ resultSet.getMetaData().getColumnName(i));
	        }
	    }

	    private void writeResultSet(ResultSet resultSet) throws SQLException {
	        // ResultSet is initially before the first data set
	    	int ind = 0;
	        while (resultSet.next()) {
	            // It is possible to get the columns via name
	            // also possible to get the columns via the column number
	            // which starts at 1
	            // e.g. resultSet.getSTring(2);
	            String ID_Artista = resultSet.getString("ID_Artistas");
	            String Nombre_Artistico = resultSet.getString("Nombre_Artistico");
	            String Pais_Procedencia = resultSet.getString("Pais_Procedencia");
	            String Rol_Integrante = resultSet.getString("Rol_Integrante");
	            String Agrupacion = resultSet.getString("Agrupacion");
	            
	            txtNombreArtistico.setText(Nombre_Artistico);
	            txtRol.setText(Pais_Procedencia);
	            txtAgrupacion.setText(Agrupacion);
	            
	            System.out.println("Agrupacion: " + ID_Artista);
	            System.out.println("Nombre_Artistico: " + Nombre_Artistico);
	            System.out.println("Pais_Procedencia: " + Pais_Procedencia);
	            System.out.println("Rol_Integrante: " + Rol_Integrante);
	            System.out.println("Agrupacion: " + Agrupacion +"\n\n");
	            
	           // ArrayList[ind] arrArtistas;
	            ind++;
	            
	        }
	    }

	    // You need to close the resultSet
	    private void close() {
	        try {
	            if (resultSet != null) {
	                resultSet.close();
	            }

	            if (statement != null) {
	                statement.close();
	            }

	            if (connect != null) {
	                connect.close();
	            }
	        } catch (Exception e) {

        }
    }

}

