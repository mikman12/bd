package com.qaprosoft.dao;

import com.qaprosoft.models.Sto;

public interface ISto {
	public Sto getById (long id);
	public void update (Sto sto);
	public void delete (long id);
	public void save (Sto sto);
}
