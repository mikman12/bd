package com.qaprosoft.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.qaprosoft.dao.ConnectionPool;
import com.qaprosoft.dao.IPogruzchik;
import com.qaprosoft.models.Pogruzchik;

public class PogruzchikImpl extends AbstractDao implements IPogruzchik{
	private Connection cn;
	private static final String SQL_GET_BY_ID = "SELECT * FROM pogruzchik  WHERE pogruzchik.id = ?";
	private static final Logger LOG = Logger.getLogger(ConnectionPool.class);
	
	public PogruzchikImpl(Connection cn) {
		this.cn = cn;
	}

	public Pogruzchik getUserById(long id) {
		Pogruzchik pogruzchik = new Pogruzchik();
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = cn.prepareStatement(SQL_GET_BY_ID);
			st.setLong(1, id);
			rs = st.executeQuery();
			if (rs.next()) {
				pogruzchik.setModel(rs.getString("Model"));
				pogruzchik.setAge(rs.getInt("age"));
			
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
		return pogruzchik;
	}

	public Pogruzchik getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(Pogruzchik pogruzchik) {
		// TODO Auto-generated method stub
		
	}

	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

	public void save(Pogruzchik pogruzchik) {
		// TODO Auto-generated method stub
		
	}
}
