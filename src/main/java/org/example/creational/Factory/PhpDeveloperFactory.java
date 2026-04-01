package org.example.creational.Factory;

public class PhpDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
         return new PHPDeveloper();
    }
}
