package br.com.basis.prova.servico;

import br.com.basis.prova.dominio.Aluno;
import br.com.basis.prova.dominio.Disciplina;
import br.com.basis.prova.dominio.Professor;
import br.com.basis.prova.dominio.dto.AlunoDTO;
import br.com.basis.prova.dominio.dto.ProfessorDTO;
import br.com.basis.prova.dominio.dto.ProfessorDetalhadoDTO;
import br.com.basis.prova.dominio.dto.ProfessorListagemDTO;
import br.com.basis.prova.repositorio.DisciplinaRepositorio;
import br.com.basis.prova.repositorio.ProfessorRepositorio;
import br.com.basis.prova.servico.exception.RegraNegocioException;
import br.com.basis.prova.servico.mapper.ProfessorListagemMapper;
import br.com.basis.prova.servico.mapper.ProfessorMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ProfessorServico {

    @Autowired
    private ProfessorRepositorio professorRepositorio;
    private ProfessorMapper professorMapper;

    @Autowired
    private DisciplinaRepositorio disciplinaRepositorio;

    @Autowired
    private ProfessorListagemMapper professorListagemMapper;

    public ProfessorServico(ProfessorMapper professorMapper, ProfessorRepositorio professorRepositorio) {
        this.professorMapper = professorMapper;
        this.professorRepositorio = professorRepositorio;
    }

    public ProfessorDTO salvar(ProfessorDTO professorDTO) {
        Professor professor = professorMapper.toEntity(professorDTO);

        if (verificarMatricula(professor))
            throw new RegraNegocioException("Matrícula já existe");

        return professorMapper.toDto(professorRepositorio.save(professor));
    }

    public void excluir(String matricula) {
        Professor objProfessor = new Professor();

        objProfessor = professorRepositorio.findByMatricula(matricula);
        professorRepositorio.delete(objProfessor);
    }

    public List<ProfessorListagemDTO> consultar() {
        return professorListagemMapper.toDto(professorRepositorio.findAll());
    }

    public ProfessorDetalhadoDTO detalhar(Integer id) {
        return new ProfessorDetalhadoDTO();
    }

    private boolean verificarMatricula(Professor professor) {
        Professor professorMatricula = professorRepositorio.findByMatricula(professor.getMatricula());
        return !(professorMatricula == null || professorMatricula.getId().equals(professor.getId()));
    }

}
