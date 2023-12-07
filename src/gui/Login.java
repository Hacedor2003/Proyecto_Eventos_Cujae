package gui;


import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JFrame {

	private static final long serialVersionUID = -2915779788258391995L;
	private JPanel contentPane;
	private JTextField txtIngreseSuNombre;
	private JPasswordField passwordField;
	private JPanel panel;


	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 466);
		this.setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane = new JPanel(){
			/**
			 * 
			 */
			private static final long serialVersionUID = 846367783236957630L;

			public void paintComponent(Graphics g){
				Image img = Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/imagenes/EventosBackgroundVentanaInfonew.jpg"));
			    g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(),this);
			}
		};
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUsuario.setBounds(48, 235, 76, 16);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblContrasea.setBounds(48, 302, 102, 16);
		contentPane.add(lblContrasea);
		
		txtIngreseSuNombre = new JTextField();
		txtIngreseSuNombre.setText("Ingrese su nombre de usuario");
		txtIngreseSuNombre.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			public void mousePressed(MouseEvent e) {
				if(txtIngreseSuNombre.getText().equals("Ingrese su nombre de usuario")){
					txtIngreseSuNombre.setForeground(Color.black);
					txtIngreseSuNombre.setText("");
				}
				if(passwordField.getText().isEmpty()){
					passwordField.setText("********");
			}
			}
		});
		txtIngreseSuNombre.setBounds(162, 228, 222, 28);
		contentPane.add(txtIngreseSuNombre);
		txtIngreseSuNombre.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setText("********");
		passwordField.setToolTipText("");
		passwordField.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			public void mousePressed(MouseEvent e) {
				if(passwordField.getText().equals("********")){
					passwordField.setForeground(Color.BLACK);
					passwordField.setText("");

				}
				if(txtIngreseSuNombre.getText().isEmpty()){
					txtIngreseSuNombre.setText("Ingrese su nombre de usuario");
				}
			}
		});
		passwordField.setBounds(162, 298, 222, 28);
		contentPane.add(passwordField);
		
		panel = new JPanel(){
			/**
			 * 
			 */
			private static final long serialVersionUID = -5932137770074517867L;

			public void paintComponent(Graphics g){
				Image img = Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/imagenes/EventosSolLogo.jpg"));
			    g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(),this);
			}
		};
		panel.setBounds(166, 25, 138, 126);
		contentPane.add(panel);
		
		JLabel lblInicioDeSesin = new JLabel("Inicio de sesi\u00F3n");
		lblInicioDeSesin.setForeground(new Color(0, 102, 102));
		lblInicioDeSesin.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblInicioDeSesin.setBounds(145, 171, 180, 28);
		contentPane.add(lblInicioDeSesin);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				String user = txtIngreseSuNombre.getText();
				String password = passwordField.getText();
				if((user.equalsIgnoreCase("Solange")&&password.equalsIgnoreCase("123890"))||(user.equalsIgnoreCase("Aleksardr")&&password.equalsIgnoreCase("123456"))||user.equalsIgnoreCase("Amanada")&&password.equalsIgnoreCase("1234")||user.equalsIgnoreCase("Bryan")&&password.equalsIgnoreCase("121212")){
					MainScreen c = new MainScreen();
					c.setVisible(true);
					dispose();
				}else{
					JOptionPane.showMessageDialog( Login.this, "La contraseña o el usuario son incorrectos", "Error!!", JOptionPane.INFORMATION_MESSAGE);
				}
				
			}
		});
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBackground(new Color(0, 102, 102));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(80, 375, 97, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancelar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBackground(new Color(0, 102, 102));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton_1.setBounds(287, 375, 97, 35);
		contentPane.add(btnNewButton_1);
	}
}
