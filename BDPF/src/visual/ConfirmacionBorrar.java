package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConfirmacionBorrar extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConfirmacionBorrar frame = new ConfirmacionBorrar();
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
	public ConfirmacionBorrar() {
		setTitle("Atenci\u00F3n!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 327, 128);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblestsSeguroDe = new JLabel("\u00BFEst\u00E1s seguro de querer borrar a este usuario?");
		lblestsSeguroDe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblestsSeguroDe.setBounds(10, 11, 414, 37);
		contentPane.add(lblestsSeguroDe);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			/*
			 * BORRAR
			 *
			 */
			public void actionPerformed(ActionEvent e) {
				/*
				 * CODIGO PARA BORRAR USUARIO
				 *
				 */
			}
		});
		btnConfirmar.setBounds(51, 55, 99, 23);
		contentPane.add(btnConfirmar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancelar.setBounds(172, 55, 89, 23);
		contentPane.add(btnCancelar);
	}

}
