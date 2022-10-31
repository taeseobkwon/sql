package cafe;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class StaffManage {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		
		f.setSize(500, 600);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(61, 50, 103, 33);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setBounds(61, 104, 103, 33);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("전화번호");
		lblNewLabel_1_1.setBounds(61, 162, 103, 33);
		f.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("이름");
		lblNewLabel_1_1_1.setBounds(61, 229, 103, 33);
		f.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("직원여부");
		lblNewLabel_1_1_1_1.setBounds(61, 296, 103, 33);
		f.getContentPane().add(lblNewLabel_1_1_1_1);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(176, 104, 170, 33);
		f.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(176, 168, 170, 33);
		f.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(176, 235, 170, 33);
		f.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		textField_3.setBounds(176, 296, 170, 33);
		f.getContentPane().add(textField_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("1번");
		comboBox.addItem("2번");
		
		comboBox.setBounds(176, 55, 170, 23);
		f.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("데이터 가져오기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(97, 392, 97, 23);
		f.getContentPane().add(btnNewButton);
		
		
		f.setVisible(true);
	}
}
