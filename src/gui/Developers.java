package gui;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Developers extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6967676926606660089L;
	private  JPanel contentPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Developers dialog = new Developers();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Developers() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Developers.class.getResource("/imagenes/EventosSolLogo.jpg")));
		setTitle("Desarrolladores ");
		setBounds(100, 100, 452, 609);
		setLocationRelativeTo(null);
		contentPanel = new JPanel(){
			/**
			 * 
			 */
			private static final long serialVersionUID = 2539048961736654341L;

			public void paintComponent(Graphics g){
				Image img= Toolkit.getDefaultToolkit().getImage(Developers.class.getResource("/imagenes/EventosBackgroundVentanaInfonew.jpg"));
				g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this); 
			}
		};
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel(){
			/**
			 * 
			 */
			private static final long serialVersionUID = -7479256377822830016L;

			public void paintComponent(Graphics g){
				Image img= Toolkit.getDefaultToolkit().getImage(About.class.getResource("/imagenes/EventosSolLogoText.jpg"));
				g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this); 
			}
		};
		panel.setBounds(127, 26, 180, 204);
		contentPanel.add(panel);
		
		JLabel lblSolangeHernndezRodrguez = new JLabel("Solange Hern\u00E1ndez Rodr\u00EDguez");
		lblSolangeHernndezRodrguez.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSolangeHernndezRodrguez.setBounds(95, 256, 244, 22);
		contentPanel.add(lblSolangeHernndezRodrguez);
		
		JLabel lblBryanLenierEspinosa = new JLabel("Bryan Lenier Espinosa Valino");
		lblBryanLenierEspinosa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBryanLenierEspinosa.setBounds(102, 304, 230, 22);
		contentPanel.add(lblBryanLenierEspinosa);
		
		JLabel lblAleksandrCastaedaMorales = new JLabel("Aleksandr Casta\u00F1eda  Morales ");
		lblAleksandrCastaedaMorales.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAleksandrCastaedaMorales.setBounds(96, 400, 241, 22);
		contentPanel.add(lblAleksandrCastaedaMorales);
		
		JLabel lblMiguelAntonioAlfonzo = new JLabel("Miguel Antonio Alfonzo Menendez");
		lblMiguelAntonioAlfonzo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMiguelAntonioAlfonzo.setBounds(82, 448, 270, 22);
		contentPanel.add(lblMiguelAntonioAlfonzo);
		
		JLabel lblAmandaFernndezMacas = new JLabel("Amanda Fern\u00E1ndez Mac\u00EDas");
		lblAmandaFernndezMacas.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAmandaFernndezMacas.setBounds(111, 352, 212, 22);
		contentPanel.add(lblAmandaFernndezMacas);
		
		JButton btnNewButton = new JButton("Cerrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();
			}
		});
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBackground(new Color(0, 102, 102));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(168, 496, 97, 35);
		contentPanel.add(btnNewButton);
		
	}

}
