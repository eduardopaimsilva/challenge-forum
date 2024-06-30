package br.com.challenge_forum.challenge_forum.controller.curso.domain.topico;

import br.com.challenge_forum.challenge_forum.controller.curso.Curso;

import java.time.LocalDateTime;

public record DadosListagemTopico(Long id, String titulo, String mensagem, LocalDateTime data, Curso curso) {

    public DadosListagemTopico(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getData(), topico.getCurso());

    }

}