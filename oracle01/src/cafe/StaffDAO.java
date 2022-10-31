package cafe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StaffDAO {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 드라이버 설정 성공.@@@@");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			
			String user = "scott";
			String password = "tiger";
			Connection con = DriverManager.getConnection(url, user, password); // Connection
			System.out.println("2. db연결 성공.@@@@@");

			//String sql = "insert into MEMBERS values ('ice0120', 'ice02', 'ice2', 'ice2', 'ice2')";
			String sql = "select ID from MEMBERS where rol = 'staff'";
			// rol값이 staff인것들을 찾음 select ID from MEMBERS where rol = 'staff'
			// 찾은 데이터 중 ID값만 콤보상자에 넣음
			// 콤보상자의 ID값이 변화하면 텍스트필드의 비밀번호, 전화번호, 이름, 직원여부변화
			PreparedStatement ps = con.prepareStatement(sql);
			System.out.println("3. sql문 생성.@@@@@@");
			
			
			int result = ps.executeUpdate(); // read의 결과는 table, cud의 결과는 숫자(실행된row수)
			System.out.println("4. sql문 db서버로 전송 성공.@@@@@@@ 반영된 row수 >>" + result);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}