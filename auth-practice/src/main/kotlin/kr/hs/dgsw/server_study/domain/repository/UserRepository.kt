package kr.hs.dgsw.server_study.domain.repository

import kr.hs.dgsw.server_study.domain.User
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface UserRepository : JpaRepository<User, Long> {
    fun findByName(name: String): Optional<User>

    fun existsByName(name: String): Boolean
}