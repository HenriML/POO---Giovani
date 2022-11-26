package ProjetoMoradaFeliz;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class TelaCrudAdmin {

	private JFrame frame;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCrudAdmin window = new TelaCrudAdmin();
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
	public TelaCrudAdmin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 821, 506);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(89, 38, 4));
		panel.setForeground(new Color(128, 128, 64));
		panel.setBorder(new MatteBorder(70, 5, 5, 5, (Color) new Color(53, 70, 43)));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hotel - Fazenda");
		lblNewLabel.setBounds(253, 11, 150, 33);
		lblNewLabel.setForeground(new Color(217, 209, 179));
		lblNewLabel.setFont(new Font("Viner Hand ITC", Font.PLAIN, 20));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Morada Feliz");
		lblNewLabel_1.setBounds(343, 35, 153, 41);
		lblNewLabel_1.setForeground(new Color(217, 209, 179));
		lblNewLabel_1.setFont(new Font("Viner Hand ITC", Font.PLAIN, 25));
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Add Operador");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(549, 79, 122, 33);
		panel.add(btnNewButton);
		
		JButton btnRemovOperador = new JButton("Remov. Operador");
		btnRemovOperador.setBounds(673, 79, 122, 33);
		panel.add(btnRemovOperador);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(217, 209, 179));
		panel_1.setBounds(70, 120, 652, 313);
		panel.add(panel_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(234, 61, 131, 20);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(234, 117, 131, 20);
		panel_1.add(textField_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("Adicionar operador:");
		lblNewLabel_2_1.setFont(new Font("Viner Hand ITC", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(251, 11, 139, 14);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3 = new JLabel("Nome:");
		lblNewLabel_3.setFont(new Font("Viner Hand ITC", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(234, 47, 46, 14);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("E-mail:");
		lblNewLabel_4.setFont(new Font("Viner Hand ITC", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(234, 92, 46, 14);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Número de cadastro:");
		lblNewLabel_4_1.setFont(new Font("Viner Hand ITC", Font.PLAIN, 12));
		lblNewLabel_4_1.setBounds(234, 158, 117, 14);
		panel_1.add(lblNewLabel_4_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(234, 183, 131, 20);
		panel_1.add(textField);
	}
}


