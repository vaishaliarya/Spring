package com.ncu.securitydemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;

@Configuration
@EnableWebSecurity
public class DemoSecurityConfigApp extends WebSecurityConfigurerAdapter{

	@Override
	protected void configure(AuthenticationManagerBuilder auth) 
			throws Exception {
		// add our users for in memory authentication
		System.out.println("in security method");
UserBuilder users = User.withDefaultPasswordEncoder();
		
auth.inMemoryAuthentication()
	.withUser(users.username("john").password("test123")
			.roles("EMPLOYEE"))
	.withUser(users.username("mary").password("test123")
			.roles("EMPLOYEE","MANAGER"))
	.withUser(users.username("susan").password("test123")
			.roles("EMPLOYEE","ADMIN"));
		
		}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.authorizeRequests()
		.antMatchers("/").hasRole("EMPLOYEE")
		//to access the further sub directories add ** in the path
		.antMatchers("/leaders/**").hasRole("MANAGER")
		.antMatchers("/systems/**").hasRole("ADMIN")
		.and()
		.formLogin()
		.loginPage("/showMyLoginPage")
		.loginProcessingUrl("/authenticateTheUser")
		.permitAll()
		.and()
		.logout()
		.permitAll()
		.and()
		.exceptionHandling()
		.accessDeniedPage("/accessdenie");	
		}

}
