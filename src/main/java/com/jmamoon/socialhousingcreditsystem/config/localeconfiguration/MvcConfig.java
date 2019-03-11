/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmamoon.socialhousingcreditsystem.config.localeconfiguration;

import java.util.Locale;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;

/**
 *
 * @author Jose Arandia Luna https://github.com/jma-moon
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Bean
    public LocaleResolver localeResolver() {
        AcceptHeaderLocaleResolver slr = new AcceptHeaderLocaleResolver();
        slr.setDefaultLocale(Locale.US);
        return slr;
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins("http://localhost:4200");
    }
}
