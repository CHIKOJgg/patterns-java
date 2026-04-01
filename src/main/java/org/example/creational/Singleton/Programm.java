package org.example.creational.Singleton;

public class Programm {
    private static Programm logger ;
    private static String logFile = "Start of log file";
    public synchronized static Programm getProgramm(){
        if (logger == null){
            logger = new Programm();
        }
        return logger;
    }
    Programm(){

    }
    public void addLogInfo(String logInfo){
        logFile+=logInfo+"\n";
    }
    public void showLogInfo(){
        System.out.println(logFile);
    }
}
