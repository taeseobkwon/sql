package db_connect;

import javax.swing.JOptionPane;

public class MemberUITest2 {

	public static void main(String[] args) {
		// 입력하는 화면을 ui파일에 만들자
		
		String id = JOptionPane.showInputDialog("탈퇴할 아이디 입력");
		
		// 입력한 데이터를 가지고 db에 넣읍시다.
		// db의 member 테이블에 넣고 싶음
		// ==> MemberDAO사용하면 됨
		MemberDAO dao = new MemberDAO();
		dao.delete(id);
	}

}
