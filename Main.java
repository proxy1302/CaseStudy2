package com.homeautomation;

import java.util.Scanner;

import com.devicecontrol.AC;
import com.devicecontrol.Device;
import com.devicecontrol.Fan;
import com.devicecontrol.Light;
import com.devicecontrol.Shower;
import com.devicecontrol.TV;

public class Main {
	
	 public static void main(String[] args) {
	        
		 house house = new house();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("\nMenu:");
	            System.out.println("1. Add Room");
	            System.out.println("2. Add Device to Room");
	            System.out.println("3. Status of all devices in room");
	            System.out.println("4. Control devices in room");
	            System.out.println("5. Display all devices in room");
	            System.out.println("6. Exit");
	            System.out.print("Enter your choice: ");

	            String choice = scanner.nextLine();

	            switch (choice) {
	                case "1":
	                	house.displayroom();
	                    System.out.print("Enter room name: ");
	                    String newRoomName = scanner.nextLine();
	                    house.addRoom(new Rooms("rooms") {
	                     
	                        public String getName() {
	                            return newRoomName;
	                        }

							@Override
							public void countofdevices() {
								// TODO Auto-generated method stub
								
							}
	                    });
	                    
	                    System.out.println("Room added.");
	                    break;
	                case "2":
	                	house.displayroom();
	                    System.out.print("Enter room name: ");
	                    String roomName = scanner.nextLine();
	                    Rooms room = house.getRoomByName(roomName);
	                    if (room != null) {
	                        System.out.print("Enter device type (AC, Light, Fan, TV, Shower): ");
	                        String deviceType = scanner.nextLine();
	                        System.out.print("Enter device name: ");
	                        String deviceName = scanner.nextLine();
	                        System.out.print("Enter device ID: ");
	                        int deviceId = scanner.nextInt();
	                        scanner.nextLine();
	                        Device device = null;
	                        switch (deviceType.toLowerCase()) {
	                            case "ac":
	                                device = new AC(deviceName, deviceId);
	                                break;
	                            case "light":
	                                device = new Light(deviceName, deviceId);
	                                break;
	                            case "fan":
	                                device = new Fan(deviceName, deviceId);
	                                break;
	                            case "tv":
	                                device = new TV(deviceName, deviceId);
	                                break;
	                            case "shower":
	                                device = new Shower(deviceName, deviceId);
	                                break;
	                            default:
	                                System.out.println("Invalid device type.");
	                                continue;
	                        }
	                        room.addDevice(device);
	                        System.out.println("Device added.");
	                    } else {
	                        System.out.println("Room not found.");
	                    }
	                    break;
	                case "3":
	                	
	                	house.displayroom();
	                    System.out.print("Enter room name: ");
	                    roomName = scanner.nextLine();
	                    room = house.getRoomByName(roomName);
	                    if (room != null) {
	                        room.displayDevicesStatus();
	                    } else {
	                        System.out.println("Room not found.");
	                    }
	                    break;
	                case "4":
	                	house.displayroom();
	                    System.out.print("Enter room name: ");
	                    roomName = scanner.nextLine();
	                    room = house.getRoomByName(roomName);
	                    if (room != null) {
	                        System.out.print("Enter device name: ");
	                        String deviceNameToControl = scanner.nextLine();
	                        room.controlDevice(deviceNameToControl);
	                    } else {
	                        System.out.println("Room not found.");
	                    }
	                    
	                    break;
	                case "5":
	                	house.displayroom();
	                    System.out.print("Enter room name: ");
	                    roomName = scanner.nextLine();
	                    room = house.getRoomByName(roomName);
	                    if (room != null) {
	                        room.displayAllDevices();
	                    } else {
	                        System.out.println("Room not found.");
	                    }
	                    break;
	                case "6":
	                    System.out.println("Exiting...");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid choice.");
	            }
	        }
	    }

}




        	
        	
            
	

