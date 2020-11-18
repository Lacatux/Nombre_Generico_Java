import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import java.awt.Toolkit;

public class Bingo extends JFrame {

	private JPanel contentPane;
	private JButton btnNueva;
	private JButton btnMenu;
	private JLabel lbl3;
	private JLabel lbl4;
	private JLabel lbl5;
	private JButton btnBingo;
	private JButton btnLinea;
	private JButton btnSiguiente;
	private JButton btnComprobar;
	private JButton[][] arrayBotones;
	public static final int COLUMNAS = 9;
	public static final int FILAS = 3;
	Random random = new Random();
	private ImageIcon blushed = new ImageIcon("images\\baba\\blushed.png");
	private ImageIcon happy = new ImageIcon("images\\baba\\happy.png");
	private ImageIcon neutral = new ImageIcon("images\\baba\\neutral.png");
	private ImageIcon sleepy = new ImageIcon("images\\baba\\sleepy.png");
	private ImageIcon win = new ImageIcon("images\\baba\\win.png");
	private ImageIcon cool = new ImageIcon("images\\abus\\coolgrandma.jpg");
	private ImageIcon corazon = new ImageIcon("images\\abus\\cora.jpg");
	private ImageIcon dolarW = new ImageIcon("images\\abus\\grandpadolar.jpg");
	private ImageIcon grito = new ImageIcon("images\\abus\\grito.jpg");
	private ImageIcon gritoI = new ImageIcon("images\\abus\\gritoI.jpg");
	private ImageIcon grumpy = new ImageIcon("images\\abus\\grumpy.jpg");
	private ImageIcon crazy = new ImageIcon("images\\abus\\locaabu.jpg");
	private ImageIcon dolarM = new ImageIcon("images\\abus\\moni.jpg");
	private ImageIcon pan = new ImageIcon("images\\abus\\pangrandma.jpeg");
	private ImageIcon smoke = new ImageIcon("images\\abus\\smoke.jpg");
	private ImageIcon tlf = new ImageIcon("images\\abus\\tlf.jpg");
	private int[] numeros;
	private int pos;
	private javax.swing.Timer timer;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					Bingo frame = new Bingo();
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
	public Bingo() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("images\\baba\\babaicon.png"));
		setTitle("Bingo");
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(50, 150, 1350, 650);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 9, 0, 0));

		contenidoVentana();

		registrarEventos();

	}


	private void registrarEventos() {

		timer = new javax.swing.Timer(500, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				btnSiguiente.setEnabled(true);
				timer.stop();

			}
		});

		btnMenu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(Bingo.this,

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

		btnSiguiente.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				btnSiguiente.setEnabled(false);
				bolas(pos);
				maquina(pos);
				pos++;

				timer.start();

			}
		});

		btnComprobar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				comprobar(pos);
			}
		});

		btnLinea.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				comprobar(pos);
				linea();

			}
		});

		btnBingo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				comprobar(pos);
				botonBingo();

			}
		});
	}

	//NUEVA PARTIDA//
	private void nuevaPartida()	{
		reiniciarCarton();
		crearCarton(arrayBotones);	
		btnNueva.setEnabled(true);
		btnSiguiente.setEnabled(true);
		btnComprobar.setEnabled(true);
		btnBingo.setEnabled(true);
		btnLinea.setEnabled(true);
		lbl4.setText("Nuevo N\u00FAmero");
		lbl4.setOpaque(true);
		lbl5.setOpaque(true);
		numeros = new int[90];
		pos = 0;
		bolas(pos);
		pos++;

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
				contentPane.add(arrayBotones[i][j]);
			}
		}

		btnNueva = new JButton("Nueva Partida");
		btnNueva.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNueva.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(btnNueva);

		btnMenu = new JButton("Men\u00FA");
		btnMenu.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnMenu.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(btnMenu);

		lbl3 = new JLabel("");
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lbl3);

		lbl4 = new JLabel("");
		lbl4.setFont(new Font("Tahoma", Font.BOLD, 17));
		lbl4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4.setBackground(new Color(152, 251, 152));
		lbl4.setOpaque(false);
		contentPane.add(lbl4);

		lbl5 = new JLabel("");
		lbl5.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lbl5);
		lbl5.setBackground(new Color(152, 251, 152));
		lbl5.setFont(new Font("Tahoma", Font.BOLD, 69));
		lbl5.setOpaque(false);

		btnSiguiente = new JButton("Siguiente N\u00FAmero");
		btnSiguiente.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnSiguiente.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(btnSiguiente);
		btnSiguiente.setEnabled(false);

		btnComprobar = new JButton("Comprobar");
		btnComprobar.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(btnComprobar);
		btnComprobar.setEnabled(false);

		btnBingo = new JButton("BINGO");
		btnBingo.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnBingo.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(btnBingo);
		btnBingo.setEnabled(false);

		btnLinea = new JButton("L\u00CDNEA");
		btnLinea.setFont(new Font("Tahoma", Font.BOLD, 25));
		contentPane.add(btnLinea);
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

	private void bolas(int pos) {
		boolean repetido = false;
		if (pos < 89) {
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
			lbl5.setText(Integer.toString(numeros[pos]));
		} else {
			btnSiguiente.setEnabled(false);
			JOptionPane.showMessageDialog(this, "¡Ya has recorrido todos los números!");
			btnNueva.setEnabled(true);
		}
	}

	private void comprobar(int pos) {
		int num;
		boolean sale;
		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {

				if (!arrayBotones[i][j].isEnabled() && !arrayBotones[i][j].getText().equals("") && arrayBotones[i][j].getIcon() == null) {
					num = 0;
					sale = false;
					num = Integer.parseInt(arrayBotones[i][j].getText());
					for (int k = 0; k < pos; k++) {
						if (numeros[k] == num) {
							sale = true;
						} 
					}
					if (sale) {
						arrayBotones[i][j].setEnabled(false);
					} else {
						arrayBotones[i][j].setEnabled(true);
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
		} else {
			JOptionPane.showMessageDialog(null, "Maria Luisa te amenaza con la sartén por cantar un bingo.", "Partida", JOptionPane.INFORMATION_MESSAGE, pan);
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
				btnSiguiente.setEnabled(false);
				btnComprobar.setEnabled(false);
				btnBingo.setEnabled(false);
				btnLinea.setEnabled(false);
				lbl4.setText("");
				lbl4.setOpaque(false);
				lbl5.setText("");
				lbl5.setOpaque(false);
			}
		}
		if (random.nextInt(1) == 1) {
			JOptionPane.showMessageDialog(null, "¡Has ganado!", "Partida", JOptionPane.INFORMATION_MESSAGE, dolarW);
		} else {
			JOptionPane.showMessageDialog(null, "¡Has ganado!", "Partida", JOptionPane.INFORMATION_MESSAGE, dolarM);
		}

	}

	private void maquina(int pos) {

		int num = random.nextInt(10000) + 1;

		if (pos > 80 && num > 9950) {			
			JOptionPane.showMessageDialog(null, "¡A Anselmo le ha dado un ataque al corazón! Se suspende la partida.", "Partida", JOptionPane.INFORMATION_MESSAGE, corazon);
			nuevaPartida();
		} else if (pos > 35 && num > 9450 && num < 9950) {
			JOptionPane.showMessageDialog(null, "¡Carmen Marlena canta bingo! Se termina la partida.", "Partida", JOptionPane.INFORMATION_MESSAGE, grito);
			nuevaPartida();
		} else if (num > 500 && num < 1000) {
			JOptionPane.showMessageDialog(null, "Blanca se enciende un cigarro pese al cartel de prohibido fumar.", "Partida", JOptionPane.INFORMATION_MESSAGE, smoke);
		} else if (num > 1000 && num < 2000 && pos > 30) {
			JOptionPane.showMessageDialog(null, "¡Carmen Marlena canta bingo!", "Partida", JOptionPane.INFORMATION_MESSAGE, gritoI);
			JOptionPane.showMessageDialog(null, "El revisor comprueba su cartón y le dice que no tiene bingo.", "Partida", JOptionPane.INFORMATION_MESSAGE, grumpy);
		} else if (num > 2000 && num < 3500 && pos < 30) {
			JOptionPane.showMessageDialog(null, "Llaman a Trinidad y esta responde malamente", "Partida", JOptionPane.INFORMATION_MESSAGE, tlf);
			if (pos == 29) {
				JOptionPane.showMessageDialog(null, "El revisor llama la atención a Trinidad.", "Partida", JOptionPane.INFORMATION_MESSAGE, grumpy);
			}
		}

	}

}
