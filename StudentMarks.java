import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StudentMarks {

	private JFrame frame;
	private JTextField sub1;
	private JTextField sub3;
	private JTextField grade;
	private JTextField totalmarks;
	private JTextField average;
	private JTextField Grade;
	private JTextField sub2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentMarks window = new StudentMarks();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public StudentMarks() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setForeground(Color.RED);
		frame.setBounds(100, 100, 454, 324);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Total Marks");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(29, 175, 79, 28);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel(" Student Marks Calculation System");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(84, 10, 307, 13);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Subject 1");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_1_2.setBounds(29, 61, 60, 13);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Subject 2");
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_1_3.setBounds(29, 95, 60, 13);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Subject 3");
		lblNewLabel_1_4.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_1_4.setBounds(29, 131, 60, 13);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Grade");
		lblNewLabel_1_5.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_1_5.setBounds(29, 249, 72, 13);
		frame.getContentPane().add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("Average");
		lblNewLabel_1_5_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel_1_5_1.setBounds(29, 213, 60, 13);
		frame.getContentPane().add(lblNewLabel_1_5_1);
		
		sub1 = new JTextField();
		sub1.setBounds(139, 58, 96, 19);
		frame.getContentPane().add(sub1);
		sub1.setColumns(10);
		
		sub3 = new JTextField();
		sub3.setBounds(139, 128, 96, 19);
		frame.getContentPane().add(sub3);
		sub3.setColumns(10);
		
		grade = new JTextField();
		grade.setBounds(139, 253, 96, -9);
		frame.getContentPane().add(grade);
		grade.setColumns(10);
		
		totalmarks = new JTextField();
		totalmarks.setColumns(10);
		totalmarks.setBounds(139, 175, 96, 19);
		frame.getContentPane().add(totalmarks);
		
		average = new JTextField();
		average.setColumns(10);
		average.setBounds(139, 210, 96, 19);
		frame.getContentPane().add(average);
		
		Grade = new JTextField();
		Grade.setColumns(10);
		Grade.setBounds(139, 246, 96, 19);
		frame.getContentPane().add(Grade);
		
		sub2 = new JTextField();
		sub2.setColumns(10);
		sub2.setBounds(139, 92, 96, 19);
		frame.getContentPane().add(sub2);
		
		JButton btnNewButton = new JButton("EXIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton.setBounds(281, 194, 82, 51);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CLEAR");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sub1.setText("");
				sub2.setText("");
				sub3.setText("");
				totalmarks.setText("");
				average.setText("");
				Grade.setText("");
				sub1.requestFocus();
				
			}
		});
		btnNewButton_1.setBounds(284, 130, 79, 43);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("ADD");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int s1 = Integer.parseInt(sub1.getText());
				int s2 = Integer.parseInt(sub2.getText());
				int s3 = Integer.parseInt(sub3.getText());
				int total = s1 + s2 + s3;
				float avg = total/3; 
				
				totalmarks.setText(String.valueOf(total));
				average.setText(String.valueOf(avg));
				
				if(avg>45)
				{
					Grade.setText("Passed");
				}
				else
				{
					Grade.setText("Failed");
				}
			}
		});
		btnNewButton_2.setBounds(278, 57, 85, 51);
		frame.getContentPane().add(btnNewButton_2);
	}
}
