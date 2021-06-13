package pl.sda;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class Person {

    //@Value("Piotr")
    private String firstName;

    //@Value("#{myAuthor.lastName != 'wefewf' ? myAuthor.lastName : myAuthor.firstName}")
    private String lastName;

    //@Value("#{1==2}")
    private boolean old;

}
