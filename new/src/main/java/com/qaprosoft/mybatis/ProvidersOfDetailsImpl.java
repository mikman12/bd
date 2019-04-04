package com.qaprosoft.mybatis;

import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import com.qaprosoft.dao.ConnectionPool;
import com.qaprosoft.dao.IProvidersOfDetails;
import com.qaprosoft.models.Pogruzchik;
import com.qaprosoft.models.ProvidersOfDetails;

public class ProvidersOfDetailsImpl {
	public static Logger log = Logger.getLogger(ProvidersOfDetailsImpl.class.getName());

	public void selectInfo() throws IOException {
		SqlSession session = null;
		try {
			Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			session = sqlSessionFactory.openSession();

		
			List<ProvidersOfDetails> providersofdetails = session.selectList("Pogruzchik.getAll, 2");
		
			for (int i = 0; i < providersofdetails.size(); i++)
				log.info(providersofdetails.get(i).getCity() + providersofdetails.get(i).getName());
			session.commit();
		} finally {
			session.close();
		}
	}
}