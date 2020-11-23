package com.Jdbc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
@Component("DriverData")
public class DriverDataSource extends DriverManagerDataSource {
    @Value("com.mysql.cj.jdbc.Driver")
    private String driverClassName;
    @Value("jdbc:mysql://localhost:3306/xsbook?useUnicode=true&characterEncoding=utf8")
    private String url;
    @Value("root")
    private String username;
    @Value("root")
    private String password;


    @Bean(name = "dataSource")
    public DataSource createSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean(name = "jdbcTemplate")
    public JdbcTemplate createJdbcTemplate(DataSource dataSource){
        return new JdbcTemplate(dataSource);
    }
}
