import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class Tablero extends JFrame {
	
	//Declaración de todas las variables necesarias para el programa
	private JLabel[] arrayTablero;
	private int[] numeros;
	Random random = new Random();
	private javax.swing.Timer timer;
	private int cont = 0;
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
		//Temporizador en el cual cada 10 segundos saca una bola *4
		timer = new javax.swing.Timer(10000, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (cont < 89) {
					marcar(sacaBola(cont), cont);
					cont++;
				} else {
					timer.stop();
					JOptionPane.showMessageDialog(contentPane, "¡Ya se han recorrido todos los números!", "Aviso", EXIT_ON_CLOSE);
				}

			}
		});
		
		//Creacion de la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Bingo");
		setResizable(false);
		setBounds(50, 150, 1350, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(9, 10, 0, 0));

		crear();

		JLabel spacer = new JLabel("");
		spacer.setForeground(Color.WHITE);
		spacer.setBackground(Color.BLACK);
		contentPane.add(spacer);
		spacer.setOpaque(true);


		timer.start();
		numeros = new int[89];
	}

	private void crear() {
		//Funcion que edita los labels del tablero mediante un array
		arrayTablero = new JLabel[89];
		int cont = 1;
		String contS;
		for (int i = 0; i < 89; i++) {

			contS = Integer.toString(cont);
			arrayTablero[i] = new JLabel(contS);
			contentPane.add(arrayTablero[i]);
			cont++;
			arrayTablero[i].setFont(new Font("Tahoma", Font.BOLD, 40));
			arrayTablero[i].setOpaque(true);
			arrayTablero[i].setHorizontalAlignment(SwingConstants.CENTER);

		}

	}

	private int sacaBola(int pos) {
		//Funcion que genera un numero del 1 al 90. No repite los numeros que ya hayan salido

		boolean repetido = false;

		do {
			repetido = false;
			if (pos == 0) {
				numeros[pos] = random.nextInt(89) + 1;
			} else {
				numeros[pos] = random.nextInt(89) + 1;
				for (int i = 0; i < pos; i++) {
					if (numeros[pos] == numeros[i]) {
						repetido = true;
						break;
					}
				}
			}
		} while (repetido);

		return numeros[pos];
	}

	private void marcar(int numB, int cont) {
		//Funcion que cambia de color la casilla a la que hace referencia
		arrayTablero[numB - 1].setBackground(Color.BLACK);
		arrayTablero[numB - 1].setForeground(Color.WHITE);
	}

}