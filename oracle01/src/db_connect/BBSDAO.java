package db_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BBSDAO {

		// 등록기능, 기능하나당 메서드하나
	public void insert(String ID, String TITLE, String CONTENT, String WRITER) {
		// 자바에서 DMBS를 연결하려고 함
		// JDBC 프로그래밍 절차
		// 4단계 절차
		// 1. 드라이버 설정 - 드라이버(커넥터) 로딩
		// 	db의 유형, 버전에 따라 매우 많음
		//	필요할 떄 다운로드 받아 써야 함
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		 //특정한 위치에 있는 드라이버 파일을 램에 읽어드여 설정
		System.out.println("1. 드라이버 설정 성공.@@@@");
		
		
		// 2. db연결 mySQL: school, oralce: xe
		String url = "jdbc:oracle:thin:@localhost:1521:xe";				;
		String user = "scott";
		String password = "tiger";
		Connection con = DriverManager.getConnection(url, user, password); //Connection
		System.out.println("2. db연결 성공.@@@@@");
		
		// 3. sql문을 만든다.
		String sql = "insert into BBS10 values (?, ?, ?, ?)";
		// 준비된 문장(Preparedstatement)
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, ID); //1번 물음표에 id에 저장해놓은 값을 스트링으로 넣음
		ps.setString(2, TITLE); //2번 물음표에 pw에 저장해놓은 값을 스트링으로 넣음
		ps.setString(3, CONTENT); //3번 물음표에 name에 저장해놓은 값을 스트링으로 넣음
		ps.setString(4, WRITER); //4번 물음표에 tel에 저장해놓은 값을 스트링으로 넣음
		
		System.out.println("3. sql문 생성.@@@@@@");
		
		// 4. sql문을 db서버에 보낸다. --> 결과가 어떻게 되었는지 자바프로그렘에 알려줌.
		int result = ps.executeUpdate(); // read의 결과는 table, cud의 결과는 숫자(실행된row수)
		System.out.println("4. sql문 db서버로 전송 성공.@@@@@@@ 반영된 row수 >>" + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	} // insert

	// 탈퇴기능
	public void delete(String ID) {
		// 자바에서 DMBS를 연결하려고 함
		// JDBC 프로그래밍 절차
		// 4단계 절차
		// 1. 드라이버 설정 - 드라이버(커넥터) 로딩
		// 	db의 유형, 버전에 따라 매우 많음
		//	필요할 떄 다운로드 받아 써야 함
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		 //특정한 위치에 있는 드라이버 파일을 램에 읽어드여 설정
		System.out.println("1. 드라이버 설정 성공.@@@@");
		
		
		// 2. db연결 mySQL: school, oralce: xe
		String url = "jdbc:oracle:thin:@localhost:1521:xe";				;
		String user = "scott";
		String password = "tiger";
		Connection con = DriverManager.getConnection(url, user, password); //Connection
		System.out.println("2. db연결 성공.@@@@@");
		
		// 3. sql문을 만든다.
		String sql = "delete from BBS10 where ID = ?";
		// 준비된 문장(Preparedstatement)
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, ID); //1번 물음표에 id에 저장해놓은 값을 스트링으로 넣음
		
		System.out.println("3. sql문 생성.@@@@@@");
		
		// 4. sql문을 db서버에 보낸다. --> 결과가 어떻게 되었는지 자바프로그렘에 알려줌.
		int result = ps.executeUpdate(); // read의 결과는 table, cud의 결과는 숫자(실행된row수)
		System.out.println("4. sql문 db서버로 전송 성공.@@@@@@@ 반영된 row수 >>" + result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	} // delete
	
	// 수정기능
		public void update(String ID, String TITLE, String CONTENT, String WRITER) {
			// 자바에서 DMBS를 연결하려고 함
			// JDBC 프로그래밍 절차
			// 4단계 절차
			// 1. 드라이버 설정 - 드라이버(커넥터) 로딩
			// 	db의 유형, 버전에 따라 매우 많음
			//	필요할 떄 다운로드 받아 써야 함
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			 //특정한 위치에 있는 드라이버 파일을 램에 읽어드여 설정
			System.out.println("1. 드라이버 설정 성공.@@@@");
			
			
			// 2. db연결 mySQL: school, oralce: xe
			String url = "jdbc:oracle:thin:@localhost:1521:xe";				;
			String user = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(url, user, password); //Connection
			System.out.println("2. db연결 성공.@@@@@");
			
			// 3. sql문을 만든다.
			String sql = "UPDATE BBS10 SET TITLE = ?, CONTENT = ?, WRITER = ? WHERE ID = ?";
			// 준비된 문장(Preparedstatement)
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(4, ID); //1번 물음표에 id에 저장해놓은 값을 스트링으로 넣음
			ps.setString(1, TITLE); //2번 물음표에 pw에 저장해놓은 값을 스트링으로 넣음
			ps.setString(2, CONTENT); //3번 물음표에 name에 저장해놓은 값을 스트링으로 넣음
			ps.setString(3, WRITER); //4번 물음표에 tel에 저장해놓은 값을 스트링으로 넣음
			
			System.out.println("3. sql문 생성.@@@@@@");
			
			// 4. sql문을 db서버에 보낸다. --> 결과가 어떻게 되었는지 자바프로그렘에 알려줌.
			int result = ps.executeUpdate(); // read의 결과는 table, cud의 결과는 숫자(실행된row수)
			System.out.println("4. sql문 db서버로 전송 성공.@@@@@@@ 반영된 row수 >>" + result);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			
			
		} // delete
}
