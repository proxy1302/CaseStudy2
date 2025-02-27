package com.homeautomation;

import java.util.ArrayList;
import java.util.List;

public class house {
	
	List<Rooms> rooms;

    public house() {
        this.rooms = new ArrayList<>();
        
        rooms.add(new BedRoom("Bedroom"));//BedRoom
        rooms.add(new LivingArea("LivingArea"));//LivingArea
        rooms.add(new Kitchen("Kitchen"));//Kitchen
        rooms.add(new WashRoom("WashRoom"));// WashRoom
        rooms.add(new DiningArea("DinningArea"));//DiningArea
        rooms.add(new Corridors("Corridores"));//Corridor
    }
    public void displayroom() {
    	System.out.println("BedRoom");
    	System.out.println("LivingArea");
    	System.out.println("WashRoom");
    	System.out.println("DiningArea");
    	System.out.println("Corridor");
    	
    	
    }
    
    
    public void addRoom(Rooms room) {
        if (rooms.stream().anyMatch(r -> r.getName().equals(room.getName()))) {
            System.out.println("Room '" + room.getName() + "' already exists.");
        } else {
            this.rooms.add(room);
        }
    }

    public Rooms getRoomByName(String roomName) {
        for (Rooms room : this.rooms) {
            if (room.getName().equals(roomName)) {
                return room;
            }
        }
        return null;
    }

    public List<Rooms> getRooms() {
        return this.rooms;
    }
    
   
}
