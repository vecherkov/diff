package com.github.vecherkov.webdiff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.jdbc.JdbcDaoImpl;

import javax.sql.DataSource;

@SpringBootApplication
public class WebDiffApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebDiffApplication.class, args);
    }

    @Bean
    public UserDetailsService userDetailsService(DataSource dataSource) {
        JdbcDaoImpl userDetailsManager = new JdbcDaoImpl();
        userDetailsManager.setDataSource(dataSource);
        return userDetailsManager;
    }

}
