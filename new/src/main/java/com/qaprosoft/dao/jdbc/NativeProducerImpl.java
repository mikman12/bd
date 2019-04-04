package com.qaprosoft.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.qaprosoft.dao.ConnectionPool;
import com.qaprosoft.dao.INativeProducer;
import com.qaprosoft.models.NativeProducer;

public class NativeProducerImpl extends AbstractDao implements INativeProducer {
	private Connection cn;
	private static final String SQL_GET_BY_ID = "SELECT * FROM nativeproducer  WHERE nativeproducer.id = ?";
	private static final Logger LOG = Logger.getLogger(ConnectionPool.class);
	
	public NativeProducerImpl(Connection cn) {
		this.cn = cn;
	}

	public NativeProducer getById(long id) {
		NativeProducer nativeproducer = new NativeProducer();
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = cn.prepareStatement(SQL_GET_BY_ID);
			st.setLong(1, id);
			rs = st.executeQuery();
			if (rs.next()) {
				nativeproducer.setCity(rs.getString("city"));
				nativeproducer.setName(rs.getString("name"));
				nativeproducer.setRating(rs.getString("rating"));
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
		return nativeproducer;
	}

	public void update(NativeProducer nativeproducer) {
		// TODO Auto-generated method stub
		
	}

	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

	public void save(NativeProducer nativeproducer) {
		// TODO Auto-generated method stub
		
	}
}


