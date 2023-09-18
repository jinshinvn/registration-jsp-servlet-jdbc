package net.employeeregjdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import net.employeeregjdbc.model.Employee;

public class EmployeeDAO {
	public int registerEmployee(Employee employee) throws ClassNotFoundException {
		String INSERT_USERS_SQL = "INSERT INTO employee" + 
		" (name, username, password, note) VALUES " + 
				"? ? ? ?";
		int result = 0;
		
		// LinkageError: if the linkage fails
		// ExceptionInInitializerError: if the initialization provoked by this method fails
		// ClassNotFoundException: if the class cannot be located
		
		Class.forName("com.mysql.jdbc.Driver");
		try (Connection connection = DriverManager
			.getConnection("jdbc:mysql://localhost:3306/j2ee_registration_employee_jdbc?useSSL=false", "root", "")) {
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL);
			preparedStatement.setString(1, employee.getName());
			preparedStatement.setString(2,  employee.getUsername());
			preparedStatement.setString(3,  employee.getPassword());
			preparedStatement.setString(4,  employee.getNote());
			System.out.println(preparedStatement);
			
			result = preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
		
	}
}
