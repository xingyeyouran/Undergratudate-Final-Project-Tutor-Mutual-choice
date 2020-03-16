package com.example.anonomous;

import com.example.anonomous.Repository.RepositoryImpl.BaseRepositoryImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(repositoryBaseClass = BaseRepositoryImpl.class)
@SpringBootApplication
public class AnonomousApplication {

    public static void main(String[] args) {
        SpringApplication.run(AnonomousApplication.class, args);
    }

}
