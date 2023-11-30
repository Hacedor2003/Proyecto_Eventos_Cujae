package gui;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Toolkit;

import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JComboBox;

import java.awt.Font;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;

public class CreateUser extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -840181906098577716L;
	private JPanel contentPanel;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_1;
	private JTextField textField_3;
	
	public CreateUser() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CreateUser.class.getResource("/imagenes/EventosSolLogo.jpg")));
		setTitle("Crear evento");
		setBounds(100, 100, 681, 577);
		getContentPane().setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		contentPanel = new JPanel(){

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g){
				Image img = Toolkit.getDefaultToolkit().getImage(CreateUser.class.getResource("/imagenes/EventosSolBackgroundVentana.jpg"));
				g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(),this);
			}

		};
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(62, 27, 538, 413);
		panel.setBackground(new Color(182, 213, 207));
		contentPanel.add(panel);
		panel.setLayout(null);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(113, 98, 68, 26);
		panel.add(lblNombre);
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNombre.setForeground(Color.BLACK);

		textField = new JTextField();
		textField.setBounds(244, 94, 267, 35);
		textField.setBackground(Color.WHITE);
		panel.add(textField);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setForeground(Color.BLACK);
		textField.setColumns(10);

		JLabel lblOrganizador = new JLabel("\u00C1rea:");
		lblOrganizador.setBounds(135, 222, 46, 26);
		panel.add(lblOrganizador);
		lblOrganizador.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblOrganizador.setForeground(Color.BLACK);

		JLabel lblTipoDeEvento = new JLabel("Carnet de identidad:");
		lblTipoDeEvento.setBounds(21, 346, 160, 26);
		panel.add(lblTipoDeEvento);
		lblTipoDeEvento.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTipoDeEvento.setForeground(Color.BLACK);

		JLabel lblInformacinDelEvento = new JLabel("Informaci\u00F3n del usuario:");
		lblInformacinDelEvento.setBounds(29, 36, 237, 26);
		lblInformacinDelEvento.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(lblInformacinDelEvento);
		
				JLabel lblCoordenadas = new JLabel("Apellidos:");
				lblCoordenadas.setBounds(104, 160, 77, 26);
				panel.add(lblCoordenadas);
				lblCoordenadas.setFont(new Font("Tahoma", Font.PLAIN, 18));
				lblCoordenadas.setForeground(Color.BLACK);
				
						textField_2 = new JTextField();
						textField_2.setBounds(244, 156, 267, 35);
						panel.add(textField_2);
						textField_2.setBackground(Color.WHITE);
						textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
						textField_2.setForeground(Color.BLACK);
						textField_2.setColumns(10);
						
						textField_1 = new JTextField();
						textField_1.setForeground(Color.BLACK);
						textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
						textField_1.setColumns(10);
						textField_1.setBackground(Color.WHITE);
						textField_1.setBounds(244, 280, 267, 35);
						panel.add(textField_1);
						
						textField_3 = new JTextField();
						textField_3.setForeground(Color.BLACK);
						textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
						textField_3.setColumns(10);
						textField_3.setBackground(Color.WHITE);
						textField_3.setBounds(241, 342, 272, 35);
						panel.add(textField_3);
						
								JLabel lblTieneCapacidad = new JLabel("Tel\u00E9fono:");
								lblTieneCapacidad.setBounds(99, 284, 82, 26);
								panel.add(lblTieneCapacidad);
								lblTieneCapacidad.setFont(new Font("Tahoma", Font.PLAIN, 18));
								lblTieneCapacidad.setForeground(Color.BLACK);
								
								JComboBox<Object> comboBox = new JComboBox<Object>();
								comboBox.setBackground(Color.WHITE);
								comboBox.setBounds(244, 218, 259, 35);
								panel.add(comboBox);

		JButton button_1 = new JButton("Cancelar");
		button_1.setBounds(366, 467, 97, 35);
		contentPanel.add(button_1);
		button_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button_1.setBackground(new Color(0, 102, 102));

		JButton button = new JButton("Aceptar");
		button.setBounds(162, 467, 97, 35);
		contentPanel.add(button);
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button.setBackground(new Color(0, 102, 102));
	}
}
