package com.qaprosoft.mybatis;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import com.qaprosoft.models.ForeignProducer;

public class ForeignProducerImpl {
	public static Logger log = Logger.getLogger(ForeignProducer.class.getName());

	public void selectInfo() throws IOException {
		SqlSession session = null;
		try {
		//	Reader reader = Resources.getResourceAsStream("SqlMapConfig.xml");
	//		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
	//		session = sqlSessionFactory.openSession();
			
		String resource = "SqlMapConfig.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory =
			  new SqlSessionFactoryBuilder().build(inputStream);

		
			List<ForeignProducer> foreignproducer = session.selectList("ForeignProducer.getAll, 2");
			for (int i = 0; i < foreignproducer.size(); i++)
				log.info(foreignproducer.get(i).getCity() + foreignproducer.get(i).getName() + foreignproducer.get(i).getRating());
			session.commit();
		} finally {
			session.close();
		}
	}



}
