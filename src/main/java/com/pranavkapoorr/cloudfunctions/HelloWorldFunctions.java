package com.pranavkapoorr.cloudfunctions;

import java.util.function.Supplier;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class HelloWorldFunctions {

	@Bean
	public Supplier<String> helloWorld(){
		return () -> "HelloWorld";
	}
}
