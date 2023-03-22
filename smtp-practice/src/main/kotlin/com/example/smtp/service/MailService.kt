package com.example.smtp.service

import com.example.smtp.presentation.dto.SendMailRequestDto


interface MailService {

    fun sendMail(sendMailRequestDto: SendMailRequestDto)
}
