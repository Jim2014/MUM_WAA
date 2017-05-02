package edu.mum.waa;

/**
 * Created by Administrator on 2017/5/1 0001.
 */
public class Welcome {
    private static Welcome ourInstance = new Welcome();

    public static Welcome getInstance() {
        return ourInstance;
    }
    private final String HTML="<!DOCTYPE html>\n"+
            "<html>\n"+
            "<head>\n"+
            "<title>Welcome</title>\n"+
            "</head>\n"+
            "<body>\n"+
            "<p>Welcome</p>\n"+
            "<p>counter: ${count}</p>\n"+
            "</body>\n"+
            "</html>";


    private Welcome() {
    }
    private  int counter = 0;
    public String GenerateHTML(){
        return HTML.replace("${count}",String.valueOf(++this.counter));
    }
}
