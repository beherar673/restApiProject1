package com.nit.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ActorServiceConsumerAppRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		//create Rest Template class obj
		
		RestTemplate template=new RestTemplate();
		//prepare baseurl
		
		String baseUrl="http://localhost:3424/actor/wish";
		
		//invoked the service /operation of provide App
		ResponseEntity<String> response=template.getForEntity(baseUrl, String.class);
		
		System.out.println("responseBody::"+response.getBody());
		System.out.println("responseStatuscode::"+response.getStatusCode());
		//System.out.println("response headers::"+response.);
		
	}

}
