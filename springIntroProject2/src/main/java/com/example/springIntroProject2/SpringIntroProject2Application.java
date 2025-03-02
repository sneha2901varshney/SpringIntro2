package com.example.springIntroProject2;

import com.example.springIntroProject2.DemoBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIntroProject2Application {
	public static final Logger logger = LoggerFactory.getLogger(SpringIntroProject2Application.class);
	public static void main(String[] args) {
		logger.debug ("Welcome to Spring Concept Demo");
		logger.info("Starting Spring Boot Application...");
		ApplicationContext context = SpringApplication. run (SpringIntroProject2Application.class, args);
		com.example.springIntroProject2.DemoBean demoBean = context.getBean(DemoBean.class);
		demoBean.sayHello();
		logger.info("Application Started Successfully!");
		logger.debug ("Checking Context: {}", context.getBean (DemoBean.class) );
		logger.debug("\n*** Example Using @Autowire annotation on property ***");
	}
}
