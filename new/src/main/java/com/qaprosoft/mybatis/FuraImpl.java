package com.qaprosoft.mybatis;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import com.qaprosoft.models.Fura;

public class FuraImpl {
	public static Logger log = Logger.getLogger(FuraImpl.class.getName());
	
	public void selectInfo() throws IOException {
		SqlSession session = null;
		try {
			Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			session = sqlSessionFactory.openSession();


			List<Fura> fura = session.selectList("Fura.getAll, 2");
			
			for (int i = 0; i < fura.size(); i++)
				log.info(fura.get(i).getWeight() + fura.get(i).getAge());
			session.commit();
		} finally {
			session.close();
		}
	}
}
