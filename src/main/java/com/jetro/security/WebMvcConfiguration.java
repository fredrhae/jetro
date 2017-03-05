package com.jetro.security;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebMvc
@ComponentScan("com.jetro.security")
public class WebMvcConfiguration extends WebMvcConfigurerAdapter {

	@Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/ListaRelatoriosCelulas").setViewName("lista");
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
    }
}
