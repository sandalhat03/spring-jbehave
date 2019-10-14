package com.fps.springjbehave;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ContextConfiguration(classes = IntegrationTestsConfiguration.class)
@Import(SpringJbehaveConfig.class)
@PropertySource("classpath:application-integration.properties")
@EnableTransactionManagement
@Sql(scripts = "classpath:schema.sql", executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
@ActiveProfiles("integration")
@DirtiesContext
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface IntegrationTest {

}
