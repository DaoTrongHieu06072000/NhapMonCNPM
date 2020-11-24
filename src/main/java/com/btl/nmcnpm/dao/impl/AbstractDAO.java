package com.btl.nmcnpm.dao.impl;


import com.btl.nmcnpm.dao.GenericDAO;
import com.btl.nmcnpm.mapper.RowMapper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;


public class AbstractDAO<T> implements GenericDAO<T> {

	ResourceBundle resourceBundle = ResourceBundle.getBundle("db");
	
	public Connection getConnection() {
		try {
			Class.forName(resourceBundle.getString("driverName"));
			String url = resourceBundle.getString("url");
			String user = resourceBundle.getString("user");
			String password = resourceBundle.getString("password");
			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException | SQLException e) {
			return null;
		}
	}


	@Override
	public <T1> List<T1> query(String sql, RowMapper<T1> rowMapper, Object... parameters) {
		return null;
	}

	@Override
	public void update(String sql, Object... parameters) {

	}

	@Override
	public Long insert(String sql, Object... parameters) {
		return null;
	}

	@Override
	public int count(String sql, Object... parameters) {
		return 0;
	}
}
