package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.model.Employee;
import com.demo.utility.DBConnection;

public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public void save(Employee e) {

		Connection conn = DBConnection.getConnection();
		try {
			System.out.println("DAO" + e);
			PreparedStatement ps = conn.prepareStatement("insert into employee values(?,?,?,?,?)");
			ps.setInt(1, e.getId());
			ps.setString(2, e.getName());
			ps.setFloat(3, e.getSalary());
			ps.setString(4, e.getAddress());
			ps.setString(5, e.getMobileNo());
			int x = ps.executeUpdate();
			if (x != 0) {
				System.out.println("Data Inserted");
			} else {
				System.out.println("Issue with query");
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	@Override
	public List<Employee> fetchAll() {
		List<Employee> list = new ArrayList<Employee>();
		Connection conn = DBConnection.getConnection();
		try {

			PreparedStatement ps = conn.prepareStatement("select * from employee");

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Employee e = new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getFloat(3));
				e.setAddress(rs.getString(4));
				e.setMobileNo(rs.getString(5));
				list.add(e);

			}

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return list;
	}

}
