package com.homeautomation;

import java.util.ArrayList;
import java.util.List;

import com.devicecontrol.Device;

abstract class  Rooms {

	  public String roomName;
	    public ArrayList<Device> devices;

	    public Rooms(String roomName) {
	        this.roomName = roomName;
	        this.devices = new ArrayList<>();
	    }

	    public void addDevice(Device device) {
	        if (devices.stream().anyMatch(d -> d.getDeviceName().equals(device.getDeviceName()))) {
	            System.out.println("Device '" + device.getDeviceName() + "' already exists in this room.");
	        } else {
	            this.devices.add(device);
	        }
	    }

	    public void displayDevicesStatus() {
	        System.out.println("  Devices in " + this.roomName + ":");
	        for (Device device : this.devices) {
	            device.showstatus();
	        }
	    }

	    public void controlDevice(String deviceName) {
	        for (Device device : this.devices) {
	            if (device.getDeviceName().equals(deviceName)) {
	                device.ControlDevice();
	                return;
	            }
	        }
	        System.out.println("  Device '" + deviceName + "' not found in this room.");
	    }

	    public void displayAllDevices() {
	        System.out.println("  All devices in " + this.roomName + ":");
	        for (Device device : this.devices) {
	            device.showDevicesdetails();
	        }
	    }

	    public String getName() {
	        return this.roomName;
	    }

	    public List<Device> getDevices() {
	        return this.devices;
	    }  
	    
	    public abstract  void countofdevices();
}

	




	
	

