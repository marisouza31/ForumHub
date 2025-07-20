package br.com.forumhub.dto.security;

public record AuthDto(
        String email,
        String senha
) {
}
