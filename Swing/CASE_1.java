package INPUT_OUTPUT;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;

public class CASE_1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CASE_1 frame = new CASE_1();
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
	public CASE_1() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
			
		JLabel lblNewLabel = new JLabel("User Application Form");
		lblNewLabel.setBounds(140, 5, 117, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("FIRST NAME");
		lblNewLabel_1.setBounds(54, 30, 90, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("LAST NAME");
		label.setBounds(54, 50, 90, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("DATE OF BIRTH");
		label_1.setBounds(54, 70, 90, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("MOBILE NUMBER");
		label_2.setBounds(54, 90, 97, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("GENDER");
		label_3.setBounds(54, 110, 90, 14);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("EMAIL ID");
		label_4.setBounds(54, 130, 90, 14);
		contentPane.add(label_4);
		
		textField = new JTextField();
		textField.setBounds(190, 30, 117, 14);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(190, 50, 117, 14);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(190, 70, 117, 14);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(190, 90, 117, 14);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(190, 130, 117, 14);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("M");
		rdbtnNewRadioButton.setBounds(185, 106, 46, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("F");
		rdbtnNewRadioButton_1.setBounds(246, 106, 46, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JTextArea t = new JTextArea();
		t.setFont(new Font("MS Mincho", Font.PLAIN, 11));
		t.setEditable(false);
		t.setBackground(Color.GREEN);
		t.setForeground(Color.RED);
		t.setBounds(54, 155, 315, 95);
		contentPane.add(t);
		
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String f,l,d,m,em,g;
		f=textField.getText();
		l=textField_2.getText();
		d=textField_3.getText();
		m=textField_4.getText();
		if(rdbtnNewRadioButton_1.isSelected())
			g="F";
		else
			g="M";
		em=textField_5.getText();
		t.setText("Registration Succesful!!  Your Details are\nFirst Name 		"+f+"\nLast Name 		"+l+"\nDate of Birth 		"+d+"\nMobail Number		"+m+"\nGender		"+g+"\nEmail ID		"+em);
			
			}
		});
		btnNewButton.setBounds(324, 126, 89, 23);
		contentPane.add(btnNewButton);
		
		
		
		
		
	
	}
}
