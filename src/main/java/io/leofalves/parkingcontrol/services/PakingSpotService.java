package io.leofalves.parkingcontrol.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

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

	@Override
	public List<ParkingSpotModel> findAll() {
		return parkingSpotRepository.findAll();
	}

	@Override
	public boolean existsByLicensePlateCar(String licensePlateCar) {
		return parkingSpotRepository.existsByLicensePlateCar(licensePlateCar);
	}

	@Override
	public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
		return parkingSpotRepository.existsByParkingSpotNumber(parkingSpotNumber);
	}

	@Override
	public boolean existsByApartmentAndBlock(String apartment, String block) {
		return parkingSpotRepository.existsByApartmentAndBlock(apartment, block);
	}

	@Override
	public Optional<ParkingSpotModel> findById(UUID id) {
		return parkingSpotRepository.findById(id);
	}

	@Override
	@Transactional
	public void delete(ParkingSpotModel parkingSpotModel) {
		//parkingSpotRepository.deleteById(parkingSpotModel.getId());
		parkingSpotRepository.delete(parkingSpotModel);
	}
}
