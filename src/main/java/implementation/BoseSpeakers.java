package implementation;

import interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {
    public String makeSound() {
        return "뮤직 보스스피커";
    }
}
