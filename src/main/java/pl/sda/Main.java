package pl.sda;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("context.xml");
        Message myMessage = context.getBean(Message.class);
        ExtraMessage myExtraMessage = context.getBean(ExtraMessage.class);


        System.out.println(myMessage.getText());
        System.out.println(myExtraMessage.getText());

        System.out.println(context.getBeanDefinitionNames());
    }
}
