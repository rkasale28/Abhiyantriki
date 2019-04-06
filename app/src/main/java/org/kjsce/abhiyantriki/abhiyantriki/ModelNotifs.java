package org.kjsce.abhiyantriki.abhiyantriki;

//For all tabs in event section, auto expo, tech expo and speakers
public class ModelNotifs {
    String content,date,time;

    public ModelNotifs(String content,String date,String time) {
        this.content = content;
        this. date= date;
        this.time = time;
    }

    public String getContent() {
        return content;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

}
