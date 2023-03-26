package com.example.meal_practice.domain.presentation.dto.api

import java.lang.RuntimeException
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.Date

data class OpenApiInfoDto(
    val date: String,
    val breakfast: String,
    val lunch: String,
    val dinner: String,
    val week: String
) {
    private val parseFormat = SimpleDateFormat("yyyy-MM-dd")
    val parsedDate =
    try {
       this  = parseFormat.parse(date)
    } catch (e: ParseException) {
        throw RuntimeException(e)
    }
    val dateFormat = SimpleDateFormat("yyyy년 MM월 dd일 E요일")
    this.week = dateFormat.format(parsedDate)
}
