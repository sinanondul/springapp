package com.digitalplanet.store.repository;

import com.digitalplanet.store.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface CarRepository extends JpaRepository<Car,Long> {
}
