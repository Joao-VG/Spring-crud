package com.example.springbot.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record ProductDTO(@NotBlank String name,@NotNull BigDecimal value) {


}
