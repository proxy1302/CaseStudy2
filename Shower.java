package com.devicecontrol;

import java.time.LocalDateTime;

public class Shower extends Device  {

	public Shower(String deviceName, int deviceId) {
		super(deviceName, deviceId );
		
	}

	@Override
	public void ControlDevice() {
		toggleStatus();
	}

	
	
	
	
	
}