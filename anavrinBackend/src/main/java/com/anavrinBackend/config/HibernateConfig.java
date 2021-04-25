package com.anavrinBackend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan({"com.anavrinBackend.dto"})
@EnableTransactionManagement
public class HibernateConfig {
	
	private final static String Database_url="jdbc:h2:tcp://localhost/~/anavrin";
	private final static String Database_driver="org.h2.Driver";
	private final static String Database_dialect="org.hibernate.dialect.H2Dialect";
	private final static String Database_username="sa";
	private final static String Database_password="";
	
	@Bean
	public DataSource getDataSource()
	{
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName(Database_driver);
		dataSource.setUrl(Database_url);
		dataSource.setUsername(Database_username);
		dataSource.setPassword(Database_password);
		return dataSource;
	}
	
	@Bean
	public SessionFactory getSessionFactory(DataSource dataSource)
	{
		LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(dataSource);
		builder.addProperties(getHibernateProperties());
		builder.scanPackages("com.anavrinBackend.dto");
		return builder.buildSessionFactory();
	}

	private Properties getHibernateProperties() {
		
		Properties properties = new Properties();
		properties.put("hibernate.dialect",Database_dialect);
		properties.put("hibernate.show_sql", true);
		properties.put("hibernate.format_sql", true);
		return properties;
	}
	
	@Bean
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
	{
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		return transactionManager;
	}
	
	
	

}
