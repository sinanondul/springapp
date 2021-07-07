package com.digitalplanet.store.controller;

import com.digitalplanet.store.model.CarRequest;
import com.digitalplanet.store.model.CarResponse;
import com.digitalplanet.store.service.spec.CarBusinessService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class CarController {

    private final CarBusinessService carBusinessService;

    @GetMapping
    public ResponseEntity<CarResponse> getCarById(@PathVariable Long id) {
        // TODO
        return null;
    }

    @PostMapping(path = "/car")
    public ResponseEntity<CarResponse> saveCar(@RequestBody CarRequest carSaveRequest) {
        return ResponseEntity.ok(carBusinessService.saveCar(carSaveRequest));
    }
}
