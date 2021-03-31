package com.company.models;

import java.util.Hashtable;

public class Consult {

    private Doctor doctor;
    private Room room;
    private Patient pacient;

    public Consult(Doctor doctor, Room room, Patient pacient) {
        this.doctor = doctor;
        this.room = room;
        this.pacient = pacient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Patient getPacient() {
        return pacient;
    }

    public void setPacient(Patient pacient) {
        this.pacient = pacient;
    }
}
