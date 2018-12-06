package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class UsuarioAgregar extends JFrame {

	private JPanel contentPane;
	private JTextField txtIDPersona;
	private JTextField txtP_Nombre;
	private JTextField txtS_Nombre;
	private JTextField txtP_Apellido;
	private JTextField txtS_Apellido;
	private JTextField txtContrasenna;
	private JComboBox cbxDia;
	private JComboBox cbxMes;
	private JComboBox cbxAnno;
	private JComboBox cbxGenero;
	
	/*private String ID_Persona;
	private String P_Nombre; 
	private String S_Nombre; 
	private String P_Apellido; 
	private String S_Apellido; 
	private String dia; 
	private String mes; 
	private String anno; 
	private String Fecha_Nacimiento; 
	private String genero;
	private String Pais;
	private String Cedula;*/
	private String Contrasenna;
	
	private Connection connect = null;
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
    private JTextField txtPais;
    private JTextField txtCedula;
    


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UsuarioAgregar frame = new UsuarioAgregar();
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
	public UsuarioAgregar() {
		
		setTitle("Registro de Usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 447, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Nuevo Usuario", TitledBorder.LEADING, TitledBorder.TOP, new Font("Arial", Font.PLAIN, 16), new Color(0, 0, 0)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblID = new JLabel("ID:");
		lblID.setHorizontalAlignment(SwingConstants.TRAILING);
		lblID.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblID.setBounds(28, 34, 72, 14);
		contentPane.add(lblID);
		
		JLabel lblNombres = new JLabel("Nombres:");
		lblNombres.setHorizontalAlignment(SwingConstants.TRAILING);
		lblNombres.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNombres.setBounds(12, 159, 72, 14);
		contentPane.add(lblNombres);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setHorizontalAlignment(SwingConstants.TRAILING);
		lblApellidos.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblApellidos.setBounds(12, 198, 72, 19);
		contentPane.add(lblApellidos);
		
		JLabel lblContrasena = new JLabel("Contrase\u00F1a:");
		lblContrasena.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblContrasena.setBounds(12, 74, 90, 14);
		contentPane.add(lblContrasena);
		
		txtIDPersona = new JTextField();
		txtIDPersona.setBounds(112, 32, 275, 20);
		contentPane.add(txtIDPersona);
		txtIDPersona.setColumns(10);
		
		
		
		txtP_Nombre = new JTextField();
		txtP_Nombre.setBounds(94, 157, 140, 20);
		contentPane.add(txtP_Nombre);
		txtP_Nombre.setColumns(10);
		
		
		txtS_Nombre = new JTextField();
		txtS_Nombre.setBounds(249, 157, 140, 20);
		contentPane.add(txtS_Nombre);
		txtS_Nombre.setColumns(10);
		
		
		txtP_Apellido = new JTextField();
		txtP_Apellido.setBounds(94, 197, 140, 20);
		contentPane.add(txtP_Apellido);
		txtP_Apellido.setColumns(10);
		
		
		txtS_Apellido = new JTextField();
		txtS_Apellido.setBounds(249, 198, 140, 20);
		contentPane.add(txtS_Apellido);
		txtS_Apellido.setColumns(10);
		
		
		txtContrasenna = new JTextField();
		txtContrasenna.setBounds(112, 72, 275, 20);
		contentPane.add(txtContrasenna);
		txtContrasenna.setColumns(10);
		
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String ID_Persona = txtIDPersona.getText();
					String P_Nombre = txtP_Nombre.getText();
					String S_Nombre = txtS_Nombre.getText();
					String P_Apellido = txtP_Apellido.getText();
					String S_Apellido = txtS_Apellido.getText();
					String Contrasenna = txtContrasenna.getText();
					String dia = cbxDia.getSelectedItem().toString();
					String mes = cbxMes.getSelectedItem().toString();
					String anno = cbxAnno.getSelectedItem().toString();
					String genero = cbxGenero.getSelectedItem().toString();
					String Pais = txtPais.getText();
					String Cedula = txtCedula.getText();
					String Fecha_Nacimiento = anno + '-' + mes + '-' + dia;
					readDataBase( ID_Persona, P_Nombre, S_Nombre, P_Apellido, S_Apellido, Fecha_Nacimiento, genero, Pais, Cedula);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			
			}
		});
		btnAgregar.setBounds(102, 369, 105, 35);
		contentPane.add(btnAgregar);
		
		JLabel label = new JLabel("*");
		label.setBounds(239, 162, 21, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("*");
		label_1.setBounds(239, 203, 21, 14);
		contentPane.add(label_1);
		
		JLabel lblCamposObligatorios = new JLabel("* Campos Obligatorios");
		lblCamposObligatorios.setBounds(141, 346, 130, 19);
		contentPane.add(lblCamposObligatorios);
		
		JLabel label_2 = new JLabel("*");
		label_2.setBounds(388, 72, 21, 14);
		contentPane.add(label_2);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            Usuarios usuarios = new Usuarios();
	         
				dispose();

				
			}
		});
		btnVolver.setBounds(219, 369, 107, 35);
		contentPane.add(btnVolver);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento:");
		lblFechaNacimiento.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFechaNacimiento.setBounds(31, 263, 140, 14);
		contentPane.add(lblFechaNacimiento);
		
		JLabel lblDia = new JLabel("Dia:");
		lblDia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDia.setBounds(28, 290, 46, 14);
		contentPane.add(lblDia);
		
		JLabel lblMes = new JLabel("Mes:");
		lblMes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMes.setBounds(84, 290, 46, 14);
		contentPane.add(lblMes);
		
		JLabel lblAnno = new JLabel("A\u00F1o:");
		lblAnno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAnno.setBounds(153, 290, 46, 14);
		contentPane.add(lblAnno);
		
		cbxDia = new JComboBox();
		cbxDia.setEditable(true);
		cbxDia.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		cbxDia.setBounds(28, 313, 46, 20);
		contentPane.add(cbxDia);
		
		
		
		cbxMes = new JComboBox();
		cbxMes.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		cbxMes.setEditable(true);
		cbxMes.setBounds(85, 313, 57, 20);
		contentPane.add(cbxMes);
		
		
		cbxAnno = new JComboBox();
		cbxAnno.setEditable(true);
		cbxAnno.setModel(new DefaultComboBoxModel(new String[] {"1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018"}));
		cbxAnno.setBounds(153, 313, 57, 20);
		contentPane.add(cbxAnno);
		
		
		JLabel lblGenero = new JLabel("Genero:");
		lblGenero.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblGenero.setBounds(246, 290, 72, 14);
		contentPane.add(lblGenero);
		
		
		
		cbxGenero = new JComboBox();
		cbxGenero.setModel(new DefaultComboBoxModel(new String[] {"M", "F"}));
		cbxGenero.setEditable(true);
		cbxGenero.setBounds(246, 313, 89, 20);
		contentPane.add(cbxGenero);
		
		
		JLabel label_3 = new JLabel("*");
		label_3.setForeground(Color.RED);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_3.setBounds(305, 291, 21, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("*");
		label_4.setForeground(Color.RED);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_4.setBounds(156, 264, 15, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("*");
		label_5.setBounds(388, 34, 21, 14);
		contentPane.add(label_5);
		
		JLabel lblPais = new JLabel("Pais:");
		lblPais.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPais.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPais.setBounds(12, 231, 72, 19);
		contentPane.add(lblPais);
		
		txtPais = new JTextField();
		txtPais.setColumns(10);
		txtPais.setBounds(94, 230, 293, 20);
		contentPane.add(txtPais);
		
		
		txtCedula = new JTextField();
		txtCedula.setColumns(10);
		txtCedula.setBounds(112, 114, 275, 20);
		contentPane.add(txtCedula);
		
		
		JLabel lblCedula = new JLabel("C\u00E9dula:");
		lblCedula.setHorizontalAlignment(SwingConstants.TRAILING);
		lblCedula.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCedula.setBounds(10, 116, 90, 14);
		contentPane.add(lblCedula);
		
	}
    public void readDataBase(String ID_Persona, String P_Nombre, String S_Nombre, String P_Apellido, String S_Apellido, String Fecha_Nacimiento, String genero, String Pais, String Cedula) throws Exception {
        try {
            // This will load the MySQL driver, each DB has its own driver
            Class.forName("com.mysql.jdbc.Driver");
            // Setup the connection with the DB
            connect = DriverManager.getConnection("jdbc:mysql://localhost/trabajofinaldb", "chema", "Nom@sde16");

            // Statements allow to issue SQL queries to the database
            statement = connect.createStatement();
            // Result set get the result of the SQL query
            resultSet = statement
                    .executeQuery("select * from trabajofinaldb.persona");
            writeResultSet(resultSet);

            // PreparedStatements can use variables and are more efficient
            preparedStatement = connect
                    .prepareStatement("insert into trabajofinaldb.persona values (?, ?, ?, ?, ? , ?, ?, ?, ?)");
            // "myuser, webpage, datum, summary, COMMENTS from feedback.comments");
            // Parameters start with 1
            
            preparedStatement.setString(1, ID_Persona);
            preparedStatement.setString(2, P_Nombre);
            preparedStatement.setString(3, S_Nombre);
            preparedStatement.setString(4, P_Apellido);
            preparedStatement.setString(5, S_Apellido);
            preparedStatement.setString(6, Fecha_Nacimiento);
            preparedStatement.setString(7, genero);
            preparedStatement.setString(8, Pais);
            preparedStatement.setString(9, Cedula);
            preparedStatement.executeUpdate();

            preparedStatement = connect
                    .prepareStatement("SELECT ID_Persona, P_Nombre, S_Nombre, P_Apellido, S_Apellido, Fecha_Nacimiento, Genero, Pais, Cedula from trabajofinaldb.persona");
            resultSet = preparedStatement.executeQuery();
            writeResultSet(resultSet);

            /*// Remove again the insert comment
            preparedStatement = connect
            .prepareStatement("delete from feedback.comments where myuser= ? ; ");
            preparedStatement.setString(1, "Test");
            preparedStatement.executeUpdate();*/

            resultSet = statement
            .executeQuery("select * from trabajofinaldb.persona");
            writeMetaData(resultSet);

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
        while (resultSet.next()) {
            // It is possible to get the columns via name
            // also possible to get the columns via the column number
            // which starts at 1
            // e.g. resultSet.getSTring(2);
            String id = resultSet.getString("ID_Persona");
            String primNomb = resultSet.getString("P_Nombre");
            String segNomb = resultSet.getString("S_Nombre");
            String pApell = resultSet.getString("P_Apellido");
            String sApell = resultSet.getString("S_Apellido");
            String fNacim = resultSet.getString("Fecha_Nacimiento");
            String gen = resultSet.getString("Genero");
            System.out.println("ID_Persona: " + id);
            System.out.println("P_Nombre: " + primNomb);
            System.out.println("P_Apellido: " + pApell);
            System.out.println("Fecha_Nacimiento: " + fNacim);
            System.out.println("Genero: " + fNacim);
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


