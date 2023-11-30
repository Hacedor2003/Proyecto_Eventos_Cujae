package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class CreateArea extends JDialog {

	private static final long serialVersionUID = 1991493914223077816L;
	private JPanel contentPanel1 = new JPanel();
	private JTextField textField1;
	public CreateArea() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CreateEvent.class.getResource("/imagenes/EventosSolLogo.jpg")));
		setTitle("Crear area");
		setBounds(100, 100, 525, 317);
		getContentPane().setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		contentPanel1 = new JPanel(){

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g){
				Image img = Toolkit.getDefaultToolkit().getImage(CreateEvent.class.getResource("/imagenes/EventosSolBackgroundVentana.jpg"));
				g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(),this);
			}

		};
		contentPanel1.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel1, BorderLayout.CENTER);
		contentPanel1.setLayout(null);

		JButton button_1 = new JButton("Cancelar");
		button_1.setBounds(305, 167, 97, 35);
		contentPanel1.add(button_1);
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
		button.setBounds(104, 164, 97, 35);
		contentPanel1.add(button);
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button.setBackground(new Color(0, 102, 102));

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(57, 69, 68, 26);
		contentPanel1.add(lblNombre);
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNombre.setForeground(Color.BLACK);

		textField1 = new JTextField();
		textField1.setBounds(182, 66, 267, 35);
		contentPanel1.add(textField1);
		textField1.setBackground(Color.WHITE);
		textField1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField1.setForeground(Color.BLACK);
		textField1.setColumns(10);
	}
}
