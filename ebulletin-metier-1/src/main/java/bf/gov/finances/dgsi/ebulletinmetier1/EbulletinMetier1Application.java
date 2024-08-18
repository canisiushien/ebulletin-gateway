package bf.gov.finances.dgsi.ebulletinmetier1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EbulletinMetier1Application {

    public static void main(String[] args) {
        SpringApplication.run(EbulletinMetier1Application.class, args);
    }

}
