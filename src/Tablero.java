import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;

public class Tablero extends JFrame {

	private JLabel[][] arrayTablero;
	public static final int FILAS = 9;
	public static final int COLUMNAS = 10;
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tablero frame = new Tablero();
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
	public Tablero() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(9, 10, 0, 0));
		
		crear();
	}
	
	private void crear() {
		
		arrayTablero = new JLabel[FILAS][COLUMNAS];
		int cont = 1;
		String contS;
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				if(cont != 90) {
					contS = Integer.toString(cont);
					arrayTablero[i][j] = new JLabel(contS);
					contentPane.add(arrayTablero[i][j]);
					cont++;
				}
			}
		}
		
	}

}