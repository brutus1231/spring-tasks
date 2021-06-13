package pl.sda;

import lombok.Data;

@Data
public class ExtraMessage {

    private String text;

    public ExtraMessage() {
        System.out.println("Konstruktor " + getClass().getName());
    }

    public void init() {
        System.out.println("Odpaliła się metoda init");
    }
    public void destroy(){
        System.out.println("Destroy");
    }
}
