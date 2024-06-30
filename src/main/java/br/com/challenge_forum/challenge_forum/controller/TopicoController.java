package br.com.challenge_forum.challenge_forum.controller;

import br.com.challenge_forum.challenge_forum.topico.*;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroTopico dados ){
        repository.save(new Topico(dados));

    }
    @GetMapping
    public Page<DadosListagemTopico> listar(Pageable paginacao){
        return repository.findAll(paginacao).map(DadosListagemTopico::new);

    }
    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoTopico dados){
        var topico  = repository.getReferenceById(dados.id());
        topico.atualizarInformacoes(dados);

    }
    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id){
        repository.deleteById(id);

    }
}
