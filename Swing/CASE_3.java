package INPUT_OUTPUT;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CASE_3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField t;
	private JTextField te;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CASE_3 frame = new CASE_3();
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
	public CASE_3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblNewLabel = new JLabel("DISCOUNT CALCULATOR");
		lblNewLabel.setBounds(141, 11, 148, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PRINCIPAL AMOUNT");
		lblNewLabel_1.setBounds(59, 52, 110, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblDiscountPercentage = new JLabel("DISCOUNT PERCENTAGE");
		lblDiscountPercentage.setBounds(57, 98, 148, 14);
		contentPane.add(lblDiscountPercentage);
		
		t = new JTextField();
		t.setBounds(236, 49, 86, 20);
		contentPane.add(t);
		t.setColumns(10);
		
		te = new JTextField();
		te.setBounds(236, 95, 86, 20);
		contentPane.add(te);
		te.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("DISTANCE COVERED");
		lblNewLabel_2.setBounds(59, 185, 110, 14);
		contentPane.add(lblNewLabel_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(202, 185, 125, 14);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("CALCULATE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int b=Integer.parseInt(t.getText());
						int c=Integer.parseInt(te.getText());
				double a= ((100-c)*b/100.0);
				textArea.setText(String.valueOf(a));
			}
		});
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBounds(128, 136, 161, 23);
		contentPane.add(btnNewButton);
		
		
		
		
	}
	
	

}
