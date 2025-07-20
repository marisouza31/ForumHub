package br.com.forumhub.dto.usuario;

import jakarta.validation.constraints.NotBlank;

public record CadastroUsuarioDto(
        @NotBlank
        String email,

        @NotBlank
        String nome,

        @NotBlank
        String senha
) {
}
