package com.lld.designpatterns.projects.parkinglot.model;

import java.util.List;

public class ParkingSpot {
	private int parkingSpotNumber;
	private ParkingSpotStatus parkingSpotStatus;
	private List<VehicleType> supportableVehicleType;
	private ParkingFloor parkingFloor;

	public int getParkingSpotNumber() {
		return parkingSpotNumber;
	}

	public void setParkingSpotNumber(int parkingSpotNumber) {
		this.parkingSpotNumber = parkingSpotNumber;
	}

	public ParkingSpotStatus getParkingSpotStatus() {
		return parkingSpotStatus;
	}

	public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
		this.parkingSpotStatus = parkingSpotStatus;
	}

	public List<VehicleType> getSupportableVehicleType() {
		return supportableVehicleType;
	}

	public void setSupportableVehicleType(List<VehicleType> supportableVehicleType) {
		this.supportableVehicleType = supportableVehicleType;
	}

	public ParkingFloor getParkingFloor() {
		return parkingFloor;
	}

	public void setParkingFloor(ParkingFloor parkingFloor) {
		this.parkingFloor = parkingFloor;
	}
}
