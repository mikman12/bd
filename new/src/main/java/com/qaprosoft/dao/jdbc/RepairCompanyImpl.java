package com.qaprosoft.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.qaprosoft.dao.ConnectionPool;
import com.qaprosoft.dao.IRepairCompany;
import com.qaprosoft.models.RepairCompany;

public class RepairCompanyImpl extends AbstractDao implements IRepairCompany{
	private Connection cn;
	private static final String SQL_GET_BY_ID = "SELECT * FROM repaircompany  WHERE repaircompany.id = ?";
	private static final Logger LOG = Logger.getLogger(ConnectionPool.class);
	
	public RepairCompanyImpl (Connection cn) {
		this.cn = cn;
	}

	public RepairCompany getById(long id) {
		RepairCompany repaircompany = new RepairCompany();
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = cn.prepareStatement(SQL_GET_BY_ID);
			st.setLong(1, id);
			rs = st.executeQuery();
			if (rs.next()) {
				repaircompany.setCity(rs.getString("city"));
				repaircompany.setName(rs.getString("name"));
				repaircompany.setRating(rs.getString("rating"));
				repaircompany.setAge(rs.getInt("age"));
			
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
		return repaircompany;
	}

	public void update(RepairCompany repaircompany) {
		// TODO Auto-generated method stub
		
	}

	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

	public void save(RepairCompany repaircompany) {
		// TODO Auto-generated method stub
		
	}
}
