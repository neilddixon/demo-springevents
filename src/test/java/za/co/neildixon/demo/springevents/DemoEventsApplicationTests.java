package za.co.neildixon.demo.springevents;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoEventsApplicationTests {

    @Autowired
    MyEventPublisher publisher;

    @Test
    void contextLoads() {
    }

    @Test
    public void publishesEvent() throws InterruptedException {
        publisher.publishEvent("Hello Bob");

        Thread.sleep(3000);//allow some time for async listener to process event

        //Check log output
        //For observe thread names.
    }

}
