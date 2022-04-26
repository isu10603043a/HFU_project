package com.tainan.component;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;

//配置Spring Bean 要使用的組態類別
@Configuration 
public class DbComponentConfig {

	@Bean("datasource") // 只有一個工廠 否則會降低效能 執行一次就燒掉工廠再建一個
	@Scope("application") //生命週期
	public DataSource createSQLDataSource() {
		
		SQLServerDataSource dataSource = new SQLServerDataSource();
		dataSource.setURL("jdbc:sqlserver://localhost:1433;databaseName=HFU_project");
		dataSource.setUser("sa");
		dataSource.setPassword("1234");
		
		return dataSource;
	}
}
