package db_connect;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MemberUI {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		JFrame f = new JFrame(); //f객체 생성
		f.getContentPane().setBackground(new Color(128, 255, 128));
		f.setSize(500, 600); //가로500, 세로600
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("회원정보");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 30));
		lblNewLabel.setBackground(new Color(0, 255, 64));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(118, 45, 223, 57);
		f.getContentPane().add(lblNewLabel);
		
		JLabel L1 = new JLabel("ID");
		L1.setBounds(65, 125, 86, 33);
		f.getContentPane().add(L1);
		
		JLabel L2 = new JLabel("PW");
		L2.setBounds(65, 168, 86, 33);
		f.getContentPane().add(L2);
		
		JLabel L3 = new JLabel("NAME");
		L3.setBounds(65, 211, 86, 33);
		f.getContentPane().add(L3);
		
		JLabel L4 = new JLabel("TEL");
		L4.setBounds(65, 254, 86, 33);
		f.getContentPane().add(L4);
		
		t1 = new JTextField();
		t1.setBounds(178, 125, 193, 33);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(178, 168, 193, 33);
		f.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(178, 211, 193, 33);
		f.getContentPane().add(t3);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(178, 254, 193, 33);
		f.getContentPane().add(t4);
		
		JButton B1 = new JButton("회원가입완료");
		B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// 1. t1,t2,t3,t4에 입력한 값을 가지고 오기
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				// 2. db에 넣기 위해 MemberDAO를 만들어주고,
				MemberDAO dao = new MemberDAO();
				dao.insert(id, pw, name, tel);
				// 3. 회원등록 기능을 쓰기 위해서 insert() 메서드 호출
				
				// 		--> 1번에서 가지고 온 데이터를 주면서 insert()실행
				
			}
		});
		B1.setBounds(103, 332, 243, 51);
		f.getContentPane().add(B1);
		
		JButton B2 = new JButton("회원탈퇴처리");
		B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				MemberDAO dao = new MemberDAO();
				dao.delete(id);
			}
		});
		B2.setBounds(103, 425, 243, 51);
		f.getContentPane().add(B2);
		f.setVisible(true);
		
		
	}
}
