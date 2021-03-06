package com.qaprosoft.mybatis;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import com.qaprosoft.models.Garage;

public class GarageImpl {
	public static Logger log = Logger.getLogger(GarageImpl.class.getName());

	public void selectInfo() throws IOException {
		SqlSession session = null;
		try {
			Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			session = sqlSessionFactory.openSession();

		
			List<Garage> garage = session.selectList("Garage.getAll, 2");
		
			for (int i = 0; i < garage.size(); i++)
				log.info(garage.get(i).getSize() + garage.get(i).getAddress());
			session.commit();
		} finally {
			session.close();
		}
	}
}