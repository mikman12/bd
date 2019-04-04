package com.qaprosoft.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.qaprosoft.dao.ConnectionPool;
import com.qaprosoft.dao.IFura;
import com.qaprosoft.models.Fura;

public class FuraImpl extends AbstractDao implements IFura{
	private Connection cn;
	private static final String SQL_GET_BY_ID = "SELECT * FROM fura  WHERE fura.id = ?";
	private static final Logger LOG = Logger.getLogger(ConnectionPool.class);
	
	public FuraImpl(Connection cn) {
		this.cn = cn;
	}

	public Fura getById(long id) {
		Fura fura = new Fura();
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = cn.prepareStatement(SQL_GET_BY_ID);
			st.setLong(1, id);
			rs = st.executeQuery();
			if (rs.next()) {
				fura.setWeight(rs.getInt("weight"));
				fura.setAge(rs.getInt("age"));
			
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
		return fura;
	}

	
	public void update(Fura fura) {
		// TODO Auto-generated method stub
		
	}

	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

	public void save(Fura fura) {
		// TODO Auto-generated method stub
		
	}


}
