package com.company.models;

import java.util.Hashtable;

//rooms.put(1,"departmentName") - adaugi camera 1 intr-un departament
//hashtable elements are accessed with get()
public class Room {
    //private Hashtable<Integer,Department> rooms;
    static Integer totalRooms = 0;

    private Integer roomNumber;
    private Boolean isAvailable;

    public Room() {
        this.isAvailable = Boolean.TRUE;
        this.roomNumber = totalRooms;
        totalRooms += 1;
    }

    public boolean checkAvailability(){
        return isAvailable;
    }

    public Integer checkRoomNumber()
    {
        return roomNumber;
    }
}
