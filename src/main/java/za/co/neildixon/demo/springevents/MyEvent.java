package za.co.neildixon.demo.springevents;


import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class MyEvent extends ApplicationEvent {

    private String message;

    public MyEvent(Object source, String message) {
        super(source);
        this.message = message;
    }
}
