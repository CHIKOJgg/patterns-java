package org.example.creational.Factory;

public class Programm {

    static void main(String[] args) {
    DeveloperFactory developerFactory = Programm.createDeveloperFactory("php1");
    Developer developer  = developerFactory.createDeveloper();
    developer.writeCode();
    }
    static DeveloperFactory createDeveloperFactory(String specialty){
        if (specialty.equals("java")){
            return new JavaDeveloperFactory();
        }
        else if (specialty.equals("cpp")) {
            return new CppDeveloperFactory();
        }
        else if (specialty.equals("php")) {
            return new PhpDeveloperFactory();
        }
        else {
            throw new RuntimeException();
        }
    }

}
