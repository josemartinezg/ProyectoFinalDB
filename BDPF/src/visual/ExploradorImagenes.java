package visual;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JFileChooser;
public class ExploradorImagenes extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExploradorImagenes frame = new ExploradorImagenes();
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
	public ExploradorImagenes() {
		JButton open = new JButton();
		JFileChooser fc = new JFileChooser();
		fc.setCurrentDirectory(new java.io.File("C:/Users/Vincent/Desktop"));
		fc.setDialogTitle("Buscar Imagen");
		fc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		if (fc.showOpenDialog(open) == JFileChooser.APPROVE_OPTION){
		//	
		}
	
		/*if (result == JFileChooser.APPROVE_OPTION) {
			file = fileChooser.getSelectedFile();
			dispose();
		}else if (result == JFileChooser.CANCEL_OPTION) {
			System.out.println("Cancelar se seleccionó");
		}
		contentPanel.add(fileChooser, BorderLayout.CENTER);*/
		
	}

}
