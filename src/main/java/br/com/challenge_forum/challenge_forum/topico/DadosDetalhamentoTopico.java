package br.com.challenge_forum.challenge_forum.topico;

import br.com.challenge_forum.challenge_forum.curso.Curso;

import java.time.LocalDateTime;

public record DadosDetalhamentoTopico(Long id, String titulo, String mensagem, LocalDateTime data, Curso curso) {

    public DadosDetalhamentoTopico(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getData(), topico.getCurso());
    }
}
