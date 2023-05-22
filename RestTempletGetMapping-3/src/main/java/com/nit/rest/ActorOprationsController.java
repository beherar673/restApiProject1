package com.nit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/actor")
public class ActorOprationsController {

	@GetMapping("/wish")
	public ResponseEntity<String> showWishMassage() {
		return new ResponseEntity<String>("Goodmorning",HttpStatus.OK);
	}
}
