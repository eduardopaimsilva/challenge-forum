package br.com.challenge_forum.challenge_forum.controller;


import br.com.challenge_forum.challenge_forum.curso.Curso;
import br.com.challenge_forum.challenge_forum.topico.DadosCadastroTopico;
import br.com.challenge_forum.challenge_forum.topico.DadosListagemTopico;
import br.com.challenge_forum.challenge_forum.topico.Topico;
import br.com.challenge_forum.challenge_forum.topico.TopicoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroTopico dados ){
        repository.save(new Topico(dados));

    }
    @GetMapping
    public Page<DadosListagemTopico> listar(Pageable paginacao){
        return repository.findAll(paginacao).map(DadosListagemTopico::new);

    }
}
