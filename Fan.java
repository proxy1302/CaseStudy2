package com.devicecontrol;

import java.time.LocalDateTime;

public class Fan extends Device {
	

	public Fan(String deviceName, int deviceId) {
		super(deviceName, deviceId);
	}

	

	@Override
	public void ControlDevice() {
		toggleStatus();
		
	}
	


	



	
}
	




