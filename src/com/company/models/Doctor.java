package com.company.models;

import java.util.ArrayList;
import java.util.SortedSet;

public class Doctor extends MedicalStaff {
    private String name;
    private Integer yearsOfExperience;
    private Integer maxPatientsNumber;
    private Integer patientsCounter;


    public Doctor(String typeOfJob,  String name, Integer yearsOfExperience, Integer maxPatientsNumber, String address) {
        super(typeOfJob, address);

        this.name = name;
        this.yearsOfExperience = yearsOfExperience;
        this.maxPatientsNumber = maxPatientsNumber;
    }

    public void addPatients(Patient patient){
        if(patientsCounter + 1 < maxPatientsNumber) {
            patientsCounter += 1;
        }else{
            System.out.println("Pacientul nu se poate programa");
        }
    }

    public String getName() {
        return name;
    }


    public Integer getYearsOfExperience() {
        return yearsOfExperience;
    }


    public Integer getMaxPatientsNumber() {
        return maxPatientsNumber;
    }

    public Integer getPatientsCounter() {
        return patientsCounter;
    }

}
