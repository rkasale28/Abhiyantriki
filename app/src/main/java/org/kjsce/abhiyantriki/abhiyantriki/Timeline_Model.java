package org.kjsce.abhiyantriki.abhiyantriki;

public class Timeline_Model {
    String year,content;

    public Timeline_Model(String year, String content) {
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
