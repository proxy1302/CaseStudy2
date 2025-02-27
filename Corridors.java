package com.homeautomation;

import java.util.ArrayList;
import java.util.Scanner;

import com.devicecontrol.Device;
import com.devicecontrol.Light;

public class Corridors  extends Rooms{

	public Corridors(String RoomName) {
		super(" Corridor");
	
		addDevice(new Light("Corridor Light", 14));
	}

	@Override
	public void countofdevices() {
		
	}
	 
}
