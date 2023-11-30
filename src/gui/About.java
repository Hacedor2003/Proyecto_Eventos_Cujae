package gui;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class About extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2755697271231522830L;
	private  JPanel contentPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			About dialog = new About();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public About() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(About.class.getResource("/imagenes/EventosSolLogo.jpg")));
		setTitle("Acerca de");
		setBounds(100, 100, 504, 525);
		setLocationRelativeTo(null);
		contentPanel = new JPanel(){
			/**
			 * 
			 */
			private static final long serialVersionUID = -2822749727020890736L;

			public void paintComponent(Graphics g){
				Image img= Toolkit.getDefaultToolkit().getImage(About.class.getResource("/imagenes/EventosBackgroundVentanaInfonew.jpg"));
				g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this); 
			}
		};
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JButton btnAtrs = new JButton("Cerrar");
		btnAtrs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnAtrs.setBackground(new Color(0, 102, 102));
		btnAtrs.setForeground(Color.WHITE);
		btnAtrs.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAtrs.setBounds(194, 407, 97, 35);
		contentPanel.add(btnAtrs);
		
		JPanel panel = new JPanel(){

				/**
			 * 
			 */
			private static final long serialVersionUID = -3124921079290261870L;

				public void paintComponent(Graphics g){
					Image img= Toolkit.getDefaultToolkit().getImage(About.class.getResource("/imagenes/EventosSolLogoText.jpg"));
					g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this); 
				}
			};
		panel.setBounds(153, 31, 180, 204);
		contentPanel.add(panel);
		
		JLabel lblVersion = new JLabel("Version 1.0 ");
		lblVersion.setForeground(Color.BLACK);
		lblVersion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblVersion.setBounds(194, 266, 97, 16);
		contentPanel.add(lblVersion);
		
		JLabel label = new JLabel("Fecha: Dic 15  2023  16:49:36");
		label.setForeground(Color.BLACK);
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label.setBounds(118, 313, 249, 16);
		contentPanel.add(label);
		
		JLabel label_1 = new JLabel("Todos los derechos reservados");
		label_1.setForeground(Color.BLACK);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_1.setBounds(118, 360, 249, 16);
		contentPanel.add(label_1);
		
		
	}

}
