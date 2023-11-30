package gui;




import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EventsInfo extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5587063973858140571L;
	private  JPanel contentPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			EventsInfo dialog = new EventsInfo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public EventsInfo() {
		setTitle("Información del evento");
		setIconImage(Toolkit.getDefaultToolkit().getImage(EventsInfo.class.getResource("/imagenes/EventosSolLogo.jpg")));
		setBounds(100, 100, 949, 756);
		setLocationRelativeTo(null);
        contentPanel = new JPanel(){


			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g){
				Image img = Toolkit.getDefaultToolkit().getImage(EventsInfo.class.getResource("/imagenes/EventosBackgroundVentanaInfonew.jpg"));
			    g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(),this);
			}
        };
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel(){
			
				/**
			 * 
			 */
			private static final long serialVersionUID = 9011386467384391017L;

				public void paintComponent(Graphics g){
					Image img = Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/imagenes/EventosSolLogo.jpg"));
				    g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(),this);
				}
			};

		panel.setBounds(406, 43, 118, 104);
		contentPanel.add(panel);
		
		JLabel lblNombre = new JLabel("Nombre del evento ");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNombre.setBounds(92, 190, 184, 29);
		contentPanel.add(lblNombre);
		
		JLabel lblOrganizador = new JLabel("Organizado por (Nombre del organizador)");
		lblOrganizador.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblOrganizador.setBounds(92, 262, 376, 29);
		contentPanel.add(lblOrganizador);
		
		JLabel lblDelfecha = new JLabel("Del (Fecha Inicial) al (Fecha Final)");
		lblDelfecha.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblDelfecha.setBounds(92, 334, 317, 29);
		contentPanel.add(lblDelfecha);
		
		JLabel lblhoraraio = new JLabel("(Hora Inicio)--(Hora Final)");
		lblhoraraio.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblhoraraio.setBounds(92, 406, 249, 29);
		contentPanel.add(lblhoraraio);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(106, 480, 544, 149);
		contentPanel.add(panel_1);
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(182, 213, 207));
		
		JLabel lblDescripcionDelEvento = new JLabel("Descripcion del Evento");
		lblDescripcionDelEvento.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblDescripcionDelEvento.setBounds(179, 53, 271, 30);
		panel_1.add(lblDescripcionDelEvento);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		scrollBar.setBounds(523, 0, 21, 149);
		scrollBar.setBackground(new Color(182, 213, 207));
		panel_1.add(scrollBar);
		
		JButton btnInscribir = new JButton("Inscribir");
		btnInscribir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inscription p = new Inscription();
				p.setVisible(true);
			}
		});
		btnInscribir.setForeground(Color.WHITE);
		btnInscribir.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnInscribir.setBackground(new Color(0, 102, 102));
		btnInscribir.setBounds(720, 540, 118, 29);
		contentPanel.add(btnInscribir);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnAceptar.setForeground(Color.WHITE);
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAceptar.setBackground(new Color(0, 102, 102));
		btnAceptar.setBounds(406, 661, 118, 35);
		contentPanel.add(btnAceptar);
		
		
			
	}
}
