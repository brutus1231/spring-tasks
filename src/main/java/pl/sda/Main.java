package pl.sda;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;
import java.util.List;

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

        ((ConfigurableApplicationContext)context).close();


    }
}
