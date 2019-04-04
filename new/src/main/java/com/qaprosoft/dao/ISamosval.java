package com.qaprosoft.dao;

import com.qaprosoft.models.Samosval;

public interface ISamosval {
	public Samosval getById (long id);
	public void update (Samosval samosval);
	public void delete (long id);
	public void save (Samosval samosval);
}
