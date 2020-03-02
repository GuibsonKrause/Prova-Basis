package br.com.basis.prova.servico;

import br.com.basis.prova.dominio.Disciplina;
import br.com.basis.prova.dominio.Professor;
import br.com.basis.prova.dominio.dto.DisciplinaDTO;
import br.com.basis.prova.dominio.dto.DisciplinaDetalhadaDTO;
import br.com.basis.prova.dominio.dto.DisciplinaListagemDTO;
import br.com.basis.prova.repositorio.DisciplinaRepositorio;
import br.com.basis.prova.repositorio.ProfessorRepositorio;
import br.com.basis.prova.servico.exception.RegraNegocioException;
import br.com.basis.prova.servico.mapper.DisciplinaDetalhadaMapper;
import br.com.basis.prova.servico.mapper.DisciplinaListagemMapper;
import br.com.basis.prova.servico.mapper.DisciplinaMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class DisciplinaServico {

    @Autowired
    private DisciplinaRepositorio disciplinaRepositorio;
    private DisciplinaMapper disciplinaMapper;

    @Autowired
    private DisciplinaListagemMapper disciplinaListagemMapper;

    @Autowired
    private ProfessorRepositorio professorRepositorio;

    @Autowired
    private DisciplinaDetalhadaMapper disciplinaDetalhadaMapper;

    public DisciplinaServico(DisciplinaMapper disciplinaMapper, DisciplinaRepositorio disciplinaRepositorio) {
        this.disciplinaMapper = disciplinaMapper;
        this.disciplinaRepositorio = disciplinaRepositorio;
    }

    public DisciplinaDTO salvar(DisciplinaDTO disciplinaDTO) {
        Disciplina disciplina = disciplinaMapper.toEntity(disciplinaDTO);

        if(verificarNome(disciplina))
            throw new RegraNegocioException("Este nome já existe!");

        return disciplinaMapper.toDto(disciplinaRepositorio.save(disciplina));
    }

    public void excluir(Integer id) {
        disciplinaRepositorio.deleteById(id);
    }

    public List<DisciplinaListagemDTO> consultar() {
        return disciplinaListagemMapper.toDto(disciplinaRepositorio.findAll());
    }

    public DisciplinaDetalhadaDTO detalhar(Integer id) {
        Disciplina disciplina = disciplinaRepositorio.findById(id).orElseThrow(() -> new RegraNegocioException("Registro não encontrado"));
        return disciplinaDetalhadaMapper.toDto(disciplina);
    }

    private boolean verificarNome(Disciplina disciplina) {
        Disciplina disciplinaNome = disciplinaRepositorio.findByNome(disciplina.getNome());
        return !(disciplinaNome == null || disciplinaNome.getId().equals(disciplina.getId()));
    }

}
