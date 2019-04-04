package com.qaprosoft.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.qaprosoft.dao.ConnectionPool;
import com.qaprosoft.dao.IGarage;
import com.qaprosoft.models.Garage;

public class GarageImpl extends AbstractDao implements IGarage{
	private Connection cn;
	private static final String SQL_GET_BY_ID = "SELECT * FROM garage  WHERE garage.id = ?";
	private static final Logger LOG = Logger.getLogger(ConnectionPool.class);
	
	public GarageImpl(Connection cn) {
		this.cn = cn;
	}
	public Garage getById(long id) {
		Garage garage = new Garage();
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = cn.prepareStatement(SQL_GET_BY_ID);
			st.setLong(1, id);
			rs = st.executeQuery();
			if (rs.next()) {
				garage.setAddress(rs.getString("address"));
				garage.setSize(rs.getString("size"));
			
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
		return garage;
	}

	public void update(Garage garage) {
		// TODO Auto-generated method stub
		
	}

	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

	public void save(Garage garage) {
		// TODO Auto-generated method stub
		
	}
}
