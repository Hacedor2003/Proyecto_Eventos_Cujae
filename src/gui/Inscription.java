package gui;

import java.awt.BorderLayout;


import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Inscription extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3846067922225884979L;
	private JPanel contentPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Inscription dialog = new Inscription();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Inscription() {
		setTitle("Inscripci\u00F3n");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Inscription.class.getResource("/imagenes/EventosSolLogo.jpg")));
		setBounds(100, 100, 428, 255);
		setLocationRelativeTo(null);
        contentPanel = new JPanel(){
        	/**
			 * 
			 */
			private static final long serialVersionUID = 2641192080654544421L;

			public void paintComponent(Graphics g){
				Image img = Toolkit.getDefaultToolkit().getImage(Inscription.class.getResource("/imagenes/EventosSolBackgroundVentana.jpg"));
			    g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(),this);
			}
        };
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton okButton = new JButton("Aceptar");
			okButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
			okButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					dispose();
				}
			});
			okButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			okButton.setBackground(new Color(0, 102, 102));
			okButton.setForeground(Color.WHITE);
			okButton.setBounds(68, 125, 97, 35);
			contentPanel.add(okButton);
			okButton.setActionCommand("OK");
			getRootPane().setDefaultButton(okButton);
		}
		{
			JButton cancelButton = new JButton("Cancelar");
			cancelButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
			cancelButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			cancelButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			cancelButton.setBackground(new Color(0, 102, 102));
			cancelButton.setForeground(Color.WHITE);
			cancelButton.setBounds(245, 125, 97, 35);
			contentPanel.add(cancelButton);
			cancelButton.setActionCommand("Cancel");
		}
		{
			JLabel lblEstSeguroDe = new JLabel("\u00BFEst\u00E1 seguro de inscribirse en este evento?");
			lblEstSeguroDe.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblEstSeguroDe.setBounds(36, 45, 341, 35);
			contentPanel.add(lblEstSeguroDe);
		}
	}

}
