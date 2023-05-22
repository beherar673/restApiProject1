package com.nit.cfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class TemplateCfg {

	@Bean
	public RestTemplate creteRestTemplate() {
		return new RestTemplate();
	}
}
