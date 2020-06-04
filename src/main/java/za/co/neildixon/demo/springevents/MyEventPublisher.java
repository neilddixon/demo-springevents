package za.co.neildixon.demo.springevents;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MyEventPublisher {

    private final ApplicationEventPublisher publisher;

    public MyEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void publishEvent(String message) {
        log.info("Publishing event with message:{}. Thread name: {}", message, Thread.currentThread().getName());
        publisher.publishEvent(new MyEvent(this, message));
    }
}
