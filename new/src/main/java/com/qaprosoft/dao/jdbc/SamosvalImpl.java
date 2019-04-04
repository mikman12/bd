package com.qaprosoft.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.qaprosoft.dao.ConnectionPool;
import com.qaprosoft.dao.ISamosval;
import com.qaprosoft.models.Samosval;

public class SamosvalImpl extends AbstractDao implements ISamosval{
	private Connection cn;
	private static final String SQL_GET_BY_ID = "SELECT * FROM samosval  WHERE samosval.id = ?";
	private static final Logger LOG = Logger.getLogger(ConnectionPool.class);
	
	public SamosvalImpl (Connection cn) {
		this.cn = cn;
	}

	public Samosval getById(long id) {
		Samosval samosval = new Samosval();
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = cn.prepareStatement(SQL_GET_BY_ID);
			st.setLong(1, id);
			rs = st.executeQuery();
			if (rs.next()) {
				samosval.setModel(rs.getString("model"));
				samosval.setWeight(rs.getInt("weight"));
				samosval.setAge(rs.getInt("age"));
			
			}

		} catch (SQLException e) {
			LOG.error("SQLException: ", e);
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				LOG.error("SQLException: ", e);
			}
			closePreparedStatement(st);
		}
		return samosval;
	}

	public void update(Samosval samosval) {
		// TODO Auto-generated method stub
		
	}

	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

	public void save(Samosval samosval) {
		// TODO Auto-generated method stub
		
	}
}
