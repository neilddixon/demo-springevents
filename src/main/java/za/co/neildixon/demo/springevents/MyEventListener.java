package za.co.neildixon.demo.springevents;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MyEventListener {

    @Async
    @EventListener
    public void handleEventAsync(MyEvent event) {
        log.info("Handling myEvent Async: {}, Thread name: {}", event.getMessage(), Thread.currentThread().getName());
    }

    //@Async
    @EventListener
    public void handleEventSync(MyEvent event) {
        log.info("Handling myEvent Sync: {}, Thread name: {}", event.getMessage(), Thread.currentThread().getName());
    }
}
