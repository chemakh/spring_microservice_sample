package cl.streamlink.boond;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author l.chemakh
 * @project streamlink_boond
 */

@EnableEurekaClient
@SpringBootApplication
public class ServiceServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceServerApplication.class, args);
    }
}
