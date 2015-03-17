package com.todc.openwack.web.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.support.OpenEntityManagerInViewFilter;

import javax.servlet.Filter;


/**
 * @author Tim O'Donnell (tim.odonnell@imperva.com)
 */
@Configuration
public class WebConfig {

    @Bean
    public Filter openEntityManagerInViewFilter() {
        return new OpenEntityManagerInViewFilter();
    }
    
}
