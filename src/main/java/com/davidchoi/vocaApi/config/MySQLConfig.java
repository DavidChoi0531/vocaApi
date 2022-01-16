package com.davidchoi.vocaApi.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

@Configuration
public class MySQLConfig {
	
	@Bean
	public SqlSessionFactory factory(DataSource dataSource) throws Exception {
		final SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
		sessionFactoryBean.setDataSource(dataSource);
		
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		sessionFactoryBean.setMapperLocations(resolver.getResources("classpath:mybatis/mappers/*.xml"));
		
		Resource myBatisConfig = new PathMatchingResourcePatternResolver().getResource("classpath:mybatis/mybatis-config.xml");
		sessionFactoryBean.setConfigLocation(myBatisConfig);
		
		return sessionFactoryBean.getObject();
	}
}
