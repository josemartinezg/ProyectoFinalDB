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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class UsuarioBorrar extends JFrame {

	private JPanel contentPane;
	private JTextField txtID_Usuario;
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
					UsuarioBorrar frame = new UsuarioBorrar();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws Exception 
	 */
	public UsuarioBorrar(){


		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 155);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("ID Usuario");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(20, 31, 72, 14);
		contentPane.add(label);
		
		txtID_Usuario = new JTextField();
		txtID_Usuario.setColumns(10);
		txtID_Usuario.setBounds(102, 30, 255, 20);
		contentPane.add(txtID_Usuario);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent e) {
				String ID_Usuario = txtID_Usuario.getText();
				if (ID_Usuario != null) {
					int borrar = JOptionPane.showConfirmDialog(null, "¿Desea eliminar este elemento?" + ID_Usuario, "Información", JOptionPane.YES_NO_OPTION);
					if (borrar == JOptionPane.YES_OPTION) {
						try {
							readDataBase(ID_Usuario);
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
						}
					
				}
			}
		});
		btnBorrar.setBounds(102, 82, 89, 23);
		contentPane.add(btnBorrar);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnVolver.setBounds(264, 82, 89, 23);
		contentPane.add(btnVolver);
	}


	    public void readDataBase(String ID_Usuario) throws Exception {
	        try {
	            /*int borrar = JOptionPane.showConfirmDialog(null, "¿Desea eliminar este elemento?" + ID_Usuario, "Información", JOptionPane.YES_NO_OPTION);
					if (borrar == JOptionPane.YES_OPTION) {
						try {
							preparedStatement = connect.prepareStatement("DELETE from trabajofinadb.usuario where ID_Usuario = ? ;");
							preparedStatement.setString(1, ID_Usuario);
							resultSet = preparedStatement.executeQuery();
							//writeResultSet(resultSet);
						} catch (SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}*/	        	
	            Class.forName("com.mysql.jdbc.Driver");
	            connect = DriverManager.getConnection("jdbc:mysql://localhost/trabajofinaldb", "chema", "Nom@sde16");
	            statement = connect.createStatement();
	            preparedStatement = connect.prepareStatement("DELETE from trabajofinaldb.usuario where ID_Usuario = ? ;");
				preparedStatement.setString(1, ID_Usuario);
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

