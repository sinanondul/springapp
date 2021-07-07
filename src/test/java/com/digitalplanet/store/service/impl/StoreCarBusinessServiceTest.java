package com.digitalplanet.store.service.impl;

import com.digitalplanet.store.entity.Car;
import com.digitalplanet.store.model.CarRequest;
import com.digitalplanet.store.model.CarResponse;
import com.digitalplanet.store.repository.CarRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class StoreCarBusinessServiceTest {

    @Mock
    CarRepository carRepository;

    @InjectMocks
    StoreCarBusinessService storeCarBusinessService;

    @Test
    void saveCarHappyPath() {

        CarRequest carRequest = CarRequest.builder()
                                          .maker("FORD")
                                          .model("BRONCO")
                                          .productionYear(LocalDate.of(2021, 12, 12))
                                          .build();
        Car persistedCar = Car.builder()
                              .id(1L)
                              .maker("FORD")
                              .model("BRONCO")
                              .productionYear(LocalDate.of(2021, 12, 12))
                              .build();

        when(carRepository.save(any())).thenReturn(persistedCar);
        CarResponse actual = storeCarBusinessService.saveCar(carRequest);

        assertEquals("FORD",actual.getMaker());
        assertEquals("BRONCO",actual.getModel());
    }
}