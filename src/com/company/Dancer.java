package com.company;

public class Dancer extends Person {
    private String groupName;

    public Dancer(String name, String designation, String groupName){
    super(name, designation);
    this.groupName = groupName;
    }

    public void dancing(){
        System.out.println(getName()+" is dancing!");
    }

    @Override
    public String toString(){
        return "\n\nDancer's name is "+getName()+"\nDancer's designation is "+getDesignation()+" \nDancer's group name is"+getGroupName();
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

}
