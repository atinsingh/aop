package co.pragra.learning.aopdemo.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("docs")
public class ApiDocs {
    @Bean
    String doc(){
        System.out.println("GENERATING DOCS");
        return "API DOCS";
    }
}
