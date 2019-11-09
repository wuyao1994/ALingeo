package com.alingeo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan
public class WebConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/news/**").addResourceLocations("file:c:/alingeo/image/news/");
        registry.addResourceHandler("/teacher/**").addResourceLocations("file:c:/alingeo/image/teacher/");
        registry.addResourceHandler("/center/**").addResourceLocations("file:c:/alingeo/image/center/");
        registry.addResourceHandler("/pansd/**").addResourceLocations("file:pansd/image/");
        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/News/**").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/News/Details/**").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/admin/**").addResourceLocations("classpath:/static/");
    }
}