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
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.Random;
import java.awt.Window.Type;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;

@SuppressWarnings("unused")
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
	private JLabel free;
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
	private JButton nuevaPartida;
	private JLabel lbltxtNuevonum;
	private JLabel lbltxtUltimonum;
	private JButton exit;
	private JLabel lbl1;
	private JLabel lbl4;
	private JLabel lbl5;
	private JLabel lbl6;
	private JLabel lbl9;
	private JButton[] arrayBotones;
	private JLabel lblnumNuevo;
	private JLabel lblnumUltimo;
	private JLabel lbl8;
	private JLabel lbl7;
	private ImageIcon logo = new ImageIcon("images\\baba.png");
	private JLabel lbltiempo1;
	private JLabel lbltiempo2;
	private int[] arrayNumeros;
	private Random rnd = new Random();

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
		setTitle("Bingo");
		setIconImage(Toolkit.getDefaultToolkit().getImage("images\\babaicon.png"));
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		this.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
		contentPane.setLayout(new GridLayout(0, 8, 0, 0));

		btn1 = new JButton("");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 69));
		contentPane.add(btn1);

		btn2 = new JButton("");
		btn2.setFont(new Font("Tahoma", Font.BOLD, 69));
		contentPane.add(btn2);

		btn3 = new JButton("");
		btn3.setFont(new Font("Tahoma", Font.BOLD, 69));
		contentPane.add(btn3);

		btn4 = new JButton("");
		btn4.setFont(new Font("Tahoma", Font.BOLD, 69));
		contentPane.add(btn4);

		btn5 = new JButton("");
		btn5.setFont(new Font("Tahoma", Font.BOLD, 69));
		contentPane.add(btn5);

		lbl1 = new JLabel("");
		lbl1.setBackground(new Color(41, 151, 219));
		lbl1.setOpaque(true);
		contentPane.add(lbl1);

		lbltiempo1 = new JLabel("");
		lbltiempo1.setBackground(new Color(65, 105, 225));
		lbltiempo1.setOpaque(true);
		contentPane.add(lbltiempo1);

		lbltiempo2 = new JLabel("");
		lbltiempo2.setBackground(new Color(65, 105, 225));
		lbltiempo2.setOpaque(true);
		contentPane.add(lbltiempo2);

		btn6 = new JButton("");
		btn6.setFont(new Font("Tahoma", Font.BOLD, 69));
		contentPane.add(btn6);

		btn7 = new JButton("");
		btn7.setFont(new Font("Tahoma", Font.BOLD, 69));
		contentPane.add(btn7);

		btn8 = new JButton("");
		btn8.setFont(new Font("Tahoma", Font.BOLD, 69));
		contentPane.add(btn8);

		btn9 = new JButton("");
		btn9.setFont(new Font("Tahoma", Font.BOLD, 69));
		contentPane.add(btn9);

		btn10 = new JButton("");
		btn10.setFont(new Font("Tahoma", Font.BOLD, 69));
		contentPane.add(btn10);

		lbl4 = new JLabel("");
		lbl4.setBackground(new Color(41, 151, 219));
		lbl4.setOpaque(true);
		contentPane.add(lbl4);

		lbltxtNuevonum = new JLabel("Nuevo N\u00FAmero");
		lbltxtNuevonum.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbltxtNuevonum.setBackground(new Color(152, 251, 152));
		lbltxtNuevonum.setVerticalAlignment(SwingConstants.BOTTOM);
		lbltxtNuevonum.setHorizontalAlignment(SwingConstants.CENTER);
		lbltxtNuevonum.setOpaque(true);
		contentPane.add(lbltxtNuevonum);

		lbltxtUltimonum = new JLabel("\u00DAltimo N\u00FAmero");
		lbltxtUltimonum.setBackground(new Color(216, 191, 216));
		lbltxtUltimonum.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbltxtUltimonum.setVerticalAlignment(SwingConstants.BOTTOM);
		lbltxtUltimonum.setHorizontalAlignment(SwingConstants.CENTER);
		lbltxtUltimonum.setOpaque(true);
		contentPane.add(lbltxtUltimonum);

		btn11 = new JButton("");
		btn11.setFont(new Font("Tahoma", Font.BOLD, 69));
		contentPane.add(btn11);

		btn12 = new JButton("");
		btn12.setFont(new Font("Tahoma", Font.BOLD, 69));
		contentPane.add(btn12);

		free = new JLabel("");
		free.setHorizontalAlignment(SwingConstants.CENTER);
		free.setIcon(logo);
		contentPane.add(free);

		btn14 = new JButton("");
		btn14.setFont(new Font("Tahoma", Font.BOLD, 69));
		contentPane.add(btn14);

		btn15 = new JButton("");
		btn15.setFont(new Font("Tahoma", Font.BOLD, 69));
		contentPane.add(btn15);

		lbl5 = new JLabel("");
		lbl5.setBackground(new Color(41, 151, 219));
		lbl5.setOpaque(true);
		contentPane.add(lbl5);

		lblnumNuevo = new JLabel("0");
		lblnumNuevo.setBackground(new Color(152, 251, 152));
		lblnumNuevo.setFont(new Font("Tahoma", Font.BOLD, 69));
		lblnumNuevo.setHorizontalAlignment(SwingConstants.CENTER);
		lblnumNuevo.setOpaque(true);
		contentPane.add(lblnumNuevo);

		lblnumUltimo = new JLabel("0");
		lblnumUltimo.setBackground(new Color(216, 191, 216));
		lblnumUltimo.setFont(new Font("Tahoma", Font.BOLD, 69));
		lblnumUltimo.setHorizontalAlignment(SwingConstants.CENTER);
		lblnumUltimo.setOpaque(true);
		contentPane.add(lblnumUltimo);

		btn16 = new JButton("");
		btn16.setFont(new Font("Tahoma", Font.BOLD, 69));
		contentPane.add(btn16);

		btn17 = new JButton("");
		btn17.setFont(new Font("Tahoma", Font.BOLD, 69));
		contentPane.add(btn17);

		btn18 = new JButton("");
		btn18.setFont(new Font("Tahoma", Font.BOLD, 69));
		contentPane.add(btn18);

		btn19 = new JButton("");
		btn19.setFont(new Font("Tahoma", Font.BOLD, 69));
		contentPane.add(btn19);

		btn20 = new JButton("");
		btn20.setFont(new Font("Tahoma", Font.BOLD, 69));
		contentPane.add(btn20);

		lbl6 = new JLabel("");
		lbl6.setBackground(new Color(41, 151, 219));
		lbl6.setOpaque(true);
		contentPane.add(lbl6);

		lbl7 = new JLabel();
		lbl7.setOpaque(true);
		contentPane.add(lbl7);

		lbl8 = new JLabel("");
		lbl8.setOpaque(true);
		contentPane.add(lbl8);

		btn21 = new JButton("");
		btn21.setFont(new Font("Tahoma", Font.BOLD, 69));
		contentPane.add(btn21);

		btn22 = new JButton("");
		btn22.setFont(new Font("Tahoma", Font.BOLD, 69));
		contentPane.add(btn22);

		btn23 = new JButton("");
		btn23.setFont(new Font("Tahoma", Font.BOLD, 69));
		contentPane.add(btn23);

		btn24 = new JButton("");
		btn24.setFont(new Font("Tahoma", Font.BOLD, 69));
		contentPane.add(btn24);

		btn25 = new JButton("");
		btn25.setFont(new Font("Tahoma", Font.BOLD, 69));
		contentPane.add(btn25);

		lbl9 = new JLabel("");
		lbl9.setBackground(new Color(41, 151, 219));
		lbl9.setOpaque(true);
		contentPane.add(lbl9);

		nuevaPartida = new JButton("Nueva Partida");
		nuevaPartida.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(nuevaPartida);

		exit = new JButton("Salir");
		exit.setFont(new Font("Tahoma", Font.PLAIN, 20));
		contentPane.add(exit);

		inicializar();
		registrarEventos();
	}

	private void inicializar() {

		arrayBotones = new JButton[24];

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
		arrayBotones[12] = btn14;
		arrayBotones[13] = btn15;
		arrayBotones[14] = btn16;
		arrayBotones[15] = btn17;
		arrayBotones[16] = btn18;
		arrayBotones[17] = btn19;
		arrayBotones[18] = btn20;
		arrayBotones[19] = btn21;
		arrayBotones[20] = btn22;
		arrayBotones[21] = btn23;
		arrayBotones[22] = btn24;
		arrayBotones[23] = btn25;

		estadoBotones(true);
		numerosTablero(arrayBotones);

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

	public void estadoBotones(boolean estado) {

		for (int i = 0; i < arrayBotones.length; i++) {
			arrayBotones[i].setEnabled(estado);	
		}

	}

	private void numerosTablero(JButton[] arrayBotones) {

		arrayNumeros = new int[24];
		for (int i = 0; i < arrayNumeros.length; i++) {
			arrayNumeros[i] = 0;
		}
		String num, numfin = null;
		int numRnd = 0;
		boolean repetido;


		for (int i = 0; i < arrayNumeros.length; i++) {

			if (i != 0) {


				do {
					repetido = false;
					numRnd = rnd.nextInt(98) + 1;
					for (int j = 0; j < i; j++) {
						if (numRnd == arrayNumeros[j]) {
							repetido = true;
						} 
					}

				} while (repetido);
				arrayNumeros[i] = numRnd;

			} else {
				arrayNumeros[i] = rnd.nextInt(98) + 1;
			}

			num = Integer.toString(arrayNumeros[i]);
			if (arrayNumeros[i] < 10) {
				numfin = "0" + num;
			} else {
				numfin = num;
			}
			arrayBotones[i].setText(numfin);

		}
		
	}



}