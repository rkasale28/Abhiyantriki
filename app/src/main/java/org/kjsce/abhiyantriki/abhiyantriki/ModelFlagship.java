package org.kjsce.abhiyantriki.abhiyantriki;

//For image slider in Home section
public class ModelFlagship {
    int image;
    String title,subtitle;

    public ModelFlagship(int image, String title, String subtitle) {
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
