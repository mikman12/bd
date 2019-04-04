package com.qaprosoft.dao.services;


import org.apache.log4j.Logger;
import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;

import com.qaprosoft.dao.ConnectionPool;
import com.qaprosoft.dao.jdbc.ForeignProducerImpl;
import com.qaprosoft.dao.jdbc.FuraImpl;
import com.qaprosoft.dao.jdbc.GarageImpl;
import com.qaprosoft.dao.jdbc.NativeProducerImpl;
import com.qaprosoft.dao.jdbc.PogruzchikImpl;
import com.qaprosoft.dao.jdbc.ProvidersOfDetailsImpl;
import com.qaprosoft.dao.jdbc.RepairCompanyImpl;
import com.qaprosoft.dao.jdbc.SamosvalImpl;
import com.qaprosoft.dao.jdbc.StoImpl;
import com.qaprosoft.dao.jdbc.WarehouseImpl;
import com.qaprosoft.models.ForeignProducer;
import com.qaprosoft.models.Fura;
import com.qaprosoft.models.Garage;
import com.qaprosoft.models.NativeProducer;
import com.qaprosoft.models.Pogruzchik;
import com.qaprosoft.models.ProvidersOfDetails;
import com.qaprosoft.models.RepairCompany;
import com.qaprosoft.models.Samosval;
import com.qaprosoft.models.Sto;
import com.qaprosoft.models.Warehouse;

public class Service {
	private static final Logger LOG = Logger.getLogger(Service.class);
	DataSource dataSource = ConnectionPool.getDataSource();
	Connection connection = null;

	public void fillDataBase() {
		try {
			connection = dataSource.getConnection();
			ForeignProducerImpl t = new ForeignProducerImpl(connection);
			FuraImpl i = new FuraImpl(connection);
			GarageImpl u = new GarageImpl(connection);
			NativeProducerImpl p = new NativeProducerImpl(connection);
			PogruzchikImpl r = new PogruzchikImpl(connection);
			ProvidersOfDetailsImpl s = new ProvidersOfDetailsImpl(connection);
			RepairCompanyImpl x = new RepairCompanyImpl(connection);
			SamosvalImpl y = new SamosvalImpl(connection);
			StoImpl z = new StoImpl(connection);
			WarehouseImpl g = new WarehouseImpl(connection);
			
			
		
			ForeignProducer foreignProducer = t.getById(1);
			LOG.info(foreignProducer.toString());
			Fura fura = i.getById(1);
			LOG.info(fura.toString());
			Garage garage = u.getById(1);
			LOG.info(garage.toString());
			NativeProducer nativeproducer = p.getById(1);
			LOG.info(nativeproducer.toString());
			Pogruzchik pogruzchik = r.getById(1);
			LOG.info(pogruzchik.toString());
			ProvidersOfDetails providersofdetails = s.getById(1);
			LOG.info(providersofdetails.toString());
			RepairCompany repaircompany = x.getById(1);
			LOG.info(repaircompany.toString());
			Samosval samosval = y.getById(1);
			LOG.info(samosval.toString());
			Sto sto = z.getById(1);
			LOG.info(sto.toString());
			Warehouse warehouse = g.getById(1);
			LOG.info(warehouse.toString());
		} catch (SQLException e) {
			LOG.error("Can't connect to database", e);
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				LOG.error("Can't create connection to database", e);
			}
		}
	}
}
