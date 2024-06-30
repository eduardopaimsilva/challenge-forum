package br.com.challenge_forum.challenge_forum.controller.curso;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Curso {
    private String curso;
    @Enumerated(EnumType.STRING)
    private Categoria categoria;

    public Curso(DadosCurso dados) {
        this.categoria = dados.categoria();
        this.curso = dados.Curso();
    }
}
