package by.overone;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("by.overone")
@PropertySource("classpath:myApplication.properties")
public class MyConfig {

    @Bean
    public Cat cat() {
        return new Cat();
    }

    @Bean
    public Person person() {
        return new Person(cat());
    }
}