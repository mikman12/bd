package com.qaprosoft.mybatis;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import com.qaprosoft.models.Warehouse;

public class WarehouseImpl {
	public static Logger log = Logger.getLogger(WarehouseImpl.class.getName());

	public void selectInfo() throws IOException {
		SqlSession session = null;
		try {
			Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			session = sqlSessionFactory.openSession();

		
			List<Warehouse> warehouse = session.selectList("Warehouse.getAll, 2");
			
			for (int i = 0; i < warehouse.size(); i++)
				log.info(warehouse.get(i).getAddress() + warehouse.get(i).getSize());
			session.commit();
		} finally {
			session.close();
		}
	}
}