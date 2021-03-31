package com.company.models;

public class Nurse extends MedicalStaff {
    private String name;
    private String possibleAssistent;

    public Nurse(String typeOfJob, String name, String possibleAssistent, String address) {
        super(typeOfJob, address);
        this.name = name;
        this.possibleAssistent = possibleAssistent;
    }

    public String getName(){
        return name;
    }

    public String getPossibleAssistent()
    {
        return possibleAssistent;
    }

}
