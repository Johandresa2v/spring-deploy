package com.op.spring_deploy;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringDeployApplicationTests {

	@Test
	void contextLoads() {
		System.getenv().forEach(
				(Key, Value)-> System.out.println(Key + " " + Value)
		);
	}

}
