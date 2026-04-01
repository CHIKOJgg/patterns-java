package org.example.creational.Builder;

public class EnterpriseSite extends WebsiteBuilder{

    @Override
    void buildName() {
        website.setName("enterprise Website");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.angular);
    }

    @Override
    void buildPrice() {
        website.setPrice(5000);

    }
}
