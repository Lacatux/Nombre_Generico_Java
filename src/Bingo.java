import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import java.awt.Toolkit;

public class Bingo extends JFrame {

	private JPanel contentPane;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn10;
	private JButton btn11;
	private JButton btn12;
	private JButton btn13;
	private JButton btn14;
	private JButton btn15;
	private JButton btn16;
	private JButton btn17;
	private JButton btn18;
	private JButton btn19;
	private JButton btn20;
	private JButton btn21;
	private JButton btn22;
	private JButton btn23;
	private JButton btn24;
	private JButton btn25;
	private JButton btn26;
	private JButton btn27;
	private JLabel lbl13;
	private JLabel lbl12;
	private JLabel lbl11;
	private JButton btnNueva;
	private JButton exit;
	private JLabel lbl3;
	private JLabel lbl4;
	private JLabel lbl5;
	private JLabel lbl6;
	private JLabel lbl7;
	private JLabel lbl8;
	private JLabel lblTdig2;
	private JLabel lblTdig1;
	private JButton[] arrayBotones;
	private Random random = new Random();
	private int[] arrayCarton;


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
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Jaime Lacabex\\git\\Nombre_Generico_Java\\images\\babaicon.png"));
		setTitle("Bingo");
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(50, 150, 1350, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 10, 0, 0));

		btn1 = new JButton("");
		contentPane.add(btn1);

		btn4 = new JButton("");
		contentPane.add(btn4);

		btn7 = new JButton("");
		contentPane.add(btn7);

		btn10 = new JButton("");
		contentPane.add(btn10);

		btn13 = new JButton("");
		contentPane.add(btn13);

		btn16 = new JButton("");
		contentPane.add(btn16);

		btn19 = new JButton("");
		contentPane.add(btn19);

		btn22 = new JButton("");
		contentPane.add(btn22);

		btn25 = new JButton("");
		contentPane.add(btn25);

		lbl13 = new JLabel("");
		contentPane.add(lbl13);

		btn2 = new JButton("");
		contentPane.add(btn2);

		btn5 = new JButton("");
		contentPane.add(btn5);

		btn8 = new JButton("");
		contentPane.add(btn8);

		btn11 = new JButton("");
		contentPane.add(btn11);

		btn14 = new JButton("");
		contentPane.add(btn14);

		btn17 = new JButton("");
		contentPane.add(btn17);

		btn20 = new JButton("");
		contentPane.add(btn20);

		btn23 = new JButton("");
		contentPane.add(btn23);

		btn26 = new JButton("");
		contentPane.add(btn26);

		lbl12 = new JLabel("");
		contentPane.add(lbl12);

		btn3 = new JButton("");
		contentPane.add(btn3);

		btn6 = new JButton("");
		contentPane.add(btn6);

		btn9 = new JButton("");
		contentPane.add(btn9);

		btn12 = new JButton("");
		contentPane.add(btn12);

		btn15 = new JButton("");
		contentPane.add(btn15);

		btn18 = new JButton("");
		contentPane.add(btn18);

		btn21 = new JButton("");
		contentPane.add(btn21);

		btn24 = new JButton("");
		contentPane.add(btn24);

		btn27 = new JButton("");
		contentPane.add(btn27);

		lbl11 = new JLabel("");
		contentPane.add(lbl11);

		btnNueva = new JButton("Nueva Partida");
		btnNueva.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(btnNueva);

		lbl3 = new JLabel("");
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lbl3);

		lbl4 = new JLabel("Nuevo N\u00FAmero");
		lbl4.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lbl4);

		lbl5 = new JLabel("");
		contentPane.add(lbl5);

		lbl6 = new JLabel("Numero Anterior");
		lbl6.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lbl6);

		lbl7 = new JLabel("");
		contentPane.add(lbl7);

		lbl8 = new JLabel("");
		contentPane.add(lbl8);

		lblTdig2 = new JLabel("");
		lblTdig2.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblTdig2);

		lblTdig1 = new JLabel("");
		contentPane.add(lblTdig1);

		exit = new JButton("Salir");
		exit.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(exit);

		inicializar();
		registrarEventos();

	}

	private void inicializar() {

		arrayBotones = new JButton[27];

		arrayBotones[0] = btn1;
		arrayBotones[1] = btn2;
		arrayBotones[2] = btn3;
		arrayBotones[3] = btn4;
		arrayBotones[4] = btn5;
		arrayBotones[5] = btn6;
		arrayBotones[6] = btn7;
		arrayBotones[7] = btn8;
		arrayBotones[8] = btn9;
		arrayBotones[9] = btn10;
		arrayBotones[10] = btn11;
		arrayBotones[11] = btn12;
		arrayBotones[12] = btn13;
		arrayBotones[13] = btn14;
		arrayBotones[14] = btn15;
		arrayBotones[15] = btn16;
		arrayBotones[16] = btn17;
		arrayBotones[17] = btn18;
		arrayBotones[18] = btn19;
		arrayBotones[19] = btn20;
		arrayBotones[20] = btn21;
		arrayBotones[21] = btn22;
		arrayBotones[22] = btn23;
		arrayBotones[23] = btn24;
		arrayBotones[24] = btn25;
		arrayBotones[25] = btn26;
		arrayBotones[26] = btn27;

		crearCarton();

	}

	private void registrarEventos() {
		exit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(Bingo.this,

						"¿Seguro que quieres salir?",
						"Salir",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					System.exit(0);
				}				
			}
		});
	}

	private void crearCarton () {

		int[] arrayNumeros = new int[15];
		arrayCarton = new int[27];
		int cont = 0, contQ = 0, columna = 0, numRnd = 0;

		//CREACIÓN DE HUECOS EN BLANCO

		for (int i = 0; i < arrayCarton.length; i++) {
			
			if (i % 3 == 0 && i != 0) {
				columna ++;
			}
			switch (cont) {
			case 0:
				
				break;
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:
				
				break;
			case 6:
				
				break;
			case 7:
				
				break;
			case 8:
				
				break;
			}
			
		}

		//RELLENADO DEL CARTON
		for (int i = 0; i < arrayNumeros.length; i++) {
			do {
				numRnd = random.nextInt(98) + 1;
			} while(comprobarArray(arrayNumeros, numRnd, i));
			arrayNumeros[i] = numRnd;
		}
		Arrays.sort(arrayNumeros);
		for (int i = 0; i < arrayCarton.length; i++) {
			if (arrayCarton[i] != 0) {
				arrayCarton[i] = arrayNumeros[cont];
				cont++;
			}
		}
		
		 

	}

	public boolean comprobarArray(int[] array, int num, int iArr) {
		for (int i = 0; i <= iArr; i++) {
			if (array[i] == num) {
				return true;
			}
		}
		return false;
	}


}
