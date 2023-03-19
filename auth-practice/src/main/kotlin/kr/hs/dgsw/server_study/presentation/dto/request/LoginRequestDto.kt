package kr.hs.dgsw.server_study.presentation.dto.request

data class LoginRequestDto(
    val name: String,
    val password: String
)