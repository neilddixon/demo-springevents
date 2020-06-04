package za.co.neildixon.demo.springevents;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class DemoEventsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoEventsApplication.class, args);
    }

}
