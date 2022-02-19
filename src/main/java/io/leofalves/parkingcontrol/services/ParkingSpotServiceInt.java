package io.leofalves.parkingcontrol.services;

import org.springframework.stereotype.Service;

import io.leofalves.parkingcontrol.models.ParkingSpotModel;

@Service
public interface ParkingSpotServiceInt {

	ParkingSpotModel save(ParkingSpotModel parkingSpotModel);

}
