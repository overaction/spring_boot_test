package implementation;

import interfaces.Speakers;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeakers implements Speakers {
    public String makeSound() {
        return "뮤직 소니스피커";
    }
}
