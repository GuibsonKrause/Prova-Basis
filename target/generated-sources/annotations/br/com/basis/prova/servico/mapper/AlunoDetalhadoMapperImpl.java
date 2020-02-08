package br.com.basis.prova.servico.mapper;

import br.com.basis.prova.dominio.Aluno;
import br.com.basis.prova.dominio.dto.AlunoDetalhadoDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-02-06T20:54:53-0300",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_232 (Oracle Corporation)"
)
@Component
public class AlunoDetalhadoMapperImpl implements AlunoDetalhadoMapper {

    @Autowired
    private DisciplinaListagemMapper disciplinaListagemMapper;

    @Override
    public Aluno toEntity(AlunoDetalhadoDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Aluno aluno = new Aluno();

        aluno.setId( dto.getId() );
        aluno.setMatricula( dto.getMatricula() );
        aluno.setNome( dto.getNome() );
        aluno.setDisciplinas( disciplinaListagemMapper.toEntity( dto.getDisciplinas() ) );

        return aluno;
    }

    @Override
    public AlunoDetalhadoDTO toDto(Aluno entity) {
        if ( entity == null ) {
            return null;
        }

        AlunoDetalhadoDTO alunoDetalhadoDTO = new AlunoDetalhadoDTO();

        alunoDetalhadoDTO.setId( entity.getId() );
        alunoDetalhadoDTO.setNome( entity.getNome() );
        alunoDetalhadoDTO.setMatricula( entity.getMatricula() );
        alunoDetalhadoDTO.setDisciplinas( disciplinaListagemMapper.toDto( entity.getDisciplinas() ) );

        return alunoDetalhadoDTO;
    }

    @Override
    public List<Aluno> toEntity(List<AlunoDetalhadoDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Aluno> list = new ArrayList<Aluno>( dtoList.size() );
        for ( AlunoDetalhadoDTO alunoDetalhadoDTO : dtoList ) {
            list.add( toEntity( alunoDetalhadoDTO ) );
        }

        return list;
    }

    @Override
    public List<AlunoDetalhadoDTO> toDto(List<Aluno> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<AlunoDetalhadoDTO> list = new ArrayList<AlunoDetalhadoDTO>( entityList.size() );
        for ( Aluno aluno : entityList ) {
            list.add( toDto( aluno ) );
        }

        return list;
    }
}
