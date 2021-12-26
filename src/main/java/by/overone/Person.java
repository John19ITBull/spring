package by.overone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class Person {
    @Autowired
    @Qualifier("cat")
    private Pet pet;
    @Value("${person.name}")
    private String name;

    public Person() {
        System.out.println("Person created");
    }

    public Person(Pet pet) {
        System.out.println("Person created");
        this.pet = pet;
    }

    public Person(String name) {
        this.name = name;
    }

    @PostConstruct
    public void initMethod() {
        System.out.println("Init method");
    }

    @PreDestroy
    public void destroyMethod() {
        System.out.println("Destroy method");
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void callYourPet() {
        System.out.println("Hello my pet");
        pet.say();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pet=" + pet +
                ", name='" + name + '\'' +
                '}';
    }
}
