package com.company.models;

public class Pharmacist extends MedicalStaff{
    private String name;
    private String jobTitle;


    public Pharmacist(String typeOfJob, String name, String jobTitle, String address) {
        super(typeOfJob,address);
        this.name = name;
        this.jobTitle = jobTitle;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }
}
