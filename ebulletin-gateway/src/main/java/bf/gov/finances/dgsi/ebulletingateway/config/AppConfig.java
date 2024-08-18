package bf.gov.finances.dgsi.ebulletingateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * Permet de faire des appels HTTP(GET, POST, PUT, DELETE, etc.) synchrones
 * entre microservices REST.
 *
 * @author Canisius <canisiushien@gmail.com>
 */
@Configuration
public class AppConfig {

    @Bean
    public RestTemplate template() {
        return new RestTemplate();
    }
}
