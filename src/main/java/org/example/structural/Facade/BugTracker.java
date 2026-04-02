package org.example.structural.Facade;

public class BugTracker {
    private boolean activeSprint ;

    public boolean isActiveSprint() {
        return activeSprint;
    }
    public void startSprint(){
        System.out.println("active");
        this.activeSprint = true;
    }
    public void stopSprint(){
        System.out.println("non-active");
        this.activeSprint = false;
    }
}
