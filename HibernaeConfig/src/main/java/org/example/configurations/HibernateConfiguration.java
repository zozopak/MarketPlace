package org.example.configurations;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.sql.DriverManager;

@Configuration
@ComponentScan(basePackages = "org.example")
@EnableTransactionManagement
@PropertySource("classpath:hibernate.properties")
public class HibernateConfiguration {
     @Autowired
    private Environment environment;
     @Value("${jdbc.url}")
     private String url;

    @Bean
    public DataSource getDatasource(){
        DriverManagerDataSource ds =new DriverManagerDataSource();
        ds.setDriverClassName(environment.getRequiredProperty("jdbc.driverClassName"));
        ds.setUrl(url);
        ds.setUsername(environment.getRequiredProperty("jdbc.username"));
        return ds;
        HikariConfig hikariConfig=new HikariConfig();
        HikariDataSource hikariDataSource;
        hikariConfig.setDriverClassName(environment.getRequiredProperty("jdbc.driverClassName"));
        hikariConfig.setJdbcUrl(environment.getRequiredProperty("jdbc.url"));
        hikariConfig.setUsername(environment.getRequiredProperty("jdbc.username"));
        hikariConfig.setPassword(environment.getRequiredProperty("jdbc.password"));



    }
}
