package com.example.meal_practice.domain.service

import com.example.meal_practice.domain.presentation.dto.api.OpenApiDataDto

interface MealService {
    fun getAllMeal(year: String, month: String, day: String): OpenApiDataDto

    fun mealUriBuild(year: String, month: String, day: String): String
}
