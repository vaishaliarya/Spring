package com.ncu.securitydemo.config;

import java.beans.PropertyVetoException;
import java.util.logging.Logger;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.ncu.securitydemo")
@PropertySource("classpath:persistence-mysql.properties")
public class DemoAppConfig {

	// set up variable to hold the properties
	
	@Autowired
	private Environment env;
	
	// set up a logger for diagnostics
	
	private Logger logger = Logger.getLogger(getClass().getName());
	
	
	// define a bean for ViewResolver

	@Bean
	public ViewResolver viewResolver() {
		
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		
		return viewResolver;
	}
	
	// define a bean for our security datasource
	
	@Bean

	public DataSource dataSource() {

	ComboPooledDataSource dataSource = new ComboPooledDataSource();

	try {

	dataSource.setDriverClass(env.getProperty("jdbc.driver"));

	} catch (PropertyVetoException e) {

	// TODO Auto-generated catch block

	e.printStackTrace();

	};

	dataSource.setJdbcUrl(env.getProperty("jdbc.url"));

	dataSource.setUser(env.getProperty("jdbc.userName"));

	dataSource.setPassword(env.getProperty("jdbc.password"));



	dataSource.setInitialPoolSize(getIntProperty("connection.pool.initialPoolSize"));
	 
	dataSource.setMinPoolSize(getIntProperty("connection.pool.minPoolSize"));
	 
	dataSource.setMaxPoolSize(getIntProperty("connection.pool.maxPoolSize"));
	 
	dataSource.setMaxIdleTime(getIntProperty("connection.pool.maxIdleTime"));


	return dataSource;

	}


	// need a helper method 
	// read environment property and convert to int
	
	private int getIntProperty(String propName) {
		
		String propVal = env.getProperty(propName);
		
		// now convert to int
		int intPropVal = Integer.parseInt(propVal);
		
		return intPropVal;
	}
}





