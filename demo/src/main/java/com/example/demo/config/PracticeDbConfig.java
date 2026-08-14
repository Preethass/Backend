//package com.example.demo.config;
//
//import jakarta.persistence.EntityManagerFactory;
//
//import org.springframework.boot.jpa.EntityManagerFactoryBuilder;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.JpaTransactionManager;
//
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.transaction.PlatformTransactionManager;
//
//import javax.sql.DataSource;
//
//@Configuration
//@EnableJpaRepositories(
//        basePackages = "com.example.demo.repository.Practice",
//        entityManagerFactoryRef = "practiceEntityManager",
//        transactionManagerRef = "practiceTransactionManager"
//)
//public class PracticeDbConfig {
//
//    @Primary
//    @Bean
//    @ConfigurationProperties(prefix = "spring.datasource.practice")
//    public DataSource practiceDataSource() {
//        return DataSourceBuilder.create().build();
//    }
//
//    @Primary
//    @Bean
//    public LocalContainerEntityManagerFactoryBean practiceEntityManager(
//            EntityManagerFactoryBuilder builder) {
//        return builder
//                .dataSource(practiceDataSource())
//                .packages("com.example.demo.model")
//                .persistenceUnit("Emp")
//                .build();
//    }
//
//    @Primary
//    @Bean
//    public PlatformTransactionManager practiceTransactionManager(
//            @Qualifier("practiceEntityManager")
//            EntityManagerFactory emf) {
//        return new JpaTransactionManager(emf);
//    }
//}