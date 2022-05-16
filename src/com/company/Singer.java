package com.company;

public class Singer extends Person {
    private String bandName;

    public Singer(String name, String designation, String bandName){
        super(name, designation);
        this.bandName = bandName;
    }

    public void singing(){
        System.out.println(getName()+" is singing!");
    }

    public void playGuitar(){
        System.out.println(getName()+" is playing guitar!");
    }

    @Override
    public String toString(){
        return "\n\nSinger's name is "+getName()+"\nSinger's designation is "+getDesignation()+"\nSinger's band name is "+getBandName();
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

}
