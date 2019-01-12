package org.kjsce.abhiyantriki.abhiyantriki;

public class Flagship_Model {
    int image;
    String title,subtitle;

    public Flagship_Model(int image, String title, String subtitle) {
        this.image = image;
        this.title = title;
        this.subtitle = subtitle;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }
}
