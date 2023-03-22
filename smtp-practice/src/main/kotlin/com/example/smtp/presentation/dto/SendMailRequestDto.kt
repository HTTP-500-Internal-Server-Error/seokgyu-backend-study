package com.example.smtp.presentation.dto

data class SendMailRequestDto(
    val address: String,
    val title: String,
    val content: String,
)
