package com;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
		JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate",JdbcTemplate.class);
//		jdbcTemplate.update("insert into employee values(?,?,?,?,?)",434,"king","king@gmail.com",323232,22);
//		System.out.println("inserted");
//		Employee queryForObject = jdbcTemplate.queryForObject("select * from employee where eid=?", new RowMapperImp(),434);
//		System.out.println(queryForObject);
//		Employee queryForObject = jdbcTemplate.queryForObject("select * from employee where eid=?",new RowMapper<Employee>() {
//
//			@Override
//			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
//				// TODO Auto-generated method stub
//				return new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getInt(5));
//
//			}
//			
//		}, 434);
//		System.out.println(queryForObject);
		List<Employee> query = jdbcTemplate.query("select * from employee", (rs,num)->{ return new Employee(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getInt(5)); });
		System.out.println(query);
	}

}
