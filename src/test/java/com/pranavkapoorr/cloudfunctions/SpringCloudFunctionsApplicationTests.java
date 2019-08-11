package com.pranavkapoorr.cloudfunctions;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringCloudFunctionsApplicationTests {
	@Autowired
	HelloWorldFunctions func;
	
	@Test
	public void testHelloWorld() {
		assertEquals("HelloWorldCloud function test!", "HelloWorld", func.helloWorld().get());
	}

}
