package cafe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StaffDAO1 {
	Connection con;
	
	String IDArr[] = new String[10];
	String PWArr[] = new String[10];
	String TELArr[] = new String[10];
	String NAMEArr[] = new String[10];
	String ROLArr[] = new String[10];
	
	public StaffDAO1() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "scott";
		String password = "tiger";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 드라이버 설정 성공.@@@@");
		} catch (Exception e) {
		}
		
		try {
			System.out.println("데이터베이스연결준비");
			con = DriverManager.getConnection(url, user, password);
			System.out.println("데이터베이스연결성공");
		} catch (Exception e) {
		}
		
	}
	void getMembers() throws Exception {
		String query = "SELECT ID, PW, TEL, NAME, ROL from MEMBERS";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		
		int index = 0;
		while(rs.next()) {
			IDArr[index] = rs.getString(1);
			PWArr[index] = rs.getString(2);
			TELArr[index] = rs.getString(3);
			NAMEArr[index] = rs.getString(4);
			ROLArr[index] = rs.getString(5);
			
			index++;
		}
		con.close();
	}
	void printMembers() throws Exception {
		System.out.printf("ID", "PW", "TEL", "NAME", "ROL");
		for(int i=0; i<10; i++) {
			System.out.println(IDArr[i] + ", " + PWArr[i] + ", " + TELArr[i] + ", " + NAMEArr[i] + ", " + ROLArr[i]);
		}
	}
}