package com.qaprosoft.dao;

import com.qaprosoft.models.Pogruzchik;

public interface IPogruzchik {
	public Pogruzchik  getById (long id);
	public void update (Pogruzchik pogruzchik);
	public void delete (long id);
	public void save (Pogruzchik pogruzchik);
}
