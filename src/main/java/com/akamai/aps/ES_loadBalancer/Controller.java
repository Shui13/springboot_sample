package com.akamai.aps.ES_loadBalancer;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping("/health")
	@ResponseBody
	public String health() {
		return "{\"alive\":true}";
	}

}
