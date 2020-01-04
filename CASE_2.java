package INPUT_OUTPUT;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CASE_2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CASE_2 frame = new CASE_2();
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
	public CASE_2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new MatteBorder(2, 1, 1, 1, (Color) null));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("DISTANCE CALCULATOR");
		lblNewLabel.setBounds(140, 5, 117, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SOURCE LOCATION");
		lblNewLabel_1.setBounds(59, 52, 110, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("DESTINATION LOCATION");
		label.setBounds(57, 98, 148, 14);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(202, 49, 125, 14);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(202, 95, 125, 14);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("DISTANCE COVERED");
		lblNewLabel_2.setBounds(59, 185, 110, 14);
		contentPane.add(lblNewLabel_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(202, 185, 125, 14);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("CALCULATE DISTANCE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText("500");
			}
		});
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBounds(97, 138, 174, 23);
		contentPane.add(btnNewButton);
	}
}
