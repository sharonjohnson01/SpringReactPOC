package com.demo.client;

import org.springframework.web.reactive.function.client.WebClient;

public class EmployeeWebClient {
	
	WebClient webClient = WebClient.create("http://localhost:8080");

}
