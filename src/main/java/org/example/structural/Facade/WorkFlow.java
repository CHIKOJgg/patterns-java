package org.example.structural.Facade;

public class WorkFlow {
    Developer developer = new Developer();
    BugTracker bugTracker = new BugTracker();
    Job job = new Job();
    public void solve(){
        job.doJob();
        bugTracker.startSprint();
        developer.jobBeforeDeadline(bugTracker);
    }
}
