package pl.sda;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");
//        Message myMessage = context.getBean(Message.class);
        ExtraMessage extraMessageSingleton = context.getBean("myExtraMessage1", ExtraMessage.class);
        ExtraMessage extraMessagePrototype = context.getBean("myExtraMessage2", ExtraMessage.class);

        ExtraMessage extraMessageSingleton2 = context.getBean("myExtraMessage1", ExtraMessage.class);
        ExtraMessage extraMessagePrototype2 = context.getBean("myExtraMessage2", ExtraMessage.class);

        System.out.println(extraMessageSingleton == extraMessageSingleton2);
        System.out.println(extraMessagePrototype == extraMessagePrototype2);

        Book book = context.getBean("myBook", Book.class);
        System.out.println(book.toString());

        Book book2 = context.getBean("myBook2", Book.class);
        System.out.println(book2.toString());

        Book book3 = context.getBean("myBook3", Book.class);
        System.out.println(book3.toString());

        Book book4 = context.getBean("myBook4", Book.class);
        System.out.println(book4.toString());

        List<String> myList = context.getBean("myList", List.class);
        myList.stream().forEach(System.out::println);

        Map<String, String> myMap = context.getBean("myMap", Map.class);
        myMap.entrySet().forEach(System.out::println);

        Person person = context.getBean("myPerson", Person.class);
        System.out.println(person.toString());

        Student student = context.getBean("myStudent", Student.class);
        System.out.println(student.toString());

        ((ConfigurableApplicationContext)context).close();


    }
}
