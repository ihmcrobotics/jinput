package net.java.games.input;

import net.java.games.input.Component.Identifier;

public class LinuxDeviceRumbler implements Rumbler {
	
	private int deviceID;
	
	public LinuxDeviceRumbler(int deviceID) {
		this.deviceID = deviceID;
	}

	public void rumble(float intensity) {
		// TODO Auto-generated method stub
		nativeRumble(deviceID, intensity);
	}

	public String getAxisName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Identifier getAxisIdentifier() {
		// TODO Auto-generated method stub
		return null;
	}

	private native void nativeRumble(int deviceID, float intensity);
}