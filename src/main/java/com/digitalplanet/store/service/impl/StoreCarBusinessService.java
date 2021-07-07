package com.digitalplanet.store.service.impl;

import com.digitalplanet.store.entity.Car;
import com.digitalplanet.store.model.CarRequest;
import com.digitalplanet.store.model.CarResponse;
import com.digitalplanet.store.repository.CarRepository;
import com.digitalplanet.store.service.spec.CarBusinessService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StoreCarBusinessService implements CarBusinessService {

    private final CarRepository carRepository;

    @Override
    public CarResponse saveCar(CarRequest carSaveRequest) {
        Car car = Car.builder()
                     .maker(carSaveRequest.getMaker())
                     .model(carSaveRequest.getModel())
                     .productionYear(carSaveRequest.getProductionYear())
                     .build();
        Car persistedEntity=carRepository.save(car);


        return CarResponse.builder().maker(persistedEntity.getMaker())
                          .model(persistedEntity.getModel())
                          .productionYear(persistedEntity.getProductionYear())
                          .build();
    }

    @Override
    public CarResponse getCarById(Long id) {
        return null;
    }
}
