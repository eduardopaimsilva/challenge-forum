package br.com.challenge_forum.challenge_forum.controller.curso.domain.topico;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoTopico(
        @NotNull
        Long id,
        String titulo,
        String mensagem ) {
}
