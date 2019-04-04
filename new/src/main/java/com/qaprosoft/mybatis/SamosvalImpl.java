package com.qaprosoft.mybatis;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import com.qaprosoft.models.Samosval;

public class SamosvalImpl {
	public static Logger log = Logger.getLogger(SamosvalImpl.class.getName());

	public void selectInfo() throws IOException {
		SqlSession session = null;
		try {
			Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			session = sqlSessionFactory.openSession();

		
			List<Samosval> samosval = session.selectList("Samosval.getAll, 2");
			
			for (int i = 0; i < samosval.size(); i++)
				log.info(samosval.get(i).getModel() + samosval.get(i).getWeight() + samosval.get(i).getAge());
			session.commit();
		} finally {
			session.close();
		}
	}
}