package dbTest;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.jupiter.api.Test;

public class MySQLConnectionTest {
	// MySQL Connector 클래스. 드라이버 정의
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	
	// DB경로
	private static final String URL = "jdbc:mysql://trend-voca-app-db.c81nuixy656e.ap-northeast-2.rds.amazonaws.com:3306/vocabulary?serverTimezone=Asia/Seoul&characterEncoding=utf8&useSSL=false";
	private static final String USER = "davidchoi";
	private static final String PASSWORD = "zbCX2x0wx2R05gViEDhO";
	
	@Test
	public void testConnection() throws Exception {
		Class.forName(DRIVER);
		try {
			Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println(connection);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
