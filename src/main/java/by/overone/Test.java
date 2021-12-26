package by.overone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Person myPerson = context.getBean("myPerson", Person.class);
//        Person myPerson2 = context.getBean("myPerson", Person.class);
//
//        System.out.println(myPerson == myPerson2);
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person myPerson = context.getBean("person", Person.class);
        System.out.println(myPerson);
        context.close();
    }
}
