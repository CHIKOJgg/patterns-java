package org.example.creational.Builder;

public class Website {
    private int price;
    private String name;
    private Cms cms;

    public void setPrice(int price) {
        this.price = price;
    }
    public void setCms(Cms cms) {
        this.cms = cms;
    }

    public void setName(String name) {
        this.name = name;
    }


}
