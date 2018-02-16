package com.spring.services.api.web.controller;

import java.sql.Timestamp;
import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.spring.services.api.web.response.GenericResponse;

@Controller
@RequestMapping("/utils")
public class UtilitiesController implements IUtilitiesComtroller {

	@RequestMapping(value = "/app/healthCheck", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	@Override
	public GenericResponse healthCheck() {

		return GenericResponse.builder()
				.message("Service is active !")
				.sysDate(new Timestamp(Instant.now().toEpochMilli()))
				.build();
	}
	
	@RequestMapping(value = "/b2b/healthCheck", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	@Override
	public GenericResponse healthCheckB2B() {

		return GenericResponse.builder()
				.message("B2B Service is active !")
				.sysDate(new Timestamp(Instant.now().toEpochMilli()))
				.build();
	}	

}
