package br.com.challenge_forum.challenge_forum.topico;

import br.com.challenge_forum.challenge_forum.curso.DadosCurso;

import java.time.LocalDateTime;

public record DadosCadastroTopico(String titulo, String mensagem, LocalDateTime data, DadosCurso curso) {
}
