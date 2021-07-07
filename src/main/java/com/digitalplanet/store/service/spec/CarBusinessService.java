package com.digitalplanet.store.service.spec;

import com.digitalplanet.store.model.CarResponse;
import com.digitalplanet.store.model.CarRequest;

public interface CarBusinessService {
    CarResponse saveCar(CarRequest carSaveRequest);
    CarResponse getCarById(Long id);
}
