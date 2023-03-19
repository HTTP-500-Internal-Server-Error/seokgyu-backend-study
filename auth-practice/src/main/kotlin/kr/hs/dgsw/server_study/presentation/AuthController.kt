package kr.hs.dgsw.server_study.presentation

import kr.hs.dgsw.server_study.presentation.dto.request.LoginRequestDto
import kr.hs.dgsw.server_study.presentation.dto.request.RegisterRequestDto
import kr.hs.dgsw.server_study.service.AuthService
import kr.hs.dgsw.server_study.service.AuthServiceImpl
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/auth")
class AuthController(
    private val authService: AuthService
) {

    @PostMapping("/register")
    fun register(@RequestBody registerRequestDto: RegisterRequestDto): Boolean {
        authService.register(registerRequestDto)

        return true
    }

    @PostMapping("/login")
    fun login(@RequestBody loginRequestDto: LoginRequestDto): Boolean {
        authService.login(loginRequestDto)

        return true
    }
}