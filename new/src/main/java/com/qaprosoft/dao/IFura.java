package com.qaprosoft.dao;

import com.qaprosoft.models.Fura;

public interface IFura {
	public Fura getById (long id);
	public void update (Fura fura);
	public void delete (long id);
	public void save (Fura fura);

}
