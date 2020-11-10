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
	private JButton[][] arrayBotones;
	public static final int COLUMNAS = 9;
	public static final int FILAS = 3;
	Random random = new Random();


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
		setIconImage(Toolkit.getDefaultToolkit().getImage("images\\babaicon.png"));
		setTitle("Bingo");
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(50, 150, 1350, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 9, 0, 0));

		crearVentana();

		inicializar();
		registrarEventos();

	}

	private void inicializar() {



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

	private void crearVentana() {

		arrayBotones = new JButton[FILAS][COLUMNAS];
		crearBotones(arrayBotones);

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

	}

	private void crearBotones(JButton[][] arrayBotones) {

		for (int i = 0; i < FILAS; i++) {
			for (int j = 0; j < COLUMNAS; j++) {
				arrayBotones[i][j] = new JButton(introducir_numero(arrayBotones,j));
				arrayBotones[i][j].setFont(new Font("Tahoma", Font.BOLD, 69));
			}
		}

		comprobarRepetidos(arrayBotones);

		int col=0;
		while(col<9) {
			ordenarArray(arrayBotones,col);
			col++;
		}

		huecosVacios(arrayBotones);

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 9; j++) {
				contentPane.add(arrayBotones[i][j]);
			}
		}

	}

	public String introducir_numero(JButton[][] array, int j) {
		int numero=0;

		switch(j){
		case 0:{
			numero=(int)(Math.random()*9+1);
			break;
		}
		case 1:{
			numero=(int)(Math.random()*9+1);
			numero=numero+10;
			break;
		}
		case 2:{
			numero=(int)(Math.random()*9+1);
			numero=numero+20;
			break;
		}
		case 3:{
			numero=(int)(Math.random()*9+1);
			numero=numero+30;
			break;
		}
		case 4:{
			numero=(int)(Math.random()*9+1);
			numero=numero+40;
			break;
		}
		case 5:{
			numero=(int)(Math.random()*9+1);
			numero=numero+50;
			break;
		}
		case 6:{
			numero=(int)(Math.random()*9+1);
			numero=numero+60;
			break;
		}
		case 7:{
			numero=(int)(Math.random()*9+1);
			numero=numero+70;
			break;
		}
		case 8:{
			numero=(int)(Math.random()*9+1);
			numero=numero+80;
			break;
		}
		}			
		return String.valueOf(numero);
	}

	public void comprobarRepetidos(JButton[][] array) {
		int numero, cont=0;
		boolean repetido=false;

		for (int col = 0; col < 9; col++) {
			do {
				if(array[0][col].getText().equals(array[1][col].getText()) || array[0][col].getText().equals(array[2][col].getText())) {
					numero=(int)(Math.random()*9+1);
					numero=numero+cont;
					array[0][col].setText(String.valueOf(numero));
					repetido=true;
				}else if(array[1][col].getText().equals(array[2][col].getText())) {
					numero=(int)(Math.random()*9+1);
					numero=numero+cont;
					array[2][col].setText(String.valueOf(numero));
					repetido=true;
				}else {
					repetido=false;
				}
			}while(repetido);
			cont=cont+10;
		}			
	}

	public void ordenarArray(JButton[][] array,int col) {
		String[] enteros = new String[3];

		for (int i = 0; i < 3; i++) {
			enteros[i]=array[i][col].getText();
		}

		Arrays.sort(enteros);

		for (int i = 0; i < 3; i++) {
			array[i][col].setText(enteros[i]);
		}

	}

	public void huecosVacios(JButton[][] array) {
		int numero, huecoLinea=0, comprobarFila=0;

		for (int fila = 0; fila < 3; fila++) {
			huecoLinea=0;
			if(fila==2) {
				do {
					numero=(int)(Math.random()*9+1);
					if(!array[comprobarFila][numero-1].isEnabled() && !array[comprobarFila+1][numero-1].isEnabled()) {	
					}else {
						if(array[fila][numero-1].isEnabled()) {
							array[fila][numero-1].setEnabled(false);
							array[fila][numero-1].setBackground(Color.WHITE);
							array[fila][numero-1].setText("");
							huecoLinea++;
						}
					}

				}while(huecoLinea!=4);
				break;
			}

			do {
				numero=(int)(Math.random()*9+1);
				if(array[fila][numero-1].isEnabled()) {
					array[fila][numero-1].setEnabled(false);
					array[fila][numero-1].setBackground(Color.WHITE);
					array[fila][numero-1].setText("");
					huecoLinea++;
				}			
			}while(huecoLinea!=4);
		}

	}

}