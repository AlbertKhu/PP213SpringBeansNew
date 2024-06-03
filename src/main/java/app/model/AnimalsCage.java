package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {
    private Animal animalOne;
    private Animal animalTwo;
    private Timer time;

    @Autowired
    public AnimalsCage(@Qualifier("cat") Animal animalOne, @Qualifier("dog") Animal animalTwo, Timer time) {
        this.animalOne = animalOne;
        this.animalTwo = animalTwo;
        this.time = time;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animalOne.toString() + ", " + animalTwo.toString());
        System.out.println("At:");
        System.out.println(time.getTime());
        System.out.println("________________________");
    }

    public Timer getTimer() {
        return time;
    }
}