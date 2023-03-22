package com.example.smtp.presentation

import com.example.smtp.presentation.dto.SendMailRequestDto
import com.example.smtp.service.MailService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/mail")
class MailController(
    private val mailService: MailService
) {
    @PostMapping
    fun sendMail(@RequestBody sendMailRequestDto: SendMailRequestDto) {
        mailService.sendMail(sendMailRequestDto)
    }
}