package com.devicecontrol;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class AC  extends Device  implements controltempreature 
{
	
	int Temperature;

	public AC(String deviceName, int deviceId) {
		super(deviceName, deviceId);
		this.Temperature = 17;
	}

	public int getTemperature() {
		return Temperature;
	}

	public void setTemperature(int temperature) {
		Temperature = temperature;
	}

	@Override
	public void ControlDevice() {
		Scanner sc=new Scanner(System.in);
		System.out.println(" AC control: ");
		System.out.println(" 1) Toggle ON / oFF");
		System.out.println(" 2) set tempreature");
		System.out.println("  enter choice");
		int choice= sc.nextInt();
		sc.nextLine();
		
		switch (choice) {
		
		case 1:
			toggleStatus();// trun on or off
			break;
			
		
		case 2:
			if(Status) {
				System.out.println(" Enter Temprature :");
			int newtemp =sc.nextInt();
			controlTem(newtemp);
		}else {
			
			System.out.println(" AC is OFF");
		}
			break;
			default:
				System.out.println(" Enter Valid  choice");
		}
		
		
		
	}

	@Override
	public void   controlTem( int Tempreature) {
		this.Temperature=Temperature;
		System.out.println(" AC set to the Tempreature "+Temperature);
		
	}		
//
	
//  best method to set tempreature  AC before set tepreature
//	 public void setTemperature(double temperature) {
//	        if (!this.status){
//	            toggleStatus();
	//	        }
//	        this.temperature = temperature;
//	        System.out.println("AC temperature set to " + temperature + " degrees.");
//	    }	
		

	
		
	}

	
	
	
	
	




