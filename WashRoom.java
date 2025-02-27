
package com.homeautomation;

import java.util.ArrayList;
import java.util.Scanner;

import com.devicecontrol.Device;
import com.devicecontrol.Shower;

public class WashRoom  extends Rooms{

	ArrayList<WashRoom> washroom;
	
	public WashRoom(String RoomName) {
		super("WashRoom");
		this.washroom= new ArrayList<>();
		
		addDevice(new Shower("Washroom Shower", 11));
	}

	@Override
	public void countofdevices() {
		

		washroom.size();
		
		System.out.println(" count of devices inroom"+washroom.size());
		
	}
	
}

