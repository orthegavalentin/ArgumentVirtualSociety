package com.company;

import java.util.ArrayList;

public class Argument {

     private String label ;
     private  String descrition;
     ArrayList<Argument> attackers;

    public Argument(String description){
        this.descrition=description;
        this.label="";
        attackers=new ArrayList<>();


    }

    public void attack(Argument e){
        System.out.println(this.descrition +"attacks"+e.descrition);
        e.addAttacker(this);

    }

    public void setLabel(String label){
        this.label=label;

    }
    public String getLabel(){
        return this.label;

    }
    public void addAttacker(Argument attacker){
        attackers.add(attacker);

    }

}
