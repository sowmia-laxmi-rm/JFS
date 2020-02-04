package INPUT_OUTPUT;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.DropMode;
import javax.swing.JEditorPane;

public class case5 extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private final Action action = new SwingAction();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField txtG;
	private JTextField txtNetPrice;
	private JTextField textField_9;
	private JTextField txtRs_5;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					case5 frame = new case5();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public case5() {
		setBackground(Color.LIGHT_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 10, 600, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBounds(94, 172, 21, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("");
		chckbxNewCheckBox_1.setBounds(117, 94, 21, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.setBounds(94, 94, 21, 23);
		contentPane.add(checkBox);
		
		JCheckBox checkBox_1 = new JCheckBox("");
		checkBox_1.setBounds(68, 198, 21, 23);
		contentPane.add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("");
		checkBox_2.setBounds(45, 94, 21, 23);
		contentPane.add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("");
		checkBox_3.setBounds(22, 120, 21, 23);
		contentPane.add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("");
		checkBox_4.setBounds(22, 94, 21, 23);
		contentPane.add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("");
		checkBox_5.setBounds(45, 120, 21, 23);
		contentPane.add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("");
		checkBox_6.setBounds(22, 146, 21, 23);
		contentPane.add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("");
		checkBox_7.setBounds(45, 146, 21, 23);
		contentPane.add(checkBox_7);
		
		JCheckBox checkBox_8 = new JCheckBox("");
		checkBox_8.setBounds(22, 172, 21, 23);
		contentPane.add(checkBox_8);
		
		JCheckBox checkBox_9 = new JCheckBox("");
		checkBox_9.setBounds(45, 172, 21, 23);
		contentPane.add(checkBox_9);
		
		JCheckBox checkBox_10 = new JCheckBox("");
		checkBox_10.setBounds(22, 198, 21, 23);
		contentPane.add(checkBox_10);
		
		JCheckBox checkBox_11 = new JCheckBox("");
		checkBox_11.setBounds(45, 198, 21, 23);
		contentPane.add(checkBox_11);
		
		JCheckBox checkBox_12 = new JCheckBox("");
		checkBox_12.setBounds(94, 120, 21, 23);
		contentPane.add(checkBox_12);
		
		JCheckBox checkBox_13 = new JCheckBox("");
		checkBox_13.setBounds(94, 146, 21, 23);
		contentPane.add(checkBox_13);
		
		JCheckBox checkBox_14 = new JCheckBox("");
		checkBox_14.setAction(action);
		checkBox_14.setBounds(117, 120, 21, 23);
		contentPane.add(checkBox_14);
		
		JCheckBox checkBox_15 = new JCheckBox("");
		checkBox_15.setBounds(117, 146, 21, 23);
		contentPane.add(checkBox_15);
		
		JCheckBox checkBox_16 = new JCheckBox("");
		checkBox_16.setBounds(117, 172, 21, 23);
		contentPane.add(checkBox_16);
		
		JCheckBox checkBox_17 = new JCheckBox("");
		checkBox_17.setBounds(117, 198, 21, 23);
		contentPane.add(checkBox_17);
		
		JCheckBox checkBox_18 = new JCheckBox("");
		checkBox_18.setBounds(94, 198, 21, 23);
		contentPane.add(checkBox_18);
		
		JTextArea txtrSeats = new JTextArea();
		txtrSeats.setEditable(false);
		txtrSeats.setBackground(Color.GRAY);
		txtrSeats.setText("SEATS");
		txtrSeats.setBounds(56, 65, 44, 23);
		contentPane.add(txtrSeats);
		
		JTextArea txtrBookTick = new JTextArea();
		txtrBookTick.setEditable(false);
		txtrBookTick.setBackground(Color.GRAY);
		txtrBookTick.setText("BOOK TICKETS");
		txtrBookTick.setBounds(224, 11, 100, 22);
		contentPane.add(txtrBookTick);
		
		JTextArea txtrB = new JTextArea();
		txtrB.setEditable(false);
		txtrB.setBackground(Color.GRAY);
		txtrB.setWrapStyleWord(true);
		txtrB.setTabSize(7);
		txtrB.setText("Booking Detail");
		txtrB.setBounds(219, 32, 137, 22);
		contentPane.add(txtrB);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setLabelFor(lblNewLabel);
		lblNewLabel.setBounds(195, 70, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("Name");
		label.setIcon(null);
		label.setBounds(195, 172, 46, 14);
		contentPane.add(label);
		
		JLabel lblNewLabel_1 = new JLabel("DOB");
		lblNewLabel_1.setBounds(195, 94, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel label_1 = new JLabel("DOB");
		label_1.setBounds(195, 197, 46, 14);
		contentPane.add(label_1);
		
		JLabel lblPhysicallyDisabled = new JLabel("Physically Disabled");
		lblPhysicallyDisabled.setBounds(225, 113, 99, 14);
		contentPane.add(lblPhysicallyDisabled);
		
		JLabel label_2 = new JLabel("Physically Disabled");
		label_2.setBounds(225, 217, 99, 14);
		contentPane.add(label_2);
		
		JLabel lblSeatNo = new JLabel("Seat No 1");
		lblSeatNo.setBounds(195, 138, 99, 14);
		contentPane.add(lblSeatNo);
		
		JLabel lblSeatNo_1 = new JLabel("Seat No 2");
		lblSeatNo_1.setBounds(195, 242, 99, 14);
		contentPane.add(lblSeatNo_1);
		
		textField = new JTextField();
		textField.setDropMode(DropMode.INSERT);
		textField.setBounds(238, 67, 86, 20);
		contentPane.add(textField);
		textField.setColumns(8);
		
		textField_1 = new JTextField();
		textField_1.setDropMode(DropMode.INSERT);
		textField_1.setColumns(8);
		textField_1.setBounds(238, 91, 63, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setDropMode(DropMode.INSERT);
		textField_2.setColumns(8);
		textField_2.setBounds(238, 172, 86, 20);
		contentPane.add(textField_2);
		
		txtG = new JTextField();
		txtG.setDropMode(DropMode.INSERT);
		txtG.setColumns(8);
		txtG.setBounds(238, 194, 63, 20);
		contentPane.add(txtG);
		
		JCheckBox checkBox_19 = new JCheckBox("");
		checkBox_19.setBounds(195, 109, 21, 23);
		contentPane.add(checkBox_19);
		
		JCheckBox checkBox_20 = new JCheckBox("");
		checkBox_20.setBounds(195, 213, 21, 23);
		contentPane.add(checkBox_20);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setEnabled(false);
		textPane_2.setEditable(false);
		textPane_2.setBackground(Color.LIGHT_GRAY);
		textPane_2.setBounds(22, 94, 44, 101);
		contentPane.add(textPane_2);
		
		JTextPane textPane_3 = new JTextPane();
		textPane_3.setEnabled(false);
		textPane_3.setEditable(false);
		textPane_3.setBackground(Color.LIGHT_GRAY);
		textPane_3.setBounds(94, 94, 44, 101);
		contentPane.add(textPane_3);
		
		JTextPane textPane_4 = new JTextPane();
		textPane_4.setEnabled(false);
		textPane_4.setEditable(false);
		textPane_4.setBackground(Color.LIGHT_GRAY);
		textPane_4.setBounds(22, 198, 116, 23);
		contentPane.add(textPane_4);
		
		JButton btnPrint = new JButton("Print");
		btnPrint.setBounds(423, 220, 89, 23);
		contentPane.add(btnPrint);
		
		txtNetPrice = new JTextField();
		txtNetPrice.setEditable(false);
		txtNetPrice.setBackground(Color.YELLOW);
		txtNetPrice.setText("NET PRICE");
		txtNetPrice.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtNetPrice.setColumns(10);
		txtNetPrice.setBounds(394, 189, 63, 23);
		contentPane.add(txtNetPrice);
		
		textField_9 = new JTextField();
		textField_9.setBackground(Color.LIGHT_GRAY);
		textField_9.setColumns(10);
		textField_9.setBounds(467, 189, 55, 23);
		contentPane.add(textField_9);
		
		txtRs_5 = new JTextField();
		txtRs_5.setEditable(false);
		txtRs_5.setText("RS");
		txtRs_5.setBackground(Color.PINK);
		txtRs_5.setColumns(10);
		txtRs_5.setBounds(532, 189, 21, 23);
		contentPane.add(txtRs_5);
		
		JLabel lblNewLabel_2 = new JLabel("COST");
		lblNewLabel_2.setBounds(394, 70, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("NOS");
		lblNewLabel_3.setBounds(394, 94, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("TOTAL");
		lblNewLabel_4.setBounds(394, 120, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Deduction");
		lblNewLabel_5.setBounds(394, 138, 63, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("GST");
		lblNewLabel_6.setBounds(394, 163, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("RS");
		lblNewLabel_7.setBounds(532, 70, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel label_3 = new JLabel("RS");
		label_3.setBounds(532, 113, 46, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("RS");
		label_4.setBounds(532, 138, 46, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("RS");
		label_5.setBounds(532, 163, 46, 14);
		contentPane.add(label_5);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.LIGHT_GRAY);
		textArea.setBounds(467, 65, 55, 121);
		contentPane.add(textArea);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBackground(Color.LIGHT_GRAY);
		editorPane.setEditable(false);
		editorPane.setBounds(171, 64, 164, 90);
		contentPane.add(editorPane);
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setBackground(Color.LIGHT_GRAY);
		editorPane_1.setEditable(false);
		editorPane_1.setBounds(171, 166, 164, 90);
		contentPane.add(editorPane_1);
		
		JEditorPane editorPane_2 = new JEditorPane();
		editorPane_2.setBackground(Color.LIGHT_GRAY);
		editorPane_2.setEditable(false);
		editorPane_2.setBounds(392, 47, 182, 209);
		contentPane.add(editorPane_2);
		
	}

	private class SwingAction extends AbstractAction {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
