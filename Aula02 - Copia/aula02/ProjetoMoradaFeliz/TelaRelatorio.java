package ProjetoMoradaFeliz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;

public class TelaRelatorio {

	private JFrame frame;
	private JTable table;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaRelatorio window = new TelaRelatorio();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaRelatorio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 821, 505);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(89, 38, 4));
		panel.setBorder(new MatteBorder(70, 5, 5, 5, (Color) new Color(53, 70, 43)));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Relatório mensal - Hospedagens");
		lblNewLabel.setForeground(new Color(217, 209, 179));
		lblNewLabel.setFont(new Font("Viner Hand ITC", Font.PLAIN, 22));
		lblNewLabel.setBounds(221, 11, 358, 50);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(217, 209, 179));
		panel_1.setBounds(84, 114, 652, 313);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		table = new JTable();
		table.setBounds(326, 5, 0, 0);
		panel_1.add(table);
		
		table_1 = new JTable();
		table_1.setBounds(165, 167, 120, -96);
		panel_1.add(table_1);
	}
}
