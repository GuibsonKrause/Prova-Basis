package br.com.basis.prova.dominio.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
public class ProfessorDTO { // DTO usado para salvar e editar um professor
    private Integer id;
    private String nome;
    private String matricula;
    private String area;
    private LocalDate dataNascimento;

}
