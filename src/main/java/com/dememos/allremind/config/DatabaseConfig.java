package com.dememos.allremind.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;

@Configuration
@EnableJpaRepositories("com.dememos.allremind.repositories")
@PropertySource("classpath:db.properties")
@ComponentScan("com.dememos.allremind.repositories")
public class DatabaseConfig {

    @Resource
    private Environment env;


}
