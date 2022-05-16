package com.company;

public class Programmer extends Person {
    private String companyName;

    public Programmer(String name, String designation, String companyName){
        super(name, designation);
        this.companyName = companyName;
    }

    public void coding(){
        System.out.println(getName()+" is coding!");
    }

    @Override
    public String toString(){
        return "Programmer's name is "+getName()+"\nProgrammer's designation is "+getDesignation()+"\nProgrammer's company name is "+getCompanyName();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

}
