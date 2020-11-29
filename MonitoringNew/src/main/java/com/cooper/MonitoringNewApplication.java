package com.cooper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.datatables.repository.DataTablesRepositoryFactoryBean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class MonitoringNewApplication {

	@Configuration
	@EnableJpaRepositories(repositoryFactoryBeanClass = DataTablesRepositoryFactoryBean.class)
	public class DataTablesConfiguration {}
	
	public static void main(String[] args) {
		SpringApplication.run(MonitoringNewApplication.class, args);
	}

}
