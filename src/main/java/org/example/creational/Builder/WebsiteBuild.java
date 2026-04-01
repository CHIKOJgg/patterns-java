package org.example.creational.Builder;

public class WebsiteBuild {

    static void main(String[] args) {
         WebsiteManager manager = new WebsiteManager();
        manager.setBuilder(new VisitCardBuilder());
        Website website = manager.buildWebsite();
        System.out.println(website);
    }
}
