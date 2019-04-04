package com.qaprosoft.mybatis;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import com.qaprosoft.models.RepairCompany;

public class RepairCompanyImpl {
	public static Logger log = Logger.getLogger(RepairCompanyImpl.class.getName());

	public void selectInfo() throws IOException {
		SqlSession session = null;
		try {
			Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			session = sqlSessionFactory.openSession();

		
			List<RepairCompany> repaircompany = session.selectList("Pogruzchik.getAll, 2");
			
			for (int i = 0; i < repaircompany.size(); i++)
				log.info(repaircompany.get(i).getAge() + repaircompany.get(i).getCity() + repaircompany.get(i).getRating() + repaircompany.get(i).getName());
			session.commit();
		} finally {
			session.close();
		}
	}
}