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
	private JButton btnNueva;
	private JButton exit;
	private JLabel lbl3;
	private JLabel lbl4;
	private JLabel lbl5;
	private JLabel lbl6;
	private JLabel lbl7;
	private JLabel lblTdig2;
	private JLabel lblTdig1;
	private JButton[] arrayCarton;
	private Random random = new Random();


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
		contentPane.setLayout(new GridLayout(0, 9, 0, 0));

		crearBotones();

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
