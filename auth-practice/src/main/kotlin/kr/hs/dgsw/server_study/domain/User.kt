package kr.hs.dgsw.server_study.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import lombok.AllArgsConstructor
import lombok.Builder

@Entity
@Table(name = "user_entity")
class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     val id: Long = 0,

    @Column
     val name: String,

    @Column
     val password: String
)