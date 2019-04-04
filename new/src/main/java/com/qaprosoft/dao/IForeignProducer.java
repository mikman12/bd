package com.qaprosoft.dao;

import com.qaprosoft.models.ForeignProducer;

public interface IForeignProducer {
	public ForeignProducer getById (long id);
	public void update (ForeignProducer foreignproducer);
	public void delete (long id);
	public void save (ForeignProducer foreignproducer);

}
