package gui;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Toolkit;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import java.awt.Cursor;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ReportOne extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2507349675828904524L;
	private JPanel contentPanel = new JPanel();
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ReportOne dialog = new ReportOne();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 * @param <E>
	 */
	public <E> ReportOne() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(CreateEvent.class.getResource("/imagenes/EventosSolLogo.jpg")));
		setTitle("Lista de eventos por tipo");
		setBounds(100, 100, 928, 675);
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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 16));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Informativo", "Deportivo", "Recreativo", "Cultural", "Cient\u00EDfico", "Estudiantil", "Pol\u00EDtico"}));
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(365, 64, 180, 35);
		contentPanel.add(comboBox);
		
		JLabel lblTipoDeEvento = new JLabel("Tipo de evento:");
		lblTipoDeEvento.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTipoDeEvento.setBounds(225, 67, 128, 25);
		contentPanel.add(lblTipoDeEvento);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(49, 134, 812, 437);
		contentPanel.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 16));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
				{null, null, null},
			},
			new String[] {
				"Nombre", "Organizador", "Direcci\u00F3n"
			}
		) {
			Class[] columnTypes = new Class[] {
				String.class, Object.class, Object.class
			};
			public Class getColumnClass(int columnIndex) {
				return columnTypes[columnIndex];
			}
		});
		table.getColumnModel().getColumn(0).setPreferredWidth(79);
		table.getColumnModel().getColumn(0).setMinWidth(18);
		scrollPane.setViewportView(table);
	}
}
