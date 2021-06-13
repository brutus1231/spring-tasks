package pl.sda;

import lombok.Data;

@Data
public class Book {

    private String name;
    private int pages;
    private Author author;

    public Book() {
    }

    public Book(String name) {
        this.name = name;
    }

    public Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }
}
