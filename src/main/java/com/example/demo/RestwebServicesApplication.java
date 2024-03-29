package com.example.demo;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.WebProperties.LocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
@EnableAspectJAutoProxy
public class RestwebServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestwebServicesApplication.class, args);
	}

	/*
	 * @Bean public LocaleResolver localeResolver() { SessionLocaleResolver
	 * localeResolver = new SessionLocaleResolver();
	 * localeResolver.setDefaultLocale(Locale.US); return localeResolver();
	 * 
	 * }
	 * 
	 * @Bean public ResourceBundleMessageSource bundleMessageSource() {
	 * ResourceBundleMessageSource messageSource = new
	 * ResourceBundleMessageSource(); messageSource.setBasename("messages"); return
	 * messageSource;
	 * 
	 * }
	 */
	 

}
