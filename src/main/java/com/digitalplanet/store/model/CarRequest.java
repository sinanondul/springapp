package com.digitalplanet.store.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import java.time.LocalDate;

@Data
@Builder
public class CarRequest {

    private String maker;

    @JsonProperty(value = "production_year")
    private LocalDate productionYear;
    private String model;

}
