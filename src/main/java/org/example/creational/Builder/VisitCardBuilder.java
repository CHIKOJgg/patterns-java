package org.example.creational.Builder;

public class VisitCardBuilder extends WebsiteBuilder{
    @Override
    void buildName() {
        website.setName("name");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.react);
    }

    @Override
    void buildPrice() {
        website.setPrice(100);
    }
}
