package com.example.smtp.service

import com.example.smtp.presentation.dto.SendMailRequestDto
import org.springframework.beans.factory.annotation.Value
import org.springframework.mail.SimpleMailMessage
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.stereotype.Service

@Service
class MailServiceImpl(
    private val javaMailSender: JavaMailSender,
    @Value("\${spring.mail.username}")
    private val sendFromAddress: String
) : MailService {

    override fun sendMail(sendMailRequestDto: SendMailRequestDto) {
        val message = SimpleMailMessage()

        message.from = sendFromAddress
        message.setTo(sendMailRequestDto.address)
        message.subject = sendMailRequestDto.title
        message.text = sendMailRequestDto.content

        javaMailSender.send(message)
    }

}
