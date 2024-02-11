package org.example.config;

import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Neo4jConfig {

    @Bean
    public Driver neo4jDriver() {
        String uri = "neo4j://localhost:7687";
        String username = "neo4j";
        String password = "letmein!";
        return GraphDatabase.driver(uri, AuthTokens.basic(username, password));
    }
}
