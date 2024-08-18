package bf.gov.finances.dgsi.ebulletingateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * PROCESS CONTEXTUEL :
 *
 * Keycloak sera utilisé pour l'authentification.
 *
 * Les utilisateurs s'authentifient via Keycloak et accèdent ensuite aux
 * microservices via la presente gateway.
 *
 * La gateway vérifiera les tokens JWT avant de transférer les requêtes vers les
 * microservices via les directives de routage.
 *
 * @author Canisius <canisiushien@gmail.com>
 */
@SpringBootApplication
@EnableDiscoveryClient //ajouter pour indiquer que ce service est client et doit se declarer au eureka server
public class EbulletinGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(EbulletinGatewayApplication.class, args);
    }

}
