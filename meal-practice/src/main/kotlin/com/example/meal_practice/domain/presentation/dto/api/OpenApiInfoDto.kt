package com.example.meal_practice.domain.presentation.dto.api

import java.text.ParseException
import java.text.SimpleDateFormat

data class OpenApiInfoDto(
    val date: String,
    val breakfast: String,
    val lunch: String,
    val dinner: String,
    val week: String
) {

    private val parseFormat = SimpleDateFormat("yyyy-MM-dd")
    private val parsedDate = try {
        parseFormat.parse(date)
    } catch (e: ParseException) {
        throw RuntimeException(e)
    }
    private val dateFormat = SimpleDateFormat("yyyy년 MM월 dd일 E요일")
    private val formatWeek = dateFormat.format(parsedDate)

    constructor(data: OpenApiInfoDto) : this(data.date, data.breakfast, data.lunch, data.dinner, data.formatWeek)
}
