package br.com.basis.prova.dominio;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "DISCIPLINA")
@Getter
@Setter
@NoArgsConstructor
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Column(name = "NOME", nullable = false)
    private String nome;

    @Column(name = "DESCRICAO", nullable = false)
    private String descricao;

    @Column(name = "CARGAHORARIA", nullable = false)
    private Integer cargaHoraria;

    @Column(name = "ATIVA", nullable = true)
    private Integer ativa;

    @ManyToOne
    @JoinColumn(name="ProfessorFK")
    private Professor professor;

/*
    @ManyToMany
    @JoinTable(name = "DISCIPLINA PROFESSOR",
            joinColumns = @JoinColumn(name = "ID_DISCIPLINA", referencedColumnName = "ID"),
            inverseJoinColumns= @JoinColumn(name = "ID_PROFESSOR", referencedColumnName = "ID"))
    private List<Professor> professor = new ArrayList<>();*/

}
