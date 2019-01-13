package org.kjsce.abhiyantriki.abhiyantriki;

//For timeline section in home
public class ModelTimeline {
    String year,content;

    public ModelTimeline(String year, String content) {
        this.year = year;
        this.content = content;
    }

    public String getYear() {
        return year;
    }

    public String getContent() {
        return content;
    }
}
