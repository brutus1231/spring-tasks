package pl.sda;

import lombok.Data;

@Data
public class ExtraMessage {

    private String text;

    public void init() {
        System.out.println("Odpaliła się metoda init");
    }
}
