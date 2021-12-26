package by.overone;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Dog implements Pet {
    private String name;

    public Dog() {
        System.out.println("Dog created");
    }

    @Override
    public void say() {
        System.out.println("Gaw-gaw");
    }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
