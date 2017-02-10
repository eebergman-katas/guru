package com.pillartechnology.guru.configuration;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created by erinbergman on 2/8/17.
 */

@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.pillartechnology.guru.domain"})
@EnableJpaRepositories(basePackages = {"com.pillartechnology.guru.repositories"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}
