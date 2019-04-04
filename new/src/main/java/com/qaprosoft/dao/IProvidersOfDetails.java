package com.qaprosoft.dao;

import com.qaprosoft.models.ProvidersOfDetails;

public interface IProvidersOfDetails {
	public ProvidersOfDetails getById (long id);
	public void update (ProvidersOfDetails providersofdetails);
	public void delete (long id);
	public void save (ProvidersOfDetails providersofdetails);
}
