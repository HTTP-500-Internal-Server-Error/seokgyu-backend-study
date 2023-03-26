package com.example.meal_practice.domain.presentation

import com.example.meal_practice.domain.presentation.dto.api.OpenApiDataDto
import com.example.meal_practice.domain.service.MealService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/meal")
class MealController(
    private val mealService: MealService
) {
    @GetMapping
    fun getAllMeal(
        @RequestParam year: String,
        @RequestParam month: String,
        @RequestParam day: String
    ): ResponseEntity<OpenApiDataDto> =
        ResponseEntity(mealService.getAllMeal(year, month, day), HttpStatus.OK)
}