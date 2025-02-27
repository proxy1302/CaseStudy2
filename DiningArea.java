package com.homeautomation;

import java.util.ArrayList;
import java.util.Scanner;

import com.devicecontrol.AC;
import com.devicecontrol.Device;
import com.devicecontrol.Fan;
import com.devicecontrol.Light;
import com.devicecontrol.TV;

public class DiningArea extends Rooms {

	public DiningArea(String RoomName) {
		super("DiningArea");
		addDevice(new Light("Dining Area Light", 12));
        addDevice(new Fan("Dining Area Fan", 13));
	}

	@Override
	public void countofdevices() {
		// TODO Auto-generated method stub
		
	}
	

}
