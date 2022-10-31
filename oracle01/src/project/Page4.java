package project;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.util.ArrayList;

import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Page4 {
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	
		// 1. 데이터값을 배열로 가져오자
		// 2. 배열의 첫번째 값을 콤보박스에 넣어 아이디 검색
		// 3. 해당 콤보박스에 넣은 아이디와 같은 비밀번호, 전화번호, 이름, 직원여부 정보 불러오자
		

	// 일단 배열을 임의로 만들어 2,3번 실험
		String[] ID = {"kkk", "lll", "ppp", "rrr", "hhh", "mmm", "ccc", "aaa", "bbb"};
		String[] PW = {"1234", "1234", "1234", "1234", "1234", "1234", "1234", "1234", "1234"};
		String[] TEL = {"01011", "01022", "01033", "01044", "01055", "01066", "01077", "01088", "01099"};
		String[] NAME = {"kim", "lee", "park", "ryu", "hong", "moon", "choo", "ahn", "byun"};
		String[] ROL = {"staff", "staff", "customer", "staff", "customer", "staff", "customer", "customer", "staff"};
	/**
	 * @wbp.parser.entryPoint
	 */
	public void open() {
		JFrame f = new JFrame("스탭관리");
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel l1 = new JLabel("ID");
		l1.setBounds(110, 40, 79, 23);
		f.getContentPane().add(l1);
		
		JLabel l2 = new JLabel("PW");
		l2.setBounds(110, 73, 79, 23);
		f.getContentPane().add(l2);
		
		JLabel l3 = new JLabel("TEL");
		l3.setBounds(110, 106, 79, 23);
		f.getContentPane().add(l3);
		
		JLabel l4 = new JLabel("NAME");
		l4.setBounds(110, 139, 79, 23);
		f.getContentPane().add(l4);
		
		JLabel l5 = new JLabel("ROL");
		l5.setBounds(110, 172, 79, 23);
		f.getContentPane().add(l5);
		
		t2 = new JTextField();
		t2.setEditable(false);
		t2.setBackground(new Color(255, 255, 255));
		t2.setText("pw값받아올거임");
		t2.setColumns(10);
		t2.setBounds(229, 75, 168, 21);
		f.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setBackground(new Color(255, 255, 255));
		t3.setEditable(false);
		t3.setText("tel값받아올거임");
		t3.setColumns(10);
		t3.setBounds(229, 108, 168, 21);
		f.getContentPane().add(t3);
		
		t4 = new JTextField();
		t4.setBackground(new Color(255, 255, 255));
		t4.setText("name값받아올거임");
		t4.setEditable(false);
		t4.setColumns(10);
		t4.setBounds(229, 141, 168, 21);
		f.getContentPane().add(t4);
		
		t5 = new JTextField();
		t5.setBackground(new Color(255, 255, 255));
		t5.setText("rol값받아올거임");
		t5.setEditable(false);
		t5.setColumns(10);
		t5.setBounds(229, 174, 168, 21);
		f.getContentPane().add(t5);
		
		JLabel lblNewLabel = new JLabel("Multi Cafe");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(62, 215, 361, 214);
		f.getContentPane().add(lblNewLabel);
		
		JComboBox cb = new JComboBox(ID);
		cb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox jcb = (JComboBox)e.getSource();
				int index = jcb.getSelectedIndex();
				t2.setText(PW[index]);
				t3.setText(TEL[index]);
				t4.setText(NAME[index]);
				t5.setText(ROL[index]);
				
			}
		});
		

		cb.setBackground(new Color(255, 255, 255));
		cb.setBounds(229, 40, 168, 23);
		f.getContentPane().add(cb);
		f.setVisible(true);
		
	}
	
	
	
	
	
	
	
	
}
