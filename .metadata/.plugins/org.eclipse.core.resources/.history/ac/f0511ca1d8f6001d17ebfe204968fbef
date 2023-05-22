package com.nit.runner;

//import java.net.http.HttpHeaders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.nit.model.Actor;

@Component
public class ActorServiceConsumingRunner implements CommandLineRunner {

	
	@Autowired
	private RestTemplate template;
	
	@Override
	public void run(String... args) throws Exception {
		//Create RestTemplate class object
				RestTemplate template=new RestTemplate();
				//Define service url
				//http://localhost:4566/actor/register
				String serviceUrl="http://localhost:4569/actor/register";
				
				//String actor_json_body="{\"actorId\":5001,\"actorName\":\"raja\",\"actorAdress\":\"hyd\",\"remuneration\":8000}";
				
//				String actor_json_body="{\r\n"
//						+ "    \"actorId\": 1,\r\n"
//						+ "	 \"actorName\":\"rajesh\",\r\n"
//						+ "	 \"actorAddre\":\"bhc\",\r\n"
//						+ "	 \"remuneration\":108\r\n"
//						+ "}";
				//prepare http headers
				
				Actor actor=new Actor();
				actor.setActorId(1);
				actor.setActorName("rajesh");
				actor.setActorAddre("bhc");
				actor.setRemuneration(123);
				
				
				HttpHeaders heareds=new HttpHeaders();
				
				heareds.setContentType(MediaType.APPLICATION_JSON);
				
				//prepare request obj inthe form of httpEntity obj having bodyv and headers
				HttpEntity<Actor> request=new HttpEntity<Actor>(actor);
				
				//invoke operation/service of provider app using POST mode
				ResponseEntity<String> response=template.postForEntity(serviceUrl, request, String.class);
				
				//display the recived details from response
				System.out.println("responseBody(output)::"+response.getBody());
				System.out.println("response headers::"+response.getHeaders());
				System.out.println("response status code value::"+response.getStatusCodeValue());
				System.out.println("response status code::"+response.getStatusCode());
				
				System.exit(0);
				
				
				
				
				
				
				
				//display the recived details from the response
				System.out.println("Response body(output)::"+response.getBody());
			    //System.out.println("Response status code value::"+response.getStatusCodeValue());
			    System.out.println("Response status code::"+response.getStatusCode().toString());
			    System.out.println("Response status code::"+response.getStatusCode().value());
			    System.out.println("Response status code::"+response.getHeaders().toString());
			}

}
