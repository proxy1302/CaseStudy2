package com.devicecontrol;

import java.time.LocalDateTime;

public class Light extends Device {

	public Light(String deviceName, int deviceId) {
		super(deviceName, deviceId);
		
	}

	@Override
	public void ControlDevice() {
		
		toggleStatus();
	}
	
	
	
	
}