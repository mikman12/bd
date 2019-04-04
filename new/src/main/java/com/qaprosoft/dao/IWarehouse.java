package com.qaprosoft.dao;

import com.qaprosoft.models.Warehouse;

public interface IWarehouse {
	public Warehouse getById (long id);
	public void update (Warehouse warehouse);
	public void delete (long id);
	public void save (Warehouse warehouse);

}
