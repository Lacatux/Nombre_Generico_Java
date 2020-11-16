import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Multijugador extends JFrame {

	private JPanel contentPane1;
	private JButton btnNueva;
	private JButton btnMenu;
	private JLabel lbl2;
	private JLabel lbl3;
	private JLabel lbl4;
	private JLabel lbl5;
	private JLabel lbl6;
	private JButton btnBingo;
	private JButton btnLinea;
	private JButton[][] arrayBotones;
	public static final int COLUMNAS = 9;
	public static final int FILAS = 3;
	Random random = new Random();
	private ImageIcon blushed = new ImageIcon("images\\blushed.png");
	private ImageIcon happy = new ImageIcon("images\\happy.png");
	private ImageIcon neutral = new ImageIcon("images\\neutral.png");
	private ImageIcon sleepy = new ImageIcon("images\\sleepy.png");
	private ImageIcon win = new ImageIcon("images\\win.png");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Multijugador frame = new Multijugador();
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
	public Multijugador() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("images\\babaicon.png"));
		setTitle("Bingo");
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(50, 150, 1350, 650);
		contentPane1 = new JPanel();
		contentPane1.setBackground(new Color(224, 255, 255));
		contentPane1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane1);
		contentPane1.setLayout(new GridLayout(0, 9, 0, 0));

		contenidoVentana();

		registrarEventos();

	}


	private void registrarEventos() {
		btnMenu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(Multijugador.this,

						"¿Seguro que quieres volver al menú?",
						"Salir",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					Menu menu = new Menu();
					menu.setVisible(true);
					dispose();
				}				
			}
		});

		btnNueva.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				nuevaPartida();				
			}
		});

		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				arrayBotones[i][j].addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {

						JButton btn;
						btn = (JButton)e.getSource();
						btn.setEnabled(false);
						


					}
				});
			}
		}
		
		btnLinea.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				linea();

			}
		});

		btnBingo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				botonBingo();

			}
		});
	}

	//NUEVA PARTIDA//
	private void nuevaPartida()	{
		crearCarton(arrayBotones);
		btnNueva.setEnabled(false);
		btnBingo.setEnabled(true);
		btnLinea.setEnabled(true);

	}

	private void reiniciarCarton() {
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				arrayBotones[i][j].setEnabled(false);
				arrayBotones[i][j].setText("");
				arrayBotones[i][j].setIcon(null);
			}
		}
	}
	//NUEVA PARTIDA

	private void contenidoVentana() {

		arrayBotones = new JButton[FILAS][COLUMNAS];
		crearArrayBotones();
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				contentPane1.add(arrayBotones[i][j]);
			}
		}

		btnNueva = new JButton("Nueva Partida");
		btnNueva.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNueva.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane1.add(btnNueva);

		btnMenu = new JButton("Men\u00FA");
		btnMenu.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnMenu.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane1.add(btnMenu);

		lbl3 = new JLabel("");
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane1.add(lbl3);

		lbl2 = new JLabel("");
		contentPane1.add(lbl2);

		lbl4 = new JLabel("");
		lbl4.setFont(new Font("Tahoma", Font.BOLD, 17));
		lbl4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4.setBackground(new Color(152, 251, 152));
		lbl4.setOpaque(false);
		contentPane1.add(lbl4);

		lbl5 = new JLabel("");
		lbl5.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane1.add(lbl5);
		lbl5.setBackground(new Color(152, 251, 152));
		lbl5.setFont(new Font("Tahoma", Font.BOLD, 69));
		lbl5.setOpaque(false);

		lbl6 = new JLabel("");
		contentPane1.add(lbl6);

		btnBingo = new JButton("BINGO");
		
		btnBingo.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnBingo.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane1.add(btnBingo);
		btnBingo.setEnabled(false);

		btnLinea = new JButton("L\u00CDNEA");
		btnLinea.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane1.add(btnLinea);
		btnLinea.setEnabled(false);

	}

	private void crearArrayBotones() {

		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				arrayBotones[i][j] = new JButton("");
				arrayBotones[i][j].setFont(new Font("Tahoma", Font.BOLD, 69));
				arrayBotones[i][j].setEnabled(false);
			}
		}

		baba();

	}

	//CREAR CARTON
	private void crearCarton(JButton[][] arrayBotones) {
		reiniciarCarton();
		int numRnd, contFila = 0, repetidos = 0;
		do {
			for (int i = 0; i < 2; i++) {			
				do {
					contFila = 0;
					repetidos = 0;
					for (int j = 0; j < COLUMNAS; j++) {
						numRnd = random.nextInt(8) + 1;
						if(numRnd < 5 && contFila < 4) {
							arrayBotones[i][j].setEnabled(false);							
							contFila++;
						}else {
							arrayBotones[i][j].setEnabled(true);
						}					
					}


				} while(contFila < 4);
			}
			for (int i = 0; i < COLUMNAS; i++) {
				if(arrayBotones[0][i].isEnabled() && arrayBotones[1][i].isEnabled()) {
					repetidos++;
				}
			}
		} while (repetidos == 5);
		do {
			contFila = 0;
			for (int i = 0; i < COLUMNAS; i++) {
				numRnd = random.nextInt(8) + 1;
				if ((arrayBotones[0][i].isEnabled() && arrayBotones[1][i].isEnabled()) && contFila < 4) {
					arrayBotones[2][i].setEnabled(false); 
					contFila++;
				} else if ((arrayBotones[0][i].isEnabled() && !arrayBotones[1][i].isEnabled()) || (!arrayBotones[0][i].isEnabled() && arrayBotones[1][i].isEnabled())) {
					if(numRnd < 5) {
						arrayBotones[2][i].setEnabled(false);
						contFila++;
					}else {
						arrayBotones[2][i].setEnabled(true);
					}	
				} else if (!arrayBotones[0][i].isEnabled() && !arrayBotones[1][i].isEnabled()) {
					arrayBotones[2][i].setEnabled(true);
				} else {
					arrayBotones[2][i].setEnabled(true);
				}

				if (arrayBotones[0][i].isEnabled() && arrayBotones[1][i].isEnabled() && arrayBotones[2][i].isEnabled()) {
					contFila = 5;
				}
			}
		} while(contFila < 4 || contFila > 4);

		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				if (arrayBotones[i][j].isEnabled()) {
					arrayBotones[i][j].setText(introducir_numero(arrayBotones, i, j));
					arrayBotones[i][j].setBackground(Color.WHITE);
				}
			}
		}

		ordenarArray(arrayBotones);

		baba();

	}

	private String introducir_numero(JButton[][] array,int i, int j) {
		int numero = 0;	
		do {
			if (j == 0) {
				numero = random.nextInt(9) + 1;
			} else {
				numero = random.nextInt(9);
				numero = numero + (10 * j);	
			}
		} while (comprobarArray(array, numero, i, j));
		return String.valueOf(numero);
	}

	private boolean comprobarArray(JButton[][] array, int num, int i, int j) {

		if (i == 0) {
			return false;
		} else if (i == 1) {
			if(array[0][j].isEnabled()) {
				int numArray = Integer.parseInt(array[0][j].getText());					
				if (numArray == num) {
					return true;
				} 
			} else {
				return false;
			}
		} else if (i == 2) {
			if(array[0][j].isEnabled()) {
				int numArray = Integer.parseInt(array[0][j].getText());					
				if (numArray == num) {
					return true;
				} 
			} else if(array[1][j].isEnabled()) {
				int numArray = Integer.parseInt(array[1][j].getText());					
				if (numArray == num) {
					return true;
				} 
			} else {
				return false;
			}
		}

		return false;
	}

	private void ordenarArray(JButton[][] array) {

		int[] col;
		int cont, contDos;
		String num;
		for (int j = 0; j < COLUMNAS; j++) {
			cont = 0;
			contDos = 0;

			for (int i = 0; i < FILAS; i++) {
				if (array[i][j].isEnabled()) 
					cont++;
			}

			col = new int[cont];
			for (int i = 0; i < FILAS; i++) {
				if (array[i][j].isEnabled()) {
					col[contDos] = Integer.parseInt(array[i][j].getText());
					contDos++;
				}
			}

			Arrays.sort(col);

			contDos = 0;
			for (int i = 0; i < FILAS; i++) {
				if (array[i][j].isEnabled()) {
					num = Integer.toString(col[contDos]);
					array[i][j].setText(num);
					contDos++;
				}
			}
		}

	}
	//CREAR CARTON

	private void baba() {
		int rnd = 0;
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				if (!arrayBotones[i][j].isEnabled()) {
					rnd = random.nextInt(4) + 1;
					switch (rnd) {
					case 1:
						arrayBotones[i][j].setDisabledIcon(blushed);
						arrayBotones[i][j].setIcon(blushed);
						arrayBotones[i][j].setBackground(new Color(230,230,230));
						break;
					case 2:
						arrayBotones[i][j].setDisabledIcon(happy);
						arrayBotones[i][j].setIcon(happy);
						arrayBotones[i][j].setBackground(new Color(230,230,230));
						break;
					case 3:
						arrayBotones[i][j].setDisabledIcon(neutral);						
						arrayBotones[i][j].setIcon(neutral);
						arrayBotones[i][j].setBackground(new Color(230,230,230));
						break;
					case 4:
						arrayBotones[i][j].setDisabledIcon(sleepy);
						arrayBotones[i][j].setIcon(sleepy);
						arrayBotones[i][j].setBackground(new Color(230,230,230));
						break;
					}
				}
			}
		}
	}

	private void linea() {
		int cont;
		for (int i = 0; i < FILAS; i++) {
			cont = 0;
			for (int j = 0; j < COLUMNAS; j++) {
				if (!arrayBotones[i][j].isEnabled()) {
					cont++;
				}
			}
			if(cont == 9) {
				switch (i) {
				case 0, 2:
					for (int j = 0; j < COLUMNAS; j++) {
						arrayBotones[i][j].setBackground(new Color(255,248,220));
					}
				break;
				case 1:
					for (int j = 0; j < COLUMNAS; j++) {
						arrayBotones[i][j].setBackground(new Color(224,255,255));
					}
				}
			}
		}
	}

	private void botonBingo() {
		int cont = 0;
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				if (!arrayBotones[i][j].isEnabled()) {
					cont++;
				}
			}
		}
		if (cont == 27) {
			victoria();
		}
	}

	private void victoria() {
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				btnNueva.setEnabled(true);
				arrayBotones[i][j].setText("");
				arrayBotones[i][j].setBackground(Color.WHITE);
				arrayBotones[i][j].setDisabledIcon(win);
				arrayBotones[i][j].setIcon(win);
				btnBingo.setEnabled(false);
				btnLinea.setEnabled(false);
				lbl4.setText("");
				lbl4.setOpaque(false);
				lbl5.setText("");
				lbl5.setOpaque(false);
			}
		}
	}
}