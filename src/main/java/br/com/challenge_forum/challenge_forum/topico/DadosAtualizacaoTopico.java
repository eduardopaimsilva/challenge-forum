package br.com.challenge_forum.challenge_forum.topico;

import br.com.challenge_forum.challenge_forum.curso.Curso;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DadosAtualizacaoTopico(
        @NotNull
        Long id,
        String titulo,
        String mensagem ) {
}
