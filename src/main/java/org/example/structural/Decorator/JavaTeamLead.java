package org.example.structural.Decorator;

public class JavaTeamLead extends DeveloperDecorator{

    JavaTeamLead(Developer developer) {
        super(developer);
    }
    public String controllTeam(){
        return "controlling team";
    }
    @Override
    public String write() {
        return super.write() + this.controllTeam();
    }
}
