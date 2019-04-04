package com.qaprosoft.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.qaprosoft.dao.ConnectionPool;
import com.qaprosoft.dao.ISto;
import com.qaprosoft.models.Sto;

public class StoImpl extends AbstractDao implements ISto{
	private Connection cn;
	private static final String SQL_GET_BY_ID = "SELECT * FROM sto  WHERE sto.id = ?";
	private static final Logger LOG = Logger.getLogger(ConnectionPool.class);
	
	public StoImpl (Connection cn) {
		this.cn = cn;
	}

	public Sto getById(long id) {
		Sto sto = new Sto();
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = cn.prepareStatement(SQL_GET_BY_ID);
			st.setLong(1, id);
			rs = st.executeQuery();
			if (rs.next()) {
				sto.setName(rs.getString("name"));
				sto.setExperience(rs.getInt("weight"));
				sto.setAge(rs.getInt("age"));
			
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
		return sto;
	}

	public void update(Sto sto) {
		// TODO Auto-generated method stub
		
	}

	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

	public void save(Sto sto) {
		// TODO Auto-generated method stub
		
	}
}
