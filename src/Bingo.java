import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;

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
	private JButton Siguiente;
	private JButton NuevaPartida;
	private JLabel NumeroNuevo;
	private JLabel UltimoNum;
	private JButton Exit;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JButton[] arrayBotones;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 793, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(5, 7, 0, 0));
		
		btn1 = new JButton("");
		contentPane.add(btn1);
		
		btn2 = new JButton("");
		contentPane.add(btn2);
		
		btn3 = new JButton("");
		contentPane.add(btn3);
		
		btn4 = new JButton("");
		contentPane.add(btn4);
		
		btn5 = new JButton("");
		contentPane.add(btn5);
		
		lblNewLabel = new JLabel("");
		contentPane.add(lblNewLabel);
		
		NuevaPartida = new JButton("Nueva Partida");
		contentPane.add(NuevaPartida);
		
		btn6 = new JButton("");
		contentPane.add(btn6);
		
		btn7 = new JButton("");
		contentPane.add(btn7);
		
		btn8 = new JButton("");
		contentPane.add(btn8);
		
		btn9 = new JButton("");
		contentPane.add(btn9);
		
		btn10 = new JButton("");
		contentPane.add(btn10);
		
		lblNewLabel_1 = new JLabel("");
		contentPane.add(lblNewLabel_1);
		
		NumeroNuevo = new JLabel("Numero Nuevo");
		contentPane.add(NumeroNuevo);
		
		btn11 = new JButton("");
		contentPane.add(btn11);
		
		btn12 = new JButton("");
		contentPane.add(btn12);
		
		btn13 = new JButton("");
		contentPane.add(btn13);
		
		btn14 = new JButton("");
		contentPane.add(btn14);
		
		btn15 = new JButton("");
		contentPane.add(btn15);
		
		lblNewLabel_2 = new JLabel("");
		contentPane.add(lblNewLabel_2);
		
		UltimoNum = new JLabel("Ultimo Numero");
		contentPane.add(UltimoNum);
		
		btn16 = new JButton("");
		contentPane.add(btn16);
		
		btn17 = new JButton("");
		contentPane.add(btn17);
		
		btn18 = new JButton("");
		contentPane.add(btn18);
		
		btn19 = new JButton("");
		contentPane.add(btn19);
		
		btn20 = new JButton("");
		contentPane.add(btn20);
		
		lblNewLabel_3 = new JLabel("");
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("");
		contentPane.add(lblNewLabel_4);
		
		btn21 = new JButton("");
		contentPane.add(btn21);
		
		btn22 = new JButton("");
		contentPane.add(btn22);
		
		btn23 = new JButton("");
		contentPane.add(btn23);
		
		btn24 = new JButton("");
		contentPane.add(btn24);
		
		btn25 = new JButton("");
		contentPane.add(btn25);
		
		Siguiente = new JButton("Siguiente Número");
		contentPane.add(Siguiente);
		
		Exit = new JButton("Salir");
		contentPane.add(Exit);
		
	}
	
	private void inicializar() {
		
		arrayBotones = new JButton[25];
		
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
				
	}
	
	public static void registrarEventos() {
		
	}

}