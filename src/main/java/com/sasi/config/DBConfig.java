package com.sasi.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DBConfig {

    @Value("${spring.datasource.url}")
    private  String url;

    @Value("${spring.datasource.username}")
    private  String userName;

    @Value("${spring.datasource.password}")
    private  String password;

    @Value("${spring.datasource.driver-class-name}")
    private  String driverClass;


    public DataSource buildDataSource(){
        BasicDataSource ds = new BasicDataSource();
        ds.setUrl(url);
        ds.setUsername(userName);
        ds.setPassword(password);
        ds.setDriverClassName(driverClass);
        return ds;
    }

}
