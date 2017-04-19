package edu.infsci2560;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/edit").setViewName("edit");
        registry.addViewController("/reservationEdit").setViewName("reservationEdit");
        registry.addViewController("/rooms").setViewName("rooms");
        registry.addViewController("/breakfast").setViewName("breakfast");
        registry.addViewController("/reservation").setViewName("reservation");
        registry.addViewController("/activity").setViewName("activity");
        registry.addViewController("/login").setViewName("login");
    }
}