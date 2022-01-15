package co.pragra.learning.aopdemo.conf;

import co.pragra.learning.aopdemo.model.Game;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class ProdConfig {

    @Bean
    Game game(){
        return new Game(  ()->"Pragra", ()->"Brain Station" );
    }
}
