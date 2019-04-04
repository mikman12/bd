package com.qaprosoft.dao;

import java.sql.Connection;
import org.apache.log4j.Logger;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class ConnectionPool {
	private static final Logger LOG = Logger.getLogger(ConnectionPool.class);
	@SuppressWarnings("unused")
	private static Connection connection = null;
	private static BasicDataSource dataSource = null;

	public static DataSource getDataSource() {
		try {
			Properties prop = new Properties();
			FileInputStream input = null;
			input = new FileInputStream("src\\main\\resources\\database.properties");
			prop.load(input);
			if (dataSource == null) {
				dataSource = new BasicDataSource();
				dataSource.setUsername(prop.getProperty("username"));
				dataSource.setPassword(prop.getProperty("password"));
				dataSource.setUrl(prop.getProperty("url"));
				dataSource.setDriverClassName(prop.getProperty("driver"));
				dataSource.setInitialSize(1);
				dataSource.setMaxActive(10);
				dataSource.setValidationQueryTimeout(6000);

			}


		} catch (IOException e) {
			LOG.error("IOException: ", e);
		}

		return dataSource;
	}
}
