package com.devicecontrol;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public abstract class Device{

	public String deviceName;
	int DeviceId;
	boolean Status;// off device
	LocalDateTime Starttime;
	LocalDateTime lastusedtime;
	Duration totalUsageTime;
	
	
	
public Device(String deviceName, int deviceId) {
		super();
		this.deviceName = deviceName;
		this.DeviceId = deviceId;
		this.Status = false; /// off devices 
		this.Starttime =LocalDateTime.now();
		this.lastusedtime=Starttime;
		 this.totalUsageTime = Duration.ZERO;
		
	}


public String getDeviceName() {
	return deviceName;
}


public void setDeviceName(String deviceName) {
	this.deviceName = deviceName;
}


public int getDeviceId() {
	return DeviceId;
}


public void setDeviceId(int deviceId) {
	DeviceId = deviceId;
}


public boolean isStatus() {
	return Status;
}


public void setStatus(boolean status) {
	Status = status;
}


public LocalDateTime getStarttime() {
	return Starttime;
}


public void setStarttime(LocalDateTime starttime) {
	Starttime = starttime;
}

public abstract  void ControlDevice();


// total used time when device last on and currently on
public void toggleStatus() {
//this.Status=!this.Status;
// off cosider
if(this.Status=!this.Status) {
	
	this.lastusedtime=LocalDateTime.now();// last used time when on.when u off
	System.out.println(deviceName+" is now on");
}else {
	 Duration duration=Duration.between(lastusedtime, LocalDateTime.now());
//ADD uses time when turned off/
System.out.println(" device is off from time");
	 totalUsageTime =totalUsageTime.plus(duration);
	 System.out.println(deviceName+" is now off");
}
}


//public  void Turnon() {
////chek dvice is off then we turn on it
//	if(!this.Status) {
//		this.Status=true;
//	    this.Starttime = LocalDateTime.now();
//        System.out.println(deviceName + " is now ON.");
//    } else {
//        System.out.println(deviceName + " is already ON.");
//    }
//		
//	}
//public void Turnoff() {
//// if off then wiil turn on 
//if( this.Status) {
//// set instrtction yo off it
//	this.Status=false;
//	this.lastusedtime = LocalDateTime.now();
//    Duration duration = Duration.between(Starttime, lastusedtime);
//    totalUsageTime = totalUsageTime.plus(duration);
//    System.out.println(deviceName + " is now OFF.");
//} else {
//    System.out.println(deviceName + " is already OFF.");
//}
//	
//}
//	

public void showDevicesdetails() {
	
	System.out.println("Device: " + deviceName + " (ID: " + DeviceId + ")");
    System.out.println("Status: " + (Status ? "ON" : "OFF"));
    if(Status) {
    System.out.println("Started at: " + Starttime);
    
    System.out.println("Total usage time: " + totalUsageTime.toMinutes() + " minutes");
    }
}

public void showstatus() {
	System.out.println(deviceName + " is " + (Status ? "ON" : "OFF"));
    if (Status) {
        System.out.println("Started at: " + Starttime);
        Duration onTime = Duration.between(Starttime, LocalDateTime.now());
        System.out.println("On time: " + onTime.toMinutes() + " minutes");
    } else {
        System.out.println("Last used at: " + lastusedtime);
        Duration offTime = Duration.between(lastusedtime, LocalDateTime.now());
        System.out.println("Off time: " + offTime.toMinutes() + " minutes");
    }
	
}

	}
	
	
	

