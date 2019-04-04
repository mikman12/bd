package com.qaprosoft.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.qaprosoft.dao.ConnectionPool;
import com.qaprosoft.dao.IForeignProducer;
import com.qaprosoft.models.ForeignProducer;

public class ForeignProducerImpl extends AbstractDao implements IForeignProducer {
	
	private Connection cn;
	private static final String SQL_GET_BY_ID = "SELECT * FROM foreignproducer  WHERE foreignproducer.id = ?";
	private static final Logger LOG = Logger.getLogger(ConnectionPool.class);
	
	public ForeignProducerImpl(Connection cn) {
		this.cn = cn;
	}

	public ForeignProducer getById(long id) {
		ForeignProducer foreignproducer = new ForeignProducer();
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = cn.prepareStatement(SQL_GET_BY_ID);
			st.setLong(1, id);
			rs = st.executeQuery();
			if (rs.next()) {
				foreignproducer.setCity(rs.getString("city"));
				foreignproducer.setName(rs.getString("name"));
				foreignproducer.setRating(rs.getString("rating"));
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
		return foreignproducer;
	}

	public void update(ForeignProducer foreignproducer) {
		// TODO Auto-generated method stub
		
	}

	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

	public void save(ForeignProducer foreignproducer) {
		// TODO Auto-generated method stub
		
	}



}
