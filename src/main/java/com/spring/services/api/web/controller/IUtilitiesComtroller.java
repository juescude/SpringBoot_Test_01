package com.spring.services.api.web.controller;

import com.spring.services.api.web.response.GenericResponse;

public interface IUtilitiesComtroller extends IGenericController{

	public GenericResponse healthCheck();
	
	public GenericResponse healthCheckB2B();
}
