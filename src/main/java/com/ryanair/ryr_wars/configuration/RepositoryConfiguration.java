package com.ryanair.ryr_wars.configuration;


import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.ryanair.ryr_wars.domain"})
@EnableJpaRepositories(basePackages = {"com.ryanair.ryr_wars.repositories"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}
