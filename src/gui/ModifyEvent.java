package gui;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Toolkit;

import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;

import java.awt.Font;

import javax.swing.DefaultComboBoxModel;

import com.toedter.calendar.JDateChooser;

import java.awt.Cursor;

import javax.swing.ButtonGroup;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.SpinnerListModel;
import javax.swing.JButton;

public class ModifyEvent extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -840181906098577716L;
	private JPanel contentPanel;
	private JTextField textField;
	private JTextField textField_2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JLabel lblCapacidad;
	private JSpinner spinner;
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ModifyEvent() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(ModifyEvent.class.getResource("/imagenes/EventosSolLogo.jpg")));
		setTitle("Crear evento");
		setBounds(100, 100, 1053, 812);
		getContentPane().setLayout(new BorderLayout());
		setLocationRelativeTo(null);
		contentPanel = new JPanel(){

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g){
				Image img = Toolkit.getDefaultToolkit().getImage(ModifyEvent.class.getResource("/imagenes/EventosSolBackgroundVentana.jpg"));
				g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(),this);
			}

		};
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(114, 23, 807, 204);
		panel.setBackground(new Color(182, 213, 207));
		contentPanel.add(panel);
		panel.setLayout(null);

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(102, 88, 68, 26);
		panel.add(lblNombre);
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNombre.setForeground(Color.BLACK);

		textField = new JTextField();
		textField.setBounds(189, 84, 267, 35);
		textField.setBackground(Color.WHITE);
		panel.add(textField);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setForeground(Color.BLACK);
		textField.setColumns(10);

		JLabel lblOrganizador = new JLabel("Organizador:");
		lblOrganizador.setBounds(64, 145, 106, 26);
		panel.add(lblOrganizador);
		lblOrganizador.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblOrganizador.setForeground(Color.BLACK);

		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(189, 141, 168, 35);
		panel.add(comboBox);
		comboBox.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		comboBox.setBorder(null);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"CUJAE", "FEU", "UJC", "Inform\u00E1tica", "Mec\u00E1nica", "Qu\u00EDmica", "Autom\u00E1tica", "Telecomunicaciones", "El\u00E9ctrica", "Arquitectura ", "Civil", "Industrial "}));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox.setForeground(Color.BLACK);
		comboBox.setBackground(Color.WHITE);

		JLabel lblTipoDeEvento = new JLabel("Tipo de Evento:");
		lblTipoDeEvento.setBounds(387, 145, 126, 26);
		panel.add(lblTipoDeEvento);
		lblTipoDeEvento.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTipoDeEvento.setForeground(Color.BLACK);

		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(524, 142, 168, 35);
		panel.add(comboBox_1);
		comboBox_1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		comboBox_1.setBorder(null);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Cultural", "Deportivo", "Cient\u00EDfico", "Recreativo", "Informativo", "Estudiantil", "Pol\u00EDtico"}));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox_1.setForeground(Color.BLACK);
		comboBox_1.setBackground(Color.WHITE);

		JLabel lblInformacinDelEvento = new JLabel("Informaci\u00F3n del evento");
		lblInformacinDelEvento.setBounds(29, 24, 217, 26);
		lblInformacinDelEvento.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(lblInformacinDelEvento);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(114, 250, 807, 204);
		panel_1.setBackground(new Color(182, 213, 207));
		contentPanel.add(panel_1);
		panel_1.setLayout(null);

		JLabel lblParticipacin = new JLabel("Participaci\u00F3n");
		lblParticipacin.setBounds(29, 13, 118, 26);
		lblParticipacin.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_1.add(lblParticipacin);

		JLabel lblTieneCapacidad = new JLabel("Tiene capacidad:");
		lblTieneCapacidad.setBounds(29, 72, 137, 26);
		panel_1.add(lblTieneCapacidad);
		lblTieneCapacidad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTieneCapacidad.setForeground(Color.BLACK);

		JRadioButton radioButton = new JRadioButton("Si");
		radioButton.setBounds(164, 73, 52, 25);
		panel_1.add(radioButton);
		radioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCapacidad.setEnabled(true);
				spinner.setEnabled(true);
			}
		});
		buttonGroup.add(radioButton);
		radioButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioButton.setBackground(new Color(182, 213, 207));

		JRadioButton radioButton_1 = new JRadioButton("No");
		radioButton_1.setBounds(235, 73, 57, 25);
		panel_1.add(radioButton_1);
		radioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblCapacidad.setEnabled(false);
				spinner.setEnabled(false);
			}
		});
		radioButton_1.setSelected(true);
		buttonGroup.add(radioButton_1);
		radioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioButton_1.setBackground(new Color(182, 213, 207));

		lblCapacidad = new JLabel("Capacidad:");
		lblCapacidad.setBounds(80, 129, 86, 26);
		panel_1.add(lblCapacidad);
		lblCapacidad.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCapacidad.setForeground(Color.BLACK);
		lblCapacidad.setEnabled(false);

		spinner = new JSpinner();
		spinner.setBounds(169, 127, 57, 30);
		panel_1.add(spinner);
		spinner.setBackground(Color.WHITE);
		spinner.setEnabled(false);
		spinner.setModel(new SpinnerNumberModel(new Integer(1), new Integer(1), null, new Integer(1)));
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JLabel label_2 = new JLabel("En equipo:");
		label_2.setBounds(413, 72, 89, 26);
		panel_1.add(label_2);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_2.setForeground(Color.BLACK);

		JRadioButton rdbtnSi = new JRadioButton("Si");
		rdbtnSi.setBounds(530, 73, 52, 25);
		panel_1.add(rdbtnSi);
		buttonGroup_1.add(rdbtnSi);
		rdbtnSi.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnSi.setBackground(new Color(182, 213, 207));

		JRadioButton rdbtnNo = new JRadioButton("No");
		rdbtnNo.setBounds(601, 73, 57, 25);
		panel_1.add(rdbtnNo);
		rdbtnNo.setSelected(true);
		buttonGroup_1.add(rdbtnNo);
		rdbtnNo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rdbtnNo.setBackground(new Color(182, 213, 207));

		JLabel lblTieneIncripcion = new JLabel("Tiene incripci\u00F3n:");
		lblTieneIncripcion.setBounds(391, 129, 129, 26);
		lblTieneIncripcion.setForeground(Color.BLACK);
		lblTieneIncripcion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(lblTieneIncripcion);

		JRadioButton radioButton_2 = new JRadioButton("Si");
		radioButton_2.setBounds(537, 130, 52, 25);
		buttonGroup_2.add(radioButton_2);
		radioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioButton_2.setBackground(new Color(182, 213, 207));
		panel_1.add(radioButton_2);

		JRadioButton radioButton_3 = new JRadioButton("No");
		radioButton_3.setBounds(608, 130, 57, 25);
		buttonGroup_2.add(radioButton_3);
		radioButton_3.setSelected(true);
		radioButton_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioButton_3.setBackground(new Color(182, 213, 207));
		panel_1.add(radioButton_3);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(114, 477, 807, 204);
		panel_2.setBackground(new Color(182, 213, 207));
		contentPanel.add(panel_2);
		panel_2.setLayout(null);

		JLabel lblFechaInicial = new JLabel("Fecha Inicial:");
		lblFechaInicial.setBounds(65, 113, 105, 26);
		panel_2.add(lblFechaInicial);
		lblFechaInicial.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFechaInicial.setForeground(Color.BLACK);

		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(189, 109, 168, 35);
		dateChooser.getCalendarButton().setBackground(new Color(255, 255, 255));
		panel_2.add(dateChooser);
		dateChooser.setBorder(null);
		dateChooser.setBackground(Color.WHITE);

		JLabel lblHoraInicial = new JLabel("Hora Inicial:");
		lblHoraInicial.setBounds(413, 113, 100, 26);
		panel_2.add(lblHoraInicial);
		lblHoraInicial.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblHoraInicial.setForeground(Color.BLACK);

		JSpinner spinner_4 = new JSpinner();
		spinner_4.setBounds(525, 161, 57, 30);
		spinner_4.setBackground(Color.WHITE);
		panel_2.add(spinner_4);
		spinner_4.setModel(new SpinnerNumberModel(1, 1, 23, 1));
		spinner_4.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JSpinner spinner_3 = new JSpinner();
		spinner_3.setBounds(605, 161, 57, 30);
		spinner_3.setBackground(Color.WHITE);
		panel_2.add(spinner_3);
		spinner_3.setModel(new SpinnerListModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		spinner_3.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JLabel lblCoordenadas = new JLabel("Direcci\u00F3n:");
		lblCoordenadas.setBounds(93, 67, 77, 26);
		panel_2.add(lblCoordenadas);
		lblCoordenadas.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCoordenadas.setForeground(Color.BLACK);

		textField_2 = new JTextField();
		textField_2.setBounds(189, 63, 267, 35);
		textField_2.setBackground(Color.WHITE);
		panel_2.add(textField_2);
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_2.setForeground(Color.BLACK);
		textField_2.setColumns(10);

		JLabel lblFechaFinal = new JLabel("Fecha Final:");
		lblFechaFinal.setBounds(77, 159, 93, 26);
		panel_2.add(lblFechaFinal);
		lblFechaFinal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFechaFinal.setForeground(Color.BLACK);

		JLabel lblHoraFinal = new JLabel("Hora Final:");
		lblHoraFinal.setBounds(416, 163, 86, 26);
		panel_2.add(lblHoraFinal);
		lblHoraFinal.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblHoraFinal.setForeground(Color.BLACK);

		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(189, 155, 168, 35);
		panel_2.add(dateChooser_1);
		dateChooser_1.setBorder(null);
		dateChooser_1.setBackground(Color.WHITE);



		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(525, 113, 57, 30);
		spinner_1.setBackground(Color.WHITE);
		panel_2.add(spinner_1);
		spinner_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		spinner_1.setModel(new SpinnerNumberModel(1, 1, 23, 1));

		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(605, 113, 57, 30);
		spinner_2.setBackground(Color.WHITE);
		panel_2.add(spinner_2);
		spinner_2.setModel(new SpinnerListModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));
		spinner_2.setFont(new Font("Tahoma", Font.PLAIN, 18));

		JLabel lblOrganizacin = new JLabel("Organizaci\u00F3n");
		lblOrganizacin.setBounds(29, 14, 124, 26);
		lblOrganizacin.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_2.add(lblOrganizacin);

		JButton button_1 = new JButton("Cancelar");
		button_1.setBounds(657, 704, 97, 35);
		contentPanel.add(button_1);
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
		button.setBounds(280, 704, 97, 35);
		contentPanel.add(button);
		button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button.setBackground(new Color(0, 102, 102));
	}
}
