package com.qaprosoft.mybatis;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import com.qaprosoft.models.NativeProducer;

public class NativeProducerImpl {
	public static Logger log = Logger.getLogger(NativeProducerImpl.class.getName());

	public void selectInfo() throws IOException {
		SqlSession session = null;
		try {
			Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			session = sqlSessionFactory.openSession();

		
			List<NativeProducer> nativeproducer = session.selectList("NativeProducer.getAll, 2");
			
			for (int i = 0; i < nativeproducer.size(); i++)
				log.info(nativeproducer.get(i).getCity() + nativeproducer.get(i).getName() + nativeproducer.get(i).getRating());
			session.commit();
		} finally {
			session.close();
		}
	}
}
