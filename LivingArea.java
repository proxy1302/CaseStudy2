package com.homeautomation;

import java.util.ArrayList;
import java.util.Scanner;

import com.devicecontrol.AC;
import com.devicecontrol.Device;
import com.devicecontrol.Fan;
import com.devicecontrol.Light;
import com.devicecontrol.TV;

public class LivingArea extends Rooms {
	
	ArrayList<LivingArea> livingarea;
	

	public LivingArea(String RoomName) {
		
		super("LivingArea");
		
		this.livingarea = new ArrayList<>();
		addDevice(new AC("Living Area AC", 5));
        addDevice(new TV("Living Area TV", 6));
        addDevice(new Fan("Living Area Fan", 7));
        addDevice(new Light("Living Area Light", 8));
	}
public void countofdevices() {
	
	livingarea.size();
	
	System.out.println(" count of devices inroom"+livingarea.size());
	
}
	 
	
	
}
