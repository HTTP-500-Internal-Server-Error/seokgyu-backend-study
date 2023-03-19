package kr.hs.dgsw.server_study.service

import kr.hs.dgsw.server_study.domain.User
import kr.hs.dgsw.server_study.domain.repository.UserRepository
import kr.hs.dgsw.server_study.presentation.dto.request.LoginRequestDto
import kr.hs.dgsw.server_study.presentation.dto.request.RegisterRequestDto
import org.springframework.stereotype.Service

@Service
class AuthServiceImpl(
    private val userRepository: UserRepository
) : AuthService {

    override fun register(registerRequestDto: RegisterRequestDto) {

        if (userRepository.existsByName(registerRequestDto.name))
            throw Exception()

        userRepository.save(User(
            name = registerRequestDto.name,
            password = registerRequestDto.password
        ))
    }

    override fun login(loginRequestDto: LoginRequestDto) {
        val user: User = userRepository.findByName(loginRequestDto.name)
            .orElseThrow { Exception() }

        if (user.password.equals(loginRequestDto.password).not()) {
            throw Exception()
        }
    }
}