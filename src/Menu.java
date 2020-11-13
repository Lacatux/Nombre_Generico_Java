import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
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
	private JButton btnOtro;
	private JButton btnSalir;
	private JButton btnMultUno;
	private JButton btnMultDos;
	private JButton btnAtras;
	private JLabel spacerUno;
	private JLabel spacerDos;
	
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
		setIconImage(Toolkit.getDefaultToolkit().getImage("images\\babaicon.png"));
		setResizable(false);
		setTitle("Menu");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 403, 487);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(4, 1, 50, 50));

		btnSingle = new JButton("Un solo jugador");
		btnSingle.setBackground(new Color(152, 251, 152));
		btnSingle.setFont(new Font("Tahoma", Font.BOLD, 30));

		contentPane.add(btnSingle);

		btnMulti = new JButton("Multijugador");
		btnMulti.setBackground(new Color(240, 128, 128));
		btnMulti.setFont(new Font("Tahoma", Font.BOLD, 30));
		contentPane.add(btnMulti);

		btnOtro = new JButton("Otro");
		btnOtro.setBackground(new Color(255, 160, 122));
		btnOtro.setFont(new Font("Tahoma", Font.BOLD, 30));
		contentPane.add(btnOtro);

		btnSalir = new JButton("Salir");
		btnSalir.setBackground(new Color(221, 160, 221));
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 30));
		contentPane.add(btnSalir);
		
		btnMultUno = new JButton("Contra la máquina");
		btnMultUno.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		btnMultDos = new JButton("Local");
		btnMultDos.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		spacerUno = new JLabel("");
		
		spacerDos = new JLabel("");
		
		btnAtras = new JButton("Atrás");
		btnAtras.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		registrarEventos();
	}

	private void registrarEventos() {
		btnSingle.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				Bingo bingo = new Bingo();
				bingo.setVisible(true);
				dispose();
				

			}
		});

		btnMulti.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
//				if(JOptionPane.)
				
			}
		});

		btnOtro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});

		btnSalir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(Menu.this,

						"¿Seguro que quieres salir?",
						"Salir",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
					System.exit(0);
				}				
			}
		});
	}
	
	public void dispose() {
		super.dispose();
	}

}
