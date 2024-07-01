package br.com.challenge_forum.challenge_forum.domain.topico;

import br.com.challenge_forum.challenge_forum.domain.curso.DadosCurso;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DadosCadastroTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensagem,

        LocalDateTime data,
        @Valid
        @NotNull
        DadosCurso curso) {
}
