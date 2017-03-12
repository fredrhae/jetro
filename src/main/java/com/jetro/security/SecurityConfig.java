package com.jetro.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private DataSource dataSource;
	
	private String selectUserQuery = "SELECT IdUsuario, Senha, IndAtivo FROM usuario WHERE ( IdUsuario = ? AND IndAtivo=1)";
	private String selectRoleQuery = "SELECT IdUsuario, 'USER', IndAtivo FROM usuario WHERE ( IdUsuario = ? AND IndAtivo=1)";

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().dataSource(dataSource)
			.usersByUsernameQuery(selectUserQuery)
			.authoritiesByUsernameQuery(selectRoleQuery);
	
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.csrf().disable()
			.authorizeRequests()
				.antMatchers(new String[] {"/global/**", "/assets/**","/images/**", "/login"}).permitAll()
				.anyRequest().authenticated()
			.and()
			.formLogin()
				.loginPage("/login")
				.and()
            .logout()
            	.permitAll()
            .and()
            .httpBasic();

		
	}
}
