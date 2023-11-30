package gui;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Delete extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 387334653630250021L;
	private JPanel contentPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Delete dialog = new Delete();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Delete() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Delete.class.getResource("/imagenes/EventosSolLogo.jpg")));
		setTitle("Eliminar");
		setBounds(100, 100, 428, 255);
		setLocationRelativeTo(null);
		contentPanel = new JPanel(){
			/**
			 * 
			 */
			private static final long serialVersionUID = 8171124189405063216L;

			public void paintComponent(Graphics g){
				Image img = Toolkit.getDefaultToolkit().getImage(Delete.class.getResource("/imagenes/EventosSolBackgroundVentana.jpg"));
			    g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(),this);
			}
		};
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JButton btnSi = new JButton("Si");
			btnSi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					dispose();
				}
			});
			btnSi.setFont(new Font("Tahoma", Font.PLAIN, 16));
			btnSi.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnSi.setForeground(Color.WHITE);
			btnSi.setBackground(new Color(0, 102, 102));
			btnSi.setActionCommand("OK");
			btnSi.setBounds(66, 127, 97, 35);
			contentPanel.add(btnSi);
		}
		{
			JButton btnNo = new JButton("No");
			btnNo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				dispose();
				}
			});
			btnNo.setFont(new Font("Tahoma", Font.PLAIN, 16));
			btnNo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
			btnNo.setForeground(Color.WHITE);
			btnNo.setBackground(new Color(0, 102, 102));
			btnNo.setActionCommand("Cancel");
			btnNo.setBounds(225, 127, 97, 35);
			contentPanel.add(btnNo);
		}
		{
			JLabel lblestSeguroDe = new JLabel("\u00BFDesea eliminar este evento?");
			lblestSeguroDe.setFont(new Font("Tahoma", Font.PLAIN, 18));
			lblestSeguroDe.setBounds(87, 46, 235, 35);
			contentPanel.add(lblestSeguroDe);
		}
	}

}
