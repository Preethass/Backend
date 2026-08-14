//package com.example.demo.config;
//
//import jakarta.persistence.EntityManagerFactory;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.boot.jpa.EntityManagerFactoryBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.transaction.PlatformTransactionManager;
//
//import javax.sql.DataSource;
//
//@Configuration
//@EnableJpaRepositories(
//        basePackages = "com.example.demo.repository.Demo",
//        entityManagerFactoryRef = "demoEntityManager",
//        transactionManagerRef = "demoTransactionManager"
//)
//public class DemoDbConfig {
//
//    @Bean
//    @ConfigurationProperties(prefix = "spring.datasource.demo")
//    public DataSource demoDataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//    @Bean
//    public LocalContainerEntityManagerFactoryBean demoEntityManager(
//            EntityManagerFactoryBuilder builder) {
//        return builder
//                .dataSource(demoDataSource())
//                .packages("com.example.demo.model")
//                .persistenceUnit("Employee")
//                .build();
//    }
//
//    @Bean
//    public PlatformTransactionManager demoTransactionManager(
//            @Qualifier("demoEntityManager")
//            EntityManagerFactory emf) {
//        return new JpaTransactionManager(emf);
//    }
//}