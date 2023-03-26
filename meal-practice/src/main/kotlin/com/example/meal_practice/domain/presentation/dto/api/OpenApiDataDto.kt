package com.example.meal_practice.domain.presentation.dto.api

import com.fasterxml.jackson.annotation.JsonProperty

data class OpenApiDataDto(
    @JsonProperty("data")
    var openApiInfoDto: OpenApiInfoDto
) {
    fun regeneration(): OpenApiDataDto {
        this.openApiInfoDto = OpenApiInfoDto(openApiInfoDto)
        return this
    }
}
