package edu.mum.waa;

/**
 * Created by Administrator on 2017/5/1 0001.
 */
public class Contacts {
    private static Contacts ourInstance = new Contacts();

    public static Contacts getInstance() {
        return ourInstance;
    }

    private final String HTML="<!DOCTYPE html>\n"+
            "<html>\n"+
            "<head>\n"+
            "<title>Contacts</title>\n"+
            "</head>\n"+
            "<body>\n"+
            "<p>Contacts</p>\n"+
            "<p>counter: ${count}</p>\n"+
            "</body>\n"+
            "</html>";

    private Contacts() {
    }
    private  int counter = 0;
    public String GenerateHTML(){
        return HTML.replace("${count}",String.valueOf(++this.counter));
    }
}
