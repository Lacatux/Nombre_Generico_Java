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
	private JButton Num1;
	private JButton Num2;
	private JButton Num3;
	private JButton Num4;
	private JButton Num5;
	private JButton Num6;
	private JButton Num7;
	private JButton Num8;
	private JButton Num9;
	private JButton Num10;
	private JButton Num11;
	private JButton Num12;
	private JButton Num13;
	private JButton Num14;
	private JButton Num15;
	private JButton Num16;
	private JButton Num17;
	private JButton Num18;
	private JButton Num19;
	private JButton Num20;
	private JButton Num21;
	private JButton Num22;
	private JButton Num23;
	private JButton Num24;
	private JButton Num25;
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
		
		Num1 = new JButton("Num1");
		contentPane.add(Num1);
		
		Num2 = new JButton("Num2");
		contentPane.add(Num2);
		
		Num3 = new JButton("Num3");
		contentPane.add(Num3);
		
		Num4 = new JButton("Num4");
		contentPane.add(Num4);
		
		Num5 = new JButton("Num5");
		contentPane.add(Num5);
		
		lblNewLabel = new JLabel("");
		contentPane.add(lblNewLabel);
		
		NuevaPartida = new JButton("Nueva Partida");
		contentPane.add(NuevaPartida);
		
		Num6 = new JButton("Num6");
		contentPane.add(Num6);
		
		Num7 = new JButton("Num7");
		contentPane.add(Num7);
		
		Num8 = new JButton("Num8");
		contentPane.add(Num8);
		
		Num9 = new JButton("Num9");
		contentPane.add(Num9);
		
		Num10 = new JButton("Num10");
		contentPane.add(Num10);
		
		lblNewLabel_1 = new JLabel("");
		contentPane.add(lblNewLabel_1);
		
		NumeroNuevo = new JLabel("Numero Nuevo");
		contentPane.add(NumeroNuevo);
		
		Num11 = new JButton("Num11");
		contentPane.add(Num11);
		
		Num12 = new JButton("Num12");
		contentPane.add(Num12);
		
		Num13 = new JButton("Num13 (Free)");
		contentPane.add(Num13);
		
		Num14 = new JButton("Num14");
		contentPane.add(Num14);
		
		Num15 = new JButton("Num15");
		contentPane.add(Num15);
		
		lblNewLabel_2 = new JLabel("");
		contentPane.add(lblNewLabel_2);
		
		UltimoNum = new JLabel("Ultimo Numero");
		contentPane.add(UltimoNum);
		
		Num16 = new JButton("Num16");
		contentPane.add(Num16);
		
		Num17 = new JButton("Num17");
		contentPane.add(Num17);
		
		Num18 = new JButton("Num18");
		contentPane.add(Num18);
		
		Num19 = new JButton("Num19");
		contentPane.add(Num19);
		
		Num20 = new JButton("Num20");
		contentPane.add(Num20);
		
		lblNewLabel_3 = new JLabel("");
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("");
		contentPane.add(lblNewLabel_4);
		
		Num21 = new JButton("Num21");
		contentPane.add(Num21);
		
		Num22 = new JButton("Num22");
		contentPane.add(Num22);
		
		Num23 = new JButton("Num23");
		contentPane.add(Num23);
		
		Num24 = new JButton("Num24");
		contentPane.add(Num24);
		
		Num25 = new JButton("Num25");
		contentPane.add(Num25);
		
		Siguiente = new JButton("Siguiente -->");
		contentPane.add(Siguiente);
		
		Exit = new JButton("Exit");
		contentPane.add(Exit);
	}

}
