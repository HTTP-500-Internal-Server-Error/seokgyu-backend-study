package kr.hs.dgsw.server_study.service

import kr.hs.dgsw.server_study.presentation.dto.request.LoginRequestDto
import kr.hs.dgsw.server_study.presentation.dto.request.RegisterRequestDto

interface AuthService {
    fun login(loginRequestDto: LoginRequestDto)

    fun register(registerRequestDto: RegisterRequestDto)
}