package org.kjsce.abhiyantriki.abhiyantriki;

//For all tabs in event section, auto expo, tech expo and speakers
public class ModelCard1 {
    int image;
    String cname,ename;

    public ModelCard1(int image, String ename, String cname) {
        this.image = image;
        this.cname = cname;
        this.ename = ename;
    }

    public int getImage() {
        return image;
    }

    public String getCname() {
        return cname;
    }

    public String getEname() {
        return ename;
    }

    public boolean hasCouncilName(){
        if (getCname()=="") return false;
        else return true;
    }
}
