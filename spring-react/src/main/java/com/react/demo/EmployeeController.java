package com.react.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.react.demo.model.Employee;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class EmployeeController {
	
	@GetMapping("/{id}")
	private Mono<Employee> getEmployee(@PathVariable int id){
		return null;
		
	}
	
	@GetMapping("/employee")
		private Flux<Employee> getAllEmployee(){
			return null;
		
	}

}
