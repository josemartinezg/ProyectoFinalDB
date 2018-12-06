package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class UsuarioModificar extends JFrame {

	private JPanel contentPane;
	private JTextField txtPais;
	private JTextField txtP_Apellido;
	private JTextField txtS_Apellido;
	private JTextField txtS_Nombre;
	private JTextField txtP_Nombre;
	private JTextField txtCedula;
	private JTextField txtContrasenna;
	private JTextField txtID;
	private JComboBox cbxGenero;
	private JComboBox cbxAnno;
	private JComboBox cbxMes;
	private JComboBox cbxDia;
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
					UsuarioModificar frame = new UsuarioModificar();
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
	public UsuarioModificar() {
		setTitle("Modificar Usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 480, 468);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("Volver");
		button.setBounds(247, 373, 107, 35);
		contentPane.add(button);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ID_Usuario = txtID.getText();
				String Contrasenna = txtContrasenna.getText();
				if (ID_Usuario != null && Contrasenna != null) {
					try {
						readDataBase(ID_Usuario, Contrasenna);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		btnModificar.setBounds(122, 373, 105, 35);
		contentPane.add(btnModificar);
		
		JLabel label = new JLabel("* Campos Obligatorios");
		label.setBounds(163, 341, 130, 19);
		contentPane.add(label);
		
		cbxGenero = new JComboBox();
		cbxGenero.setModel(new DefaultComboBoxModel(new String[] {"M", "F"}));
		cbxGenero.setEditable(true);
		cbxGenero.setBounds(246, 313, 89, 20);
		contentPane.add(cbxGenero);
		
		cbxAnno = new JComboBox();
		cbxAnno.setEditable(true);
		cbxAnno.setModel(new DefaultComboBoxModel(new String[] {"1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018"}));
		cbxAnno.setBounds(153, 313, 57, 20);
		contentPane.add(cbxAnno);
		
		JLabel label_1 = new JLabel("Genero:");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_1.setBounds(274, 271, 72, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("A\u00F1o:");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(181, 271, 46, 14);
		contentPane.add(label_2);
		
		cbxMes = new JComboBox();
		cbxMes.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		cbxMes.setEditable(true);
		cbxMes.setBounds(85, 313, 57, 20);
		contentPane.add(cbxMes);
		
		JLabel label_3 = new JLabel("Mes:");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_3.setBounds(112, 271, 46, 14);
		contentPane.add(label_3);
		
		cbxDia = new JComboBox();
		cbxDia.setEditable(true);
		cbxDia.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		cbxDia.setBounds(28, 313, 46, 20);
		contentPane.add(cbxDia);
		
		JLabel label_4 = new JLabel("Dia:");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_4.setBounds(56, 271, 46, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("Fecha Nacimiento:");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_5.setBounds(59, 244, 140, 14);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("Pais:");
		label_6.setHorizontalAlignment(SwingConstants.TRAILING);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_6.setBounds(40, 212, 72, 19);
		contentPane.add(label_6);
		
		txtPais = new JTextField();
		txtPais.setColumns(10);
		txtPais.setBounds(122, 211, 293, 20);
		contentPane.add(txtPais);
		
		txtP_Apellido = new JTextField();
		txtP_Apellido.setColumns(10);
		txtP_Apellido.setBounds(122, 178, 140, 20);
		contentPane.add(txtP_Apellido);
		
		JLabel label_7 = new JLabel("*");
		label_7.setBounds(267, 184, 21, 14);
		contentPane.add(label_7);
		
		txtS_Apellido = new JTextField();
		txtS_Apellido.setColumns(10);
		txtS_Apellido.setBounds(277, 179, 140, 20);
		contentPane.add(txtS_Apellido);
		
		txtS_Nombre = new JTextField();
		txtS_Nombre.setColumns(10);
		txtS_Nombre.setBounds(277, 138, 140, 20);
		contentPane.add(txtS_Nombre);
		
		JLabel label_8 = new JLabel("*");
		label_8.setBounds(267, 143, 21, 14);
		contentPane.add(label_8);
		
		txtP_Nombre = new JTextField();
		txtP_Nombre.setColumns(10);
		txtP_Nombre.setBounds(122, 138, 140, 20);
		contentPane.add(txtP_Nombre);
		
		JLabel label_9 = new JLabel("Apellidos:");
		label_9.setHorizontalAlignment(SwingConstants.TRAILING);
		label_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_9.setBounds(40, 179, 72, 19);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("Nombres:");
		label_10.setHorizontalAlignment(SwingConstants.TRAILING);
		label_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_10.setBounds(40, 140, 72, 14);
		contentPane.add(label_10);
		
		txtCedula = new JTextField();
		txtCedula.setEditable(false);
		txtCedula.setEnabled(false);
		txtCedula.setColumns(10);
		txtCedula.setBounds(140, 95, 275, 20);
		contentPane.add(txtCedula);
		
		JLabel label_11 = new JLabel("C\u00E9dula:");
		label_11.setHorizontalAlignment(SwingConstants.TRAILING);
		label_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_11.setBounds(38, 97, 90, 14);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("Contrase\u00F1a:");
		label_12.setFont(new Font("Tahoma", Font.BOLD, 14));
		label_12.setBounds(40, 55, 90, 14);
		contentPane.add(label_12);
		
		txtContrasenna = new JTextField();
		txtContrasenna.setColumns(10);
		txtContrasenna.setBounds(140, 53, 184, 20);
		contentPane.add(txtContrasenna);
		
		txtID = new JTextField();
		txtID.setColumns(10);
		txtID.setBounds(140, 13, 275, 20);
		contentPane.add(txtID);
		
		JLabel lblID = new JLabel("ID:");
		lblID.setHorizontalAlignment(SwingConstants.TRAILING);
		lblID.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblID.setBounds(56, 15, 72, 14);
		contentPane.add(lblID);
		
		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnVerificar.setBounds(336, 51, 81, 25);
		contentPane.add(btnVerificar);
		
		
	}
    public void readDataBase(String ID_Usuario, String Contrasenna) throws Exception {
        try {        	
        	String P_Nombre = txtP_Nombre.getText();
        	String S_Nombre = txtS_Nombre.getText();
        	String P_Apellido = txtP_Apellido.getText();
        	String S_Apellido = txtS_Apellido.getText();
        	String Pais = txtPais.getText();
        	String Anno = cbxAnno.getSelectedItem().toString();
        	String Dia = cbxDia.getSelectedItem().toString();
        	String Mes = cbxMes.getSelectedItem().toString();
        	String Genero = cbxGenero.getSelectedItem().toString();
        	String Fecha_Nacimiento = Anno + '-' + Mes + '-' + Dia;
        	Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/trabajofinaldb", "chema", "Nom@sde16");
            statement = connect.createStatement();
			resultSet = statement.executeQuery("SELECT Contrasenna from trabajofinaldb.usuario where ID_Usuario = USR0006;");
			if (resultSet.getString("Contrasenna") == Contrasenna) {
				if (P_Nombre != null) {
					statement.executeUpdate("UPDATE trabajofinaldb SET P_Nombre = " + P_Nombre + " WHERE ID_Usuario = " + ID_Usuario);
				}
				if (S_Nombre != null) {
					statement.executeUpdate("UPDATE trabajofinaldb SET S_Nombre = " + S_Nombre + " WHERE ID_Usuario = " + ID_Usuario);
				}
				if (P_Apellido != null) {
					statement.executeUpdate("UPDATE trabajofinaldb SET P_Apellido = " + P_Apellido + " WHERE ID_Usuario = " + ID_Usuario);
				}
				if (S_Apellido != null) {
					statement.executeUpdate("UPDATE trabajofinaldb SET S_Apellido = " + S_Apellido + " WHERE ID_Usuario = " + ID_Usuario);
				}
				if (Pais != null) {
					statement.executeUpdate("UPDATE trabajofinaldb SET Pais = " + Pais + " WHERE ID_Usuario = " + ID_Usuario);
				}
				if (Anno != null && Dia != null && Mes != null) {
					statement.executeUpdate("UPDATE trabajofinaldb SET Fecha_Nacimiento = " + Fecha_Nacimiento + " WHERE ID_Usuario = " + ID_Usuario);
				}		
				if (Genero != null) {
					statement.executeUpdate("UPDATE trabajofinaldb SET Genero = " + Genero + " WHERE ID_Usuario = " + ID_Usuario);
				}
			}
			preparedStatement.executeUpdate();
            //writeResultSet(resultSet);

            resultSet = statement
            .executeQuery("select * from trabajofinaldb.persona");
           // writeMetaData(resultSet);

        } catch (Exception e) {
            throw e;
        } finally {
            close();
        }

    }

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


