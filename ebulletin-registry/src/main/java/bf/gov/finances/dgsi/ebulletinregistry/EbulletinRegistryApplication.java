package bf.gov.finances.dgsi.ebulletinregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //ajouter pour indiquer que ce service est server
public class EbulletinRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(EbulletinRegistryApplication.class, args);
    }

}
