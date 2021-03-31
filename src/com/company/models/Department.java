package com.company.models;

import java.util.ArrayList;

public class Department {
    private String name;
    private ArrayList<Room> rooms;

    public Department(String name, ArrayList<Room> rooms) {
        this.name = name;
        this.rooms = rooms;
    }

    public String checkDepartmentName() {
        return name;
    }

    public void renameDepartment(String name) {
        this.name = name;
    }

    public ArrayList<Integer> displayRoomsOfDepartment() {
        ArrayList<Integer> roomIds = new ArrayList<Integer>();
        for (int id = 0; id < this.rooms.size(); ++id) {
            roomIds.add(this.rooms.get(id).checkRoomNumber());
        }
        return roomIds;
    }

}
