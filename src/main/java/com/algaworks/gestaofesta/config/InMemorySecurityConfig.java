package com.algaworks.gestaofesta.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

@Configuration
public class InMemorySecurityConfig {
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder builder) throws Exception {
		builder
			.inMemoryAuthentication()
			.withUser("normandes").password("{noop}user").roles("USER")
			.and()
			.withUser("lucas").password("{noop}user").roles("USER")
			.and()
			.withUser("teste").password("{noop}user").roles("USER");
	}

}
