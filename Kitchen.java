package com.homeautomation;

import java.util.ArrayList;
import java.util.Scanner;

import com.devicecontrol.AC;
import com.devicecontrol.Device;
import com.devicecontrol.Fan;
import com.devicecontrol.Light;
import com.devicecontrol.TV;

public class Kitchen  extends Rooms{

	public Kitchen(String RoomName) {
		super("Kitchen");
		
		 addDevice(new Light("Kitchen Light", 9));
	        addDevice(new Fan("Kitchen Fan", 10));
	}

	@Override
	public void countofdevices() {
		// TODO Auto-generated method stub
		
	}

	

}
