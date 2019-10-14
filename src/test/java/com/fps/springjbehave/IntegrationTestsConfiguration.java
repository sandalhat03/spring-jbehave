package com.fps.springjbehave;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@Configuration
@ComponentScan(basePackages = { "com.fps.springjbehave.service", "com.fps.springjbehave.dao" })
public class IntegrationTestsConfiguration {

	
	@Bean
	public DataSource dataSource() {
		
		return new EmbeddedDatabaseBuilder()
			.setType(EmbeddedDatabaseType.H2)
	        .addScript("classpath:schema.sql").build();
	}
	

	@Bean
	public DataSourceTransactionManager transactionManager(DataSource dataSource) {
		DataSourceTransactionManager transactionManager = new DataSourceTransactionManager(dataSource);
		return transactionManager;
	}

}
