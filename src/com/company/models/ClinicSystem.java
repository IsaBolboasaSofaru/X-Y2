package com.company.models;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

public class ClinicSystem {

    public String name;
    private List<Patient> patients;
    public List<Doctor> doctors;
    public List<Nurse> nurses;
    public List<Pharmacist> pharmacists;
    public List<Department> departments;

    public ClinicSystem(String name, List<Department> departments) {
        this.name = name;
        this.patients = new ArrayList<Patient>();
        this.doctors = new ArrayList<Doctor>();
        this.nurses = new ArrayList<Nurse>();
        this.pharmacists = new ArrayList<Pharmacist>();
        this.departments = departments;
    }

    public void updatePatients(Patient patient){
        this.patients.add(patient);
        System.out.println("Patient " + patient.getName() + " added");
    }

    public void updateMedicalStaff(MedicalStaff mdstaff)
    {
        // if(mdstaff.typeOfJob.equals("Doctor")){
        //    this.doctors.add(mdstaff);
        //}


    }

    public Integer numberOfEmployees(){
        return MedicalStaff.getMedicalStaff();
    }

}
