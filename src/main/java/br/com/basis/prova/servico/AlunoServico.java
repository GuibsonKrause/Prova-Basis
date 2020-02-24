package br.com.basis.prova.servico;

import br.com.basis.prova.dominio.Aluno;
import br.com.basis.prova.dominio.dto.AlunoDTO;
import br.com.basis.prova.dominio.dto.AlunoDetalhadoDTO;
import br.com.basis.prova.repositorio.AlunoRepositorio;
import br.com.basis.prova.servico.exception.RegraNegocioException;
import br.com.basis.prova.servico.mapper.AlunoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class AlunoServico {

    private AlunoMapper alunoMapper;

    @Autowired
    private AlunoRepositorio alunoRepositorio;

    public AlunoServico(AlunoMapper alunoMapper, AlunoRepositorio alunoRepositorio) {
        this.alunoMapper = alunoMapper;
        this.alunoRepositorio = alunoRepositorio;
    }

    public AlunoDTO salvar(AlunoDTO alunoDTO) {
        Aluno aluno = alunoMapper.toEntity(alunoDTO);

        if(verificarCPF(aluno)){
            throw new RegraNegocioException("CPF já existe");
        }

        if(verificarMatricula(aluno)){
            throw new RegraNegocioException("Matrícula já existe");
        }

        return alunoMapper.toDto(alunoRepositorio.save(aluno));
    }

    private boolean verificarCPF(Aluno aluno) {
        Aluno alunoCpf = alunoRepositorio.findByCpf(aluno.getCpf());
        return !(alunoCpf == null || alunoCpf.getId().equals(aluno.getId()));
    }

    private boolean verificarMatricula(Aluno aluno) {
        Aluno alunoMatricula = alunoRepositorio.findByMatricula(aluno.getMatricula());
        return !(alunoMatricula == null || alunoMatricula.getId().equals(aluno.getId()));
    }

    public void excluir(String matricula) {
        Aluno objAluno = new Aluno();
        objAluno = alunoRepositorio.findByMatricula(matricula);
        //if (objAluno.getDisciplinas().contains())
            alunoRepositorio.delete(objAluno);
    }

    public List<AlunoDTO> consultar() {
        List alunos = new ArrayList<AlunoDTO>();
        return alunos = alunoRepositorio.findAll();
    }

    public AlunoDetalhadoDTO detalhar(Integer id) {
        Aluno aluno = alunoRepositorio.findById(id).orElseThrow(() -> new RegraNegocioException("Registro não encontrado"));
        return new AlunoDetalhadoDTO();
    }

}
