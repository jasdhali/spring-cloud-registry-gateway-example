package com.javaguy.serviceone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;

@RestController
@RequestMapping("/first")
public class GreetingController {
	@Autowired
	@Lazy
	private EurekaClient eurekaClient;
	@Value("${spring.application.name:'spring-cloud-eureka-client-one'}")
	private String appName;

	@GetMapping("/greeting")
	public String greeting() {
		return String.format("Hello from '%s'!", eurekaClient.getApplication(appName).getName());
	}

	@GetMapping("/get-greeting-no-feign")
	public String greeting(Model model) {

		InstanceInfo service = eurekaClient.getApplication("spring-cloud-eureka-client-one").getInstances().get(0);

		String hostName = service.getHostName();
		int port = service.getPort();

		// ...
		StringBuilder builder = new StringBuilder();
		builder.append("host: " + hostName);
		builder.append("port: " + port);
		return builder.toString();
	}
}
