package gui;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProfileInformation extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 387334653630250021L;
	private  JPanel contentPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ProfileInformation dialog = new ProfileInformation();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ProfileInformation() {
		setFont(new Font("Tahoma", Font.PLAIN, 14));
		setTitle("Informaci\u00F3n de perfil");
		setIconImage(Toolkit.getDefaultToolkit().getImage(ProfileInformation.class.getResource("/imagenes/EventosSolLogo.jpg")));
		setBounds(100, 100, 433, 582);
		setLocationRelativeTo(null);
		contentPanel = new JPanel(){
			/**
			 * 
			 */
			private static final long serialVersionUID = 8171124189405063216L;

			public void paintComponent(Graphics g){
				Image img= Toolkit.getDefaultToolkit().getImage(ProfileInformation.class.getResource("/imagenes/EventosBackgroundVentanaInfonew.jpg"));
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
			private static final long serialVersionUID = -1851908344186506883L;

			public void paintComponent(Graphics g){
				Image img= Toolkit.getDefaultToolkit().getImage(About.class.getResource("/imagenes/EventosSolLogo.jpg"));
				g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this); 
			}
		};
		panel.setBounds(163, 39, 88, 97);
		contentPanel.add(panel);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNombre.setBounds(106, 175, 75, 20);
		contentPanel.add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos:");
		lblApellidos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblApellidos.setBounds(93, 234, 88, 20);
		contentPanel.add(lblApellidos);
		
		JLabel lblTelefono = new JLabel("Tel\u00E9fono:");
		lblTelefono.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTelefono.setBounds(100, 293, 81, 20);
		contentPanel.add(lblTelefono);
		
		JLabel lblCarnetDeIdentidad = new JLabel("Carnet de identidad:");
		lblCarnetDeIdentidad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCarnetDeIdentidad.setBounds(12, 352, 169, 20);
		contentPanel.add(lblCarnetDeIdentidad);
		
		JLabel lblrea = new JLabel("\u00C1rea:");
		lblrea.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblrea.setBounds(134, 411, 47, 20);
		contentPanel.add(lblrea);
		
		JLabel lblSolange = new JLabel("Solange");
		lblSolange.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblSolange.setBounds(193, 175, 75, 20);
		contentPanel.add(lblSolange);
		
		JLabel lblHernndezRodrguez = new JLabel("Hern\u00E1ndez Rodr\u00EDguez ");
		lblHernndezRodrguez.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblHernndezRodrguez.setBounds(193, 234, 173, 20);
		contentPanel.add(lblHernndezRodrguez);
		
		JLabel label = new JLabel("58871138");
		label.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label.setBounds(193, 293, 88, 20);
		contentPanel.add(label);
		
		JLabel label_1 = new JLabel("04090367236");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_1.setBounds(191, 352, 186, 20);
		contentPanel.add(label_1);
		
		JLabel lblFacultadInformtica = new JLabel("Facultad Inform\u00E1tica");
		lblFacultadInformtica.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFacultadInformtica.setBounds(193, 411, 248, 20);
		contentPanel.add(lblFacultadInformtica);
		
		JButton button = new JButton("Cerrar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button.setBackground(new Color(0, 102, 102));
		button.setBounds(159, 472, 97, 35);
		contentPanel.add(button);
		
	}

}
