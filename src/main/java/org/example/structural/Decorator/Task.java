package org.example.structural.Decorator;

public class Task {

    static void main() {
    Developer developer = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));
        System.out.println(developer.write());
    }
}
