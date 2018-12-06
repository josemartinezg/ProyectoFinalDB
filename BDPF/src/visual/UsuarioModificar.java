package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UsuarioModificar extends JFrame {

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
		setBounds(100, 100, 450, 395);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Id Usuario");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(10, 28, 72, 14);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(92, 27, 255, 20);
		contentPane.add(textField);
		
		JLabel label_1 = new JLabel("Contrasena");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(10, 66, 72, 14);
		contentPane.add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(92, 65, 209, 20);
		contentPane.add(textField_1);
		
		JLabel label_2 = new JLabel("*");
		label_2.setBounds(311, 68, 46, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("*");
		label_3.setBounds(355, 30, 46, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("Nombres");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_4.setBounds(10, 97, 72, 14);
		contentPane.add(label_4);
		//
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setEnabled(false);
		textField_2.setColumns(10);
		textField_2.setBounds(92, 96, 101, 20);
		contentPane.add(textField_2);
		
		JLabel label_5 = new JLabel("*");
		label_5.setBounds(203, 99, 46, 14);
		contentPane.add(label_5);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setEnabled(false);
		textField_3.setColumns(10);
		textField_3.setBounds(243, 96, 104, 20);
		contentPane.add(textField_3);
		
		JLabel label_6 = new JLabel("Apellidos");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_6.setBounds(10, 137, 72, 14);
		contentPane.add(label_6);
		
		textField_4 = new JTextField();
		textField_4.setEnabled(false);
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBounds(92, 136, 101, 20);
		contentPane.add(textField_4);
		
		JLabel label_7 = new JLabel("*");
		label_7.setBounds(203, 139, 46, 14);
		contentPane.add(label_7);
		
		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setEnabled(false);
		textField_5.setColumns(10);
		textField_5.setBounds(243, 136, 104, 20);
		contentPane.add(textField_5);
		
		JLabel label_8 = new JLabel("Fecha Nacimiento");
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_8.setBounds(10, 172, 140, 14);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("Dia");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_9.setBounds(10, 197, 46, 14);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("Mes");
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_10.setBounds(109, 197, 46, 14);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("Anyo");
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_11.setBounds(203, 197, 46, 14);
		contentPane.add(label_11);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setEnabled(false);
		comboBox.setEditable(false);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1900", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018"}));
		
		comboBox.setBounds(192, 222, 57, 20);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setEnabled(false);
		comboBox_1.setEditable(false);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"JAN", "FEB", "MAR", "APR", "MAY", "JUN", "JUL", "AUG", "SEP", "OCT", "NOV", "DEC"}));
		comboBox_1.setBounds(98, 222, 57, 20);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setEnabled(false);
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_2.setEditable(false);
		
		comboBox_2.setBounds(10, 222, 46, 20);
		contentPane.add(comboBox_2);
		
		JLabel label_12 = new JLabel("Genero");
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_12.setBounds(10, 282, 72, 14);
		contentPane.add(label_12);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setEnabled(false);
		comboBox_3.setEditable(false);
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Hombre", "Mujer"}));
		comboBox_3.setBounds(10, 307, 89, 20);
		contentPane.add(comboBox_3);
		
		JButton btnVerificar = new JButton("Verificar");
		//Verificar si es el ID y la contrasena correcta
		/*
		btnVerificar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				//CONDICION
				//if()
			
		textField_2.setEditable(true);
		textField_2.setEnabled(true);
	
		textField_3.setEditable(true);
		textField_3.setEnabled(true);
		
		textField_4.setEnabled(true);
		textField_4.setEditable(true);
	
		textField_5.setEditable(true);
		textField_5.setEnabled(true);
	
		comboBox.setEnabled(true);
		comboBox.setEditable(true);

		comboBox_1.setEnabled(true);
		comboBox_1.setEditable(true);
	
		comboBox_2.setEnabled(true);
		comboBox_2.setEditable(true);

		comboBox_3.setEnabled(true);
		comboBox_3.setEditable(true);

				
			}
		});
	*/
		btnVerificar.setBounds(335, 64, 89, 23);
		contentPane.add(btnVerificar);
		
		JButton btnGuardar = new JButton("Guardar");
		/*Aqui se deberian de guardar los cambios en la base de datos
		 * realizados en la ventana
		 */
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardar.setBounds(191, 306, 89, 23);
		contentPane.add(btnGuardar);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnVolver.setBounds(335, 306, 89, 23);
		contentPane.add(btnVolver);
		
		
	}
	

}
