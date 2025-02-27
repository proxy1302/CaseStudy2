package com.homeautomation;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.devicecontrol.AC;
import com.devicecontrol.Device;
import com.devicecontrol.Fan;
import com.devicecontrol.Light;
import com.devicecontrol.TV;

public class BedRoom  extends Rooms{

	public BedRoom(String RoomName) {
		super("BedRoom");
		
		 addDevice(new AC("Bedroom AC 1", 1));
	        addDevice(new Light("Bedroom Light", 2));
	        addDevice(new Fan("Bedroom Fan", 3));
	        addDevice(new AC("Bedroom AC 2", 4));
	}

	@Override
	public void countofdevices() {
				

	}
	


}


