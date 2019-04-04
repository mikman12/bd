package com.qaprosoft.dao;

import com.qaprosoft.models.Garage;

public interface IGarage {
	public Garage getById (long id);
	public void update (Garage garage);
	public void delete (long id);
	public void save (Garage garage);
}
