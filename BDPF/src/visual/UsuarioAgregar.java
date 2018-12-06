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

public class UsuarioAgregar extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Nuevo Usuario", TitledBorder.LEADING, TitledBorder.TOP, new Font("Arial", Font.PLAIN, 16), new Color(0, 0, 0)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdUsuario = new JLabel("Id Usuario");
		lblIdUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIdUsuario.setBounds(10, 33, 72, 14);
		contentPane.add(lblIdUsuario);
		
		JLabel lblNombres = new JLabel("Nombres");
		lblNombres.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombres.setBounds(10, 102, 72, 14);
		contentPane.add(lblNombres);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblApellidos.setBounds(10, 142, 72, 14);
		contentPane.add(lblApellidos);
		
		JLabel lblContrasena = new JLabel("Contrasena");
		lblContrasena.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblContrasena.setBounds(10, 71, 72, 14);
		contentPane.add(lblContrasena);
		
		textField = new JTextField();
		textField.setBounds(92, 32, 255, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(92, 101, 101, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(243, 101, 104, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(92, 141, 101, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(243, 141, 104, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(92, 70, 209, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Aqui se debe poner que se ingrese a la BD y que se cierre la ventana
			
			}
		});
		btnAgregar.setBounds(92, 404, 89, 23);
		contentPane.add(btnAgregar);
		
		JLabel label = new JLabel("*");
		label.setBounds(203, 104, 46, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("*");
		label_1.setBounds(203, 144, 46, 14);
		contentPane.add(label_1);
		
		JLabel lblCamposObligatorios = new JLabel("* Campos Obligatorios");
		lblCamposObligatorios.setBounds(10, 379, 183, 14);
		contentPane.add(lblCamposObligatorios);
		
		JLabel label_2 = new JLabel("*");
		label_2.setBounds(311, 73, 46, 14);
		contentPane.add(label_2);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	            Usuarios usuarios = new Usuarios();
	         
				dispose();

				
			}
		});
		btnVolver.setBounds(237, 404, 89, 23);
		contentPane.add(btnVolver);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento");
		lblFechaNacimiento.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFechaNacimiento.setBounds(10, 177, 140, 14);
		contentPane.add(lblFechaNacimiento);
		
		JLabel lblDia = new JLabel("Dia");
		lblDia.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDia.setBounds(10, 202, 46, 14);
		contentPane.add(lblDia);
		
		JLabel lblMes = new JLabel("Mes");
		lblMes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMes.setBounds(109, 202, 46, 14);
		contentPane.add(lblMes);
		
		JLabel lblAnyo = new JLabel("Anyo");
		lblAnyo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAnyo.setBounds(203, 202, 46, 14);
		contentPane.add(lblAnyo);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEditable(true);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox.setBounds(10, 227, 46, 20);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"}));
		comboBox_1.setEditable(true);
		comboBox_1.setBounds(98, 227, 57, 20);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setEditable(true);
	
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018"}));
		comboBox_2.setBounds(192, 227, 57, 20);
		contentPane.add(comboBox_2);
		
		JLabel lblGenero = new JLabel("Genero");
		lblGenero.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGenero.setBounds(10, 287, 72, 14);
		contentPane.add(lblGenero);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Hombre", "Mujer"}));
		comboBox_3.setEditable(true);
		comboBox_3.setBounds(10, 312, 89, 20);
		contentPane.add(comboBox_3);
		
		JLabel label_3 = new JLabel("*");
		label_3.setBounds(55, 289, 46, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("*");
		label_4.setBounds(119, 179, 46, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("*");
		label_5.setBounds(355, 35, 46, 14);
		contentPane.add(label_5);
	}
}
