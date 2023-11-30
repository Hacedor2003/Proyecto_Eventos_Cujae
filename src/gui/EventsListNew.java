package gui;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;









import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JDayChooser;

import javax.swing.JButton;

import java.awt.Font;
import java.awt.Cursor;


import javax.swing.border.LineBorder;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import javax.swing.JLabel;
import javax.swing.JScrollPane;

public class EventsListNew extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5592242908710164969L;
	private JPanel contentPanel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			EventsListNew dialog = new EventsListNew();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 * 
	 */
	public EventsListNew() {
		setTitle("Lista de eventos");
		setIconImage(Toolkit.getDefaultToolkit().getImage(EventsListNew.class.getResource("/imagenes/EventosSolLogo.jpg")));
		setBounds(100, 100, 904, 739);
		setLocationRelativeTo(null);
        contentPanel = new JPanel(){


			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g){
				Image img = Toolkit.getDefaultToolkit().getImage(EventsListNew.class.getResource("/imagenes/EventosSolBackgroundVentana.jpg"));
			    g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(),this);
			}
        };
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		final JPanel panel = new JPanel();
		panel.setBounds(40, 164, 299, 272);
		panel.setBackground(new Color(202, 225, 221));
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JDayChooser dayChooser = new JDayChooser();
		dayChooser.setBorder(new LineBorder(new Color(0, 0, 0)));
		dayChooser.setFont(new Font("Tahoma", Font.PLAIN, 14));
		dayChooser.setYear(2023);
		dayChooser.setWeekdayForeground(Color.BLACK);
		dayChooser.setSundayForeground(Color.RED);
		dayChooser.setForeground(Color.BLACK);
		dayChooser.setDecorationBackgroundColor(Color.WHITE);
		dayChooser.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		dayChooser.setAlwaysFireDayProperty(false);
		dayChooser.setBackground(Color.WHITE);
		dayChooser.getDayPanel().setLocation(10, 1);
		dayChooser.setBounds(0, 60, 299, 209);
		panel.add(dayChooser);
		
		JLabel lblCalendario = new JLabel("Calendario");
		lblCalendario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCalendario.setBounds(107, 2, 87, 56);
		panel.add(lblCalendario);
		
		
		JButton button = new JButton("Cancelar");
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button.setBackground(new Color(0, 102, 102));
		button.setActionCommand("Cancel");
		button.setBounds(394, 625, 97, 35);
		contentPanel.add(button);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(339, 32, 486, 561);
		contentPanel.add(scrollPane);
		
		JPanel panel_1 = new JPanel();
		scrollPane.setViewportView(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Evento Prueba");
		btnNewButton.setBackground(new Color(202, 225, 221));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				setBounds(50, 100, 904, 756);
				EventsInformation p = new EventsInformation();
				p.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(0, 0, 484, 74);
		panel_1.add(btnNewButton);
		
	}
}
