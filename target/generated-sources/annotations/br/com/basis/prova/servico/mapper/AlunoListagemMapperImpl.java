package br.com.basis.prova.servico.mapper;

import br.com.basis.prova.dominio.Aluno;
import br.com.basis.prova.dominio.dto.AlunoListagemDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-02-28T00:03:15-0300",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_241 (Oracle Corporation)"
)
@Component
public class AlunoListagemMapperImpl implements AlunoListagemMapper {

    @Override
    public Aluno toEntity(AlunoListagemDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Aluno aluno = new Aluno();

        aluno.setId( dto.getId() );
        aluno.setMatricula( dto.getMatricula() );
        aluno.setNome( dto.getNome() );
        aluno.setDataNascimento( dto.getDataNascimento() );

        return aluno;
    }

    @Override
    public AlunoListagemDTO toDto(Aluno entity) {
        if ( entity == null ) {
            return null;
        }

        AlunoListagemDTO alunoListagemDTO = new AlunoListagemDTO();

        alunoListagemDTO.setId( entity.getId() );
        alunoListagemDTO.setNome( entity.getNome() );
        alunoListagemDTO.setMatricula( entity.getMatricula() );
        alunoListagemDTO.setDataNascimento( entity.getDataNascimento() );

        return alunoListagemDTO;
    }

    @Override
    public List<Aluno> toEntity(List<AlunoListagemDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Aluno> list = new ArrayList<Aluno>( dtoList.size() );
        for ( AlunoListagemDTO alunoListagemDTO : dtoList ) {
            list.add( toEntity( alunoListagemDTO ) );
        }

        return list;
    }

    @Override
    public List<AlunoListagemDTO> toDto(List<Aluno> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<AlunoListagemDTO> list = new ArrayList<AlunoListagemDTO>( entityList.size() );
        for ( Aluno aluno : entityList ) {
            list.add( toDto( aluno ) );
        }

        return list;
    }
}
