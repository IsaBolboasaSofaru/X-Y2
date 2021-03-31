package com.company.models;

public abstract class MedicalStaff {
    static Integer staffMembersCounter = 0;
    protected Integer staffId;
    protected String typeOfJob;
   // protected Department department;
    protected String address;
    protected Double salary;

    public MedicalStaff(String typeOfJob, String address){

        this.typeOfJob = typeOfJob;
        this.staffId = staffMembersCounter;
        staffMembersCounter += 1;

        if(this.typeOfJob.equals("Doctor")){
            this.salary = 200.0;
        }
         else if (this.typeOfJob.equals("Nurse")) {
            this.salary = 100.0;
        }
         else if (this.typeOfJob.equals("Pharmacist")){
            this.salary = 120.0;
        }

    }

    public abstract String getName();

    public String getTypeOfJob() {
        return typeOfJob;
    }

    public void setTypeOfJob(String typeOfJob) {
        this.typeOfJob = typeOfJob;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static Integer getMedicalStaff(){
        return staffMembersCounter;
    }

}