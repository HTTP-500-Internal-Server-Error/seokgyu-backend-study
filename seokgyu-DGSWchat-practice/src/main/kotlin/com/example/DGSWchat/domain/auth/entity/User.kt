package com.example.DGSWchat.domain.auth.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.springframework.data.annotation.CreatedDate
import java.time.LocalDateTime

@Entity
@Table(name = "user_entity")
class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column
    val userName: String,

    @Column
    val password: String,

    @CreatedDate
    @Column
    val createdAt: LocalDateTime = LocalDateTime.now(),

    @Enumerated
    @Column
    val role: Role
)
