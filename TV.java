package com.devicecontrol;

import java.time.LocalDateTime;
import java.util.Scanner;

public class TV extends Device implements controlfeatures 
{

	int Channel;
	int Volume;
	
	public TV(String deviceName, int deviceId) {
		super(deviceName, deviceId);
		
		this.Channel=101;
		this.Volume=88;
		
	}

	@Override
	public void ControlDevice() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" TV  control: ");
		System.out.println(" 1) Toggle ON / OFF");
		System.out.println(" 2) change channel");
		System.out.println(" 3) change  volume");
	    System.out.println(" # enter choice ");
		
		int choice= sc.nextInt();
		sc.nextLine();
		
		switch (choice) {
		
		case 1:
			toggleStatus();// trun on or off
			break;
			
		
		case 2:
			if(Status) {
				System.out.println(" Enter Channel number:");
			int newChannel =sc.nextInt();
			changechannel(newChannel);
		}else {
			
			System.out.println(" TV is OFF");
		}
			break;
		case 3:
			if(Status ) {
				System.out.println(" Enter volume :");
				int newvolume =sc.nextInt();
				Changevolume(newvolume );
			}
			
			
			
			
			
			default:
				System.out.println(" Enter Valid  choice");
		}
		
		
		
	}
	@Override
	public void changechannel( int Channel ) {
		this.Channel=Channel;
		System.out.println(" TV change Channel "+Channel);
	}
	@Override
	public void Changevolume( int volume ) {
		this.Volume=volume;
		System.out.println(" TV CAnhge volume "+volume );
		
	}

	
	
	
	
	
	
	
	

}
