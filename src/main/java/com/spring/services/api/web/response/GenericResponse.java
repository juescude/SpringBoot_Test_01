package com.spring.services.api.web.response;


import java.sql.Timestamp;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GenericResponse {

	private String message;
	private Timestamp sysDate;

}
