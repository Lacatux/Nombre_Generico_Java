import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Toolkit;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Menu extends JFrame {

	private JPanel contentPane;
	private JButton btnSingle;
	private JButton btnMulti;
	private JButton btnSalir;
	private JButton btnMultUno;
	private JButton btnAtras;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		//Creacion de la ventana
		setIconImage(Toolkit.getDefaultToolkit().getImage("images\\baba\\babaicon.png"));
		setResizable(false);
		setTitle("Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 250, 403, 369);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 1, 50, 25));

		btnSingle = new JButton("Un solo jugador");
		btnSingle.setBackground(new Color(152, 251, 152));
		btnSingle.setFont(new Font("Tahoma", Font.BOLD, 30));

		contentPane.add(btnSingle);

		btnMulti = new JButton("Multijugador");
		btnMulti.setBackground(new Color(240, 128, 128));
		btnMulti.setFont(new Font("Tahoma", Font.BOLD, 30));
		contentPane.add(btnMulti);



		btnSalir = new JButton("Salir");
		btnSalir.setBackground(new Color(221, 160, 221));
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 30));
		contentPane.add(btnSalir);

		btnMultUno = new JButton("Contra la m�quina");
		btnMultUno.setFont(new Font("Tahoma", Font.BOLD, 30));

		btnAtras = new JButton("Atr�s");
		btnAtras.setFont(new Font("Tahoma", Font.BOLD, 30));

		registrarEventos();
	}

	//Funci�n que registra los eventos, tal como pulsar un bot�n
	private void registrarEventos() {
		//Boton para seleccionar el modo de juego de un jugador
		btnSingle.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Bingo bingo = new Bingo();
				bingo.setVisible(true);
				dispose();
			}
		});

		//Boton para seleccionar el modo de juego multijugador
		btnMulti.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Multijugador multi = new Multijugador();
				multi.setVisible(true);
				dispose();

			}
		});

		//Boton para cerrar el juego
		btnSalir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(Menu.this,

						"�Seguro que quieres salir?",
						"Salir",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					System.exit(0);
				}				
			}
		});
	}	//Fin de la funci�n registrarEventos


	public void dispose() {
		super.dispose();
	}

}
