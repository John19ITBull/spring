package by.overone;

import org.springframework.stereotype.Component;

@Component
public class Cat implements Pet{
    private String name;

    public Cat() {
        System.out.println("Cat created");
    }

    @Override
    public void say() {
        System.out.println("Mew-mew");
    }

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
