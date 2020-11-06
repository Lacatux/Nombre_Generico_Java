import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

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
	private JLabel lbl1;
	private JLabel lbl2;
	private JLabel lbl3;
	private JLabel lbl4;
	private JLabel lbl5;
	private JLabel lbl6;
	private JLabel lbl7;
	private JLabel lbl8;
	private JLabel lbl9;
	private JLabel lbl10;


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
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

		lbl1 = new JLabel("");
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lbl1);

		lbl2 = new JLabel("");
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lbl2);

		lbl3 = new JLabel("");
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lbl3);

		lbl4 = new JLabel("");
		lbl4.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lbl4);

		lbl5 = new JLabel("");
		contentPane.add(lbl5);

		lbl6 = new JLabel("");
		contentPane.add(lbl6);

		lbl7 = new JLabel("");
		contentPane.add(lbl7);

		lbl8 = new JLabel("");
		contentPane.add(lbl8);

		lbl9 = new JLabel("");
		contentPane.add(lbl9);

		lbl10 = new JLabel("");
		contentPane.add(lbl10);
	}

}
