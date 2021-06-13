package pl.sda;

import lombok.Data;

@Data
public class Book {

    private String firstName;
    private String lastName;
    private Author author;
}
