package com.qaprosoft.dao;

import com.qaprosoft.models.Driver;

public interface IDriver {
	public Driver getById (long id);
	public void update (Driver driver);
	public void delete (long id);
	public void save (Driver driver);
}
