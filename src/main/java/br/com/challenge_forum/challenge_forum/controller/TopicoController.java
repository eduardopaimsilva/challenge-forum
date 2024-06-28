package br.com.challenge_forum.challenge_forum.controller;


import br.com.challenge_forum.challenge_forum.curso.Curso;
import br.com.challenge_forum.challenge_forum.topico.DadosCadastroTopico;
import br.com.challenge_forum.challenge_forum.topico.Topico;
import br.com.challenge_forum.challenge_forum.topico.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("topicos")
public class TopicoController {

    @Autowired
    private TopicoRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroTopico dados ){
        repository.save(new Topico(dados));

    }
}
