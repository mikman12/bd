package com.qaprosoft.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.qaprosoft.dao.ConnectionPool;
import com.qaprosoft.dao.IWarehouse;
import com.qaprosoft.models.Warehouse;

public class WarehouseImpl extends AbstractDao implements IWarehouse{
	private Connection cn;
	private static final String SQL_GET_BY_ID = "SELECT * FROM sto  WHERE sto.id = ?";
	private static final Logger LOG = Logger.getLogger(ConnectionPool.class);
	
	public WarehouseImpl (Connection cn) {
		this.cn = cn;
	}

	public Warehouse getById(long id) {
		Warehouse warehouse = new Warehouse();
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = cn.prepareStatement(SQL_GET_BY_ID);
			st.setLong(1, id);
			rs = st.executeQuery();
			if (rs.next()) {
				warehouse.setAddress(rs.getString("address"));
				warehouse.setSize(rs.getString("siza"));
							
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
		return warehouse;
	}

	public void update(Warehouse warehouse) {
		// TODO Auto-generated method stub
		
	}

	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

	public void save(Warehouse warehouse) {
		// TODO Auto-generated method stub
		
	}
}
