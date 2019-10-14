package com.fps.springjbehave;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import com.fps.springjbehave.dao.StoreMapper;

@Configuration
public class SpringJbehaveConfig {

	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
	  SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
	  factoryBean.setDataSource(dataSource);
	  factoryBean.setMapperLocations(new ClassPathResource("mapper/store-mapper.xml"));
	  factoryBean.setTypeAliasesPackage("com.fps.springjbehave.model");
	  return factoryBean.getObject();
	}
	
	@Bean
	public SqlSessionTemplate getSqlSessionTemplate(SqlSessionFactory sqlSessionFactory) {
		return new SqlSessionTemplate(sqlSessionFactory);
	}
	
	@Bean
	public StoreMapper userMapper(SqlSessionTemplate sqlSessionTemplate) throws Exception {
	  return sqlSessionTemplate.getMapper(StoreMapper.class);
	}
	
}
