package com.qaprosoft.dao;

import com.qaprosoft.models.RepairCompany;

public interface IRepairCompany {
	public RepairCompany getById (long id);
	public void update (RepairCompany repaircompany);
	public void delete (long id);
	public void save (RepairCompany repaircompany);
}
