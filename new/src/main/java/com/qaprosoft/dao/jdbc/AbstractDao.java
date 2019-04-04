package com.qaprosoft.dao.jdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.log4j.Logger;
public class AbstractDao {
	private static final Logger LOG = Logger.getLogger(AbstractDao.class);
	
	public void closePreparedStatement(PreparedStatement st) {
		try {
			if(st != null) {
				st.close();
			}
		} catch(SQLException e) {
			LOG.error("SQLException: ", e);
		}
	}
}
