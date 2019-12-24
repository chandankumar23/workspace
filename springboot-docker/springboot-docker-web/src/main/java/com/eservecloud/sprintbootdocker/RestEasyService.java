package com.eservecloud.sprintbootdocker;

import com.eservecloud.sprintbootdocker.resource.RestResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/v1")
public class RestEasyService {

	private RestResponse restResponse;

	Logger logger= LoggerFactory.getLogger(RestEasyService.class);

	@RequestMapping("/hello")
	public RestResponse hello() {

		restResponse = new RestResponse();
		//setting data
		restResponse.setName("Shekhar");
		logger.debug("Print debug logger from GRPC service");
		logger.info("Print info logger from GRPC service");
		return restResponse;
	}
	
}
