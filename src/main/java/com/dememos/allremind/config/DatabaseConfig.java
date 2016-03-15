package com.dememos.allremind.config;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.commons.dbcp.managed.BasicManagedDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories("com.dememos.allremind.repositories")
@PropertySource("classpath:db.properties")
@ComponentScan("com.dememos.allremind.repositories")
public class DatabaseConfig {

    @Resource
    private Environment env;

    @Bean
    public DataSource dataSource(){
        BasicDataSource ds = new BasicDataSource();
        ds.setUrl(env.getRequiredProperty("db.url"));
        ds.setDriverClassName(env.getRequiredProperty("db.driver"));
        ds.setUsername(env.getRequiredProperty("db.username"));
        ds.setPassword(env.getRequiredProperty("db.password"));


        return ds;
    }


}
