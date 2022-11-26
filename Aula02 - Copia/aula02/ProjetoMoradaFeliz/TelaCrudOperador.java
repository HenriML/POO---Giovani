package ProjetoMoradaFeliz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class TelaCrudOperador {

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
					TelaCrudOperador window = new TelaCrudOperador();
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
	public TelaCrudOperador() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 824, 507);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(89, 38, 4));
		panel.setBorder(new MatteBorder(70, 5, 5, 5, (Color) new Color(53, 70, 43)));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hotel - Fazenda");
		lblNewLabel.setForeground(new Color(217, 209, 179));
		lblNewLabel.setFont(new Font("Viner Hand ITC", Font.PLAIN, 20));
		lblNewLabel.setBounds(249, 11, 155, 24);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Morada Feliz");
		lblNewLabel_1.setForeground(new Color(217, 209, 179));
		lblNewLabel_1.setFont(new Font("Viner Hand ITC", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(340, 41, 183, 24);
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Adicionar Reserva");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(10, 118, 167, 35);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Remover Reserva");
		btnNewButton_1.setBounds(10, 184, 167, 35);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Editar Reserva");
		btnNewButton_2.setBounds(10, 256, 167, 35);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Listar Reserva");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(10, 324, 167, 35);
		panel.add(btnNewButton_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(217, 209, 179));
		panel_1.setBounds(239, 97, 522, 313);
		panel.add(panel_1);
		
		table = new JTable();
		table.setBounds(326, 5, 0, 0);
		panel_1.add(table);
		
		table_1 = new JTable();
		table_1.setBounds(165, 167, 120, -96);
		panel_1.add(table_1);
	}
}
