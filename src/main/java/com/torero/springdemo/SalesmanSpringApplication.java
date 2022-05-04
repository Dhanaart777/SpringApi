package com.torero.springdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class SalesmanSpringApplication {

	static final String QUERY = "exec Med_SP_DS_Company_List 'NcLZ68NpKZv7HYZx8g5cnphYFa6ncXyHkDEpr3f2'";

	public static void main(String[] args) {
		SpringApplication.run(SalesmanSpringApplication.class, args);

		String userName = "SPIDER";
		String password = "123";

		// String url = "jdbc:sqlserver://192.168.1.137:4000;databaseName=Rajesh";
		String url = "jdbc:sqlserver://182.70.116.222:4000;databaseName=Rajesh";

		try {

			// Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			// Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");

			Connection conn = DriverManager.getConnection(url, userName, password);

			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(QUERY);

			{
				while (rs.next()) {
					// Display values
					System.out.print("SIUnqId: " + rs.getInt("CompanyId"));
					System.out.println("/n");
				}
			}

			System.out.println("connection successful" + conn);

		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("error");

		} finally {

		}

	}

}
