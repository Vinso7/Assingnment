package com.example.demo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SuppressWarnings("deprecation")
@EnableWebSecurity // this lets spring security to provide us authentication obj
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
	
         /*SecurityConfiguration class extends WebSecurityConfiguration to get hold on
          *some methods that this class provides to change the authentication */ 
	
	// configuring the data-source bean and adding embedded H2 database
	@Autowired
	DataSource dataSource;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		   auth.jdbcAuthentication()
		        .dataSource(dataSource);// now spring will auto configure the database 
	   
			/*
			 * .withDefaultSchema();// it provides default schema to the DB
			 *//*		        .withUser(
		        		
		        		User.withUsername("garg")
		        		.password("garg777")
		        		.roles("user")
		        		
		        )
		        .withUser(
		        		
		        		User.withUsername("shubham")
		        		.password("Shubham77")
		        		.roles("admin")
		        		
		        );*/
		   
		        
	        
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		       http.authorizeHttpRequests()
				
				  .antMatchers("/adminpage").hasRole("ADMIN")// entry for specific role
				  .antMatchers("/userpage").hasAnyRole("ADMIN","USER")// entry for any role
				  .antMatchers("/homepage").permitAll()//entry for everyone
		          .and().formLogin();
		        
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
}
