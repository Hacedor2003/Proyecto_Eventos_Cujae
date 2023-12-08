package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MainScreen extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5267008543153849752L;
	private JPanel contentPane;
	private int programer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScreen frame = new MainScreen();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public int getProgramer() {
		return programer;
	}

	public void setProgramer(int programer) {
		this.programer = programer;
	}

	/**
	 * Create the frame.
	 */
	public MainScreen() {
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				MainScreen.class.getResource("/imagenes/EventosSolLogo.jpg")));
		setTitle("EVENTOS CUJAE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setUndecorated(true);
		setBounds(100, 100, 888, 605);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Tahoma", Font.PLAIN, 18));
		menuBar.setForeground(new Color(0, 102, 102));
		menuBar.setBackground(new Color(0, 102, 102));
		setJMenuBar(menuBar);

		JMenu mnInicio = new JMenu("Inicio");
		mnInicio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		mnInicio.setForeground(Color.WHITE);
		mnInicio.setBackground(new Color(0, 102, 102));
		menuBar.add(mnInicio);

		JMenuItem mntmMiPerfil = new JMenuItem("Mi perfil");
		mntmMiPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProfileInformation p = new ProfileInformation();
				p.setIndicate(programer);
				p.setVisible(true);
			}
		});
		mntmMiPerfil.setFont(new Font("Tahoma", Font.PLAIN, 18));
		mntmMiPerfil.setForeground(Color.WHITE);
		mntmMiPerfil.setBackground(new Color(0, 102, 102));
		mnInicio.add(mntmMiPerfil);

		JMenuItem mntmCerrarSesin = new JMenuItem("Cerrar Sesi\u00F3n");
		mntmCerrarSesin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login p = new Login();
				p.setVisible(true);
				dispose();
			}
		});
		mntmCerrarSesin.setFont(new Font("Tahoma", Font.PLAIN, 18));
		mntmCerrarSesin.setForeground(Color.WHITE);
		mntmCerrarSesin.setBackground(new Color(0, 102, 102));
		mnInicio.add(mntmCerrarSesin);

		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		mntmSalir.setFont(new Font("Tahoma", Font.PLAIN, 18));
		mntmSalir.setForeground(Color.WHITE);
		mntmSalir.setBackground(new Color(0, 102, 102));
		mnInicio.add(mntmSalir);

		JMenu mnEventos = new JMenu("Eventos");
		mnEventos.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				EventsListNew p = new EventsListNew();
				p.setVisible(true);
			}
		});

		mnEventos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		mnEventos.setForeground(Color.WHITE);
		mnEventos.setBackground(new Color(0, 102, 102));
		menuBar.add(mnEventos);

		JMenu mnNewMenu = new JMenu("Reportes");
		mnNewMenu.setFont(new Font("Tahoma", Font.PLAIN, 18));
		mnNewMenu.setForeground(Color.WHITE);
		mnNewMenu.setBackground(new Color(0, 102, 102));
		menuBar.add(mnNewMenu);

		JMenu mnAyuda = new JMenu("Ayuda");
		mnAyuda.setFont(new Font("Tahoma", Font.PLAIN, 18));
		mnAyuda.setForeground(Color.WHITE);
		mnAyuda.setBackground(new Color(0, 102, 102));
		menuBar.add(mnAyuda);

		JMenuItem mntmAcercaDe = new JMenuItem("Acerca de");
		mntmAcercaDe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				About p = new About();
				p.setVisible(true);

			}
		});
		mntmAcercaDe.setFont(new Font("Tahoma", Font.PLAIN, 18));
		mntmAcercaDe.setForeground(Color.WHITE);
		mntmAcercaDe.setBackground(new Color(0, 102, 102));
		mnAyuda.add(mntmAcercaDe);

		JMenuItem mntmDesarrolladores = new JMenuItem("Desarrolladores");
		mntmDesarrolladores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Developers p = new Developers();
				p.setVisible(true);

			}
		});
		mntmDesarrolladores.setFont(new Font("Tahoma", Font.PLAIN, 18));
		mntmDesarrolladores.setForeground(Color.WHITE);
		mntmDesarrolladores.setBackground(new Color(0, 102, 102));
		mnAyuda.add(mntmDesarrolladores);

		contentPane = new JPanel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 3455681479534045303L;

			public void paintComponent(Graphics g) {
				Image img = Toolkit
						.getDefaultToolkit()
						.getImage(
								MainScreen.class
										.getResource("/imagenes/EventosSolBackground.jpg"));
				g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
			}
		};
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

	}
}
