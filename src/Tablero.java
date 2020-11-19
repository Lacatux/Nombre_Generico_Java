import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JButton;

public class Tablero extends JFrame {

	private JLabel[][] arrayTablero;
	public static final int FILAS = 9;
	public static final int COLUMNAS = 10;
	private int[] numeros;
	Random random = new Random();

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
		setTitle("Bingo");
		setResizable(false);
		setBounds(50, 150, 1350, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(9, 10, 0, 0));

		crear();

		numeros = new int[90];

		comprobar();


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
					arrayTablero[i][j].setFont(new Font("Tahoma", Font.BOLD, 25));
					arrayTablero[i][j].setOpaque(true);
				}
			}
		}

	}

	private void bolas(int pos) {
		boolean repetido = false;
		if (pos < 90) {
			do {
				repetido = false;
				if (pos == 0) {
					numeros[pos] = random.nextInt(89) + 1;
				} else {
					numeros[pos] = random.nextInt(89) + 1;
					for (int i = 0; i < pos; i++) {
						if (numeros[pos] == numeros[i]) {
							repetido = true;
						}
					}
				}
			} while (repetido);
		}
	}

	private void comprobar() {
		int num = 0;
		int k = 0;

		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				
					if(k < 89) {
						bolas(k);
						System.out.println(k);
						num = Integer.parseInt(arrayTablero[i][j].getText());
						if (numeros[k] == num) {
							arrayTablero[i][j].setBackground(Color.BLACK);
						}
						k++;
					}
				}
			}
		
	}

}