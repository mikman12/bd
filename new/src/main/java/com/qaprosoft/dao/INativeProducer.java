package com.qaprosoft.dao;

import com.qaprosoft.models.NativeProducer;

public interface INativeProducer {
	public NativeProducer getById (long id);
	public void update (NativeProducer nativeproducer);
	public void delete (long id);
	public void save (NativeProducer nativeproducer);

}
