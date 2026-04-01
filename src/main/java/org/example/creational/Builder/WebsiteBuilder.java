package org.example.creational.Builder;

public abstract class WebsiteBuilder {
    Website website;
    void createWebsite(){
        website = new Website();

    }
    Website getWebsite(){
        return website;

    }
    abstract void buildName();
    abstract void buildCms();
    abstract void buildPrice();
}
