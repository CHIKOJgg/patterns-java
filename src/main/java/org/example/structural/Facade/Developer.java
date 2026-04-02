package org.example.structural.Facade;

public class Developer {
    public void jobBeforeDeadline(BugTracker bugTracker){
        if (bugTracker.isActiveSprint()){
            System.out.println("developer doing job");
        }
        else {
            System.out.println("supping cocaine ");
        }
    }
}
