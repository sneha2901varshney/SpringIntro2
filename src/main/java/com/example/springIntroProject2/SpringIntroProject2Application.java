package com.example.springIntroProject2;

import com.example.springIntroProject2.EmployeeBean;
import com.example.springIntroProject2.DemoBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
class SpringConceptsApplication {
	private static final Logger logger = LoggerFactory.getLogger(SpringConceptsApplication.class);

	public static void main(String[] args) {
		logger.info("Starting Spring Boot Application...");
		ApplicationContext context = SpringApplication.run(SpringConceptsApplication.class, args);
		logger.debug("Checking Context:{}",context.getBean(DemoBean.class));

		logger.debug("\n*** Example using @Autowire annotation on property ***");
		EmployeeBean employeeBean=context.getBean(EmployeeBean.class);
		employeeBean.setEid(104);
		employeeBean.setEname("Spring Framework Guru");
		employeeBean.showEmployeeDetails();
	}
}