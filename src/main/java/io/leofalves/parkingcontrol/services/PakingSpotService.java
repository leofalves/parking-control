package io.leofalves.parkingcontrol.services;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import io.leofalves.parkingcontrol.models.ParkingSpotModel;
import io.leofalves.parkingcontrol.repositories.ParkingSpotRepository;

@Service
public class PakingSpotService implements ParkingSpotServiceInt {
	
	final ParkingSpotRepository parkingSpotRepository;

	public PakingSpotService(ParkingSpotRepository parkingSpotRepository) {
		this.parkingSpotRepository = parkingSpotRepository;
	}

	@Override
	@Transactional
	public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
		return parkingSpotRepository.save(parkingSpotModel);
	}
}
