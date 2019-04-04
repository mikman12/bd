package com.qaprosoft.mybatis;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import com.qaprosoft.models.Sto;

public class StoImpl {
	public static Logger log = Logger.getLogger(StoImpl.class.getName());

	public void selectInfo() throws IOException {
		SqlSession session = null;
		try {
			Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			session = sqlSessionFactory.openSession();

		
			List<Sto> sto = session.selectList("Sto.getAll, 2");
			
			for (int i = 0; i < sto.size(); i++)
				log.info(sto.get(i).getName() + sto.get(i).getAge() + sto.get(i).getExperience());
			session.commit();
		} finally {
			session.close();
		}
	}
}