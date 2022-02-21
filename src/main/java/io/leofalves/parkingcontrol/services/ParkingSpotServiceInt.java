package io.leofalves.parkingcontrol.services;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import io.leofalves.parkingcontrol.models.ParkingSpotModel;

@Service
public interface ParkingSpotServiceInt {

	ParkingSpotModel save(ParkingSpotModel parkingSpotModel);

	Page<ParkingSpotModel> findAll(Pageable pageable);

	boolean existsByLicensePlateCar(String licensePlateCar);

	boolean existsByParkingSpotNumber(String parkingSpotNumber);

	boolean existsByApartmentAndBlock(String apartment, String block);

	Optional<ParkingSpotModel> findById(UUID id);

	void delete(ParkingSpotModel parkingSpotModel);

}
