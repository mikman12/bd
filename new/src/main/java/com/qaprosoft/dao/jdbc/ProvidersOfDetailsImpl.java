package com.qaprosoft.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.qaprosoft.dao.ConnectionPool;
import com.qaprosoft.dao.IProvidersOfDetails;
import com.qaprosoft.models.ProvidersOfDetails;

public class ProvidersOfDetailsImpl extends AbstractDao implements IProvidersOfDetails{
	private Connection cn;
	private static final String SQL_GET_BY_ID = "SELECT * FROM providersofdetails  WHERE providersofdetails.id = ?";
	private static final Logger LOG = Logger.getLogger(ConnectionPool.class);
	
	public ProvidersOfDetailsImpl (Connection cn) {
		this.cn = cn;
	}

	public ProvidersOfDetails getById(long id) {
		ProvidersOfDetails providersofdetails = new ProvidersOfDetails();
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = cn.prepareStatement(SQL_GET_BY_ID);
			st.setLong(1, id);
			rs = st.executeQuery();
			if (rs.next()) {
				providersofdetails.setCity(rs.getString("city"));
				providersofdetails.setName(rs.getString("name"));
			
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
		return providersofdetails;
	}

	public void update(ProvidersOfDetails providersofdetails) {
		// TODO Auto-generated method stub
		
	}

	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

	public void save(ProvidersOfDetails providersofdetails) {
		// TODO Auto-generated method stub
		
	}
}
