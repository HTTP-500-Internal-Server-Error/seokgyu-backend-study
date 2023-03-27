package com.example.meal_practice.domain.service

import com.example.meal_practice.domain.presentation.dto.api.OpenApiDataDto
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.util.UriBuilder

@Service
class MealServiceImpl(
    private val uriBuilder: UriBuilder,
    private val webClient: WebClient,
) : MealService {
    override fun getAllMeal(year: String, month: String, day: String): OpenApiDataDto =
        webClient.get()
            .uri(mealUriBuild(year, month, day))
            .retrieve()
            .bodyToMono(OpenApiDataDto::class.java)
            .block()!!
            .regeneration()

    override fun mealUriBuild(year: String, month: String, day: String): String =
        uriBuilder
            .queryParam("year", year)
            .queryParam("month", month)
            .queryParam("day", day)
            .build()
            .toString()

}