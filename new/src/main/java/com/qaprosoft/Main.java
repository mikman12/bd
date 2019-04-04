package com.qaprosoft;

import java.io.IOException;

import com.qaprosoft.dao.services.Service;
import com.qaprosoft.mybatis.ForeignProducerImpl;

public class Main {
	
	public static void main(String[] args) {
		Service service = new Service();
		service.fillDataBase();
		
	}

}
