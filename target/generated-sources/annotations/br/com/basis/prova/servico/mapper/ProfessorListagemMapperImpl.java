package br.com.basis.prova.servico.mapper;

import br.com.basis.prova.dominio.Professor;
import br.com.basis.prova.dominio.dto.ProfessorListagemDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-03-01T23:59:30-0300",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_241 (Oracle Corporation)"
)
@Component
public class ProfessorListagemMapperImpl implements ProfessorListagemMapper {

    @Override
    public Professor toEntity(ProfessorListagemDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Professor professor = new Professor();

        professor.setId( dto.getId() );
        professor.setNome( dto.getNome() );
        professor.setMatricula( dto.getMatricula() );
        professor.setArea( dto.getArea() );
        professor.setDataNascimento( dto.getDataNascimento() );

        return professor;
    }

    @Override
    public ProfessorListagemDTO toDto(Professor entity) {
        if ( entity == null ) {
            return null;
        }

        ProfessorListagemDTO professorListagemDTO = new ProfessorListagemDTO();

        professorListagemDTO.setId( entity.getId() );
        professorListagemDTO.setNome( entity.getNome() );
        professorListagemDTO.setMatricula( entity.getMatricula() );
        professorListagemDTO.setArea( entity.getArea() );
        professorListagemDTO.setDataNascimento( entity.getDataNascimento() );

        return professorListagemDTO;
    }

    @Override
    public List<Professor> toEntity(List<ProfessorListagemDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Professor> list = new ArrayList<Professor>( dtoList.size() );
        for ( ProfessorListagemDTO professorListagemDTO : dtoList ) {
            list.add( toEntity( professorListagemDTO ) );
        }

        return list;
    }

    @Override
    public List<ProfessorListagemDTO> toDto(List<Professor> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ProfessorListagemDTO> list = new ArrayList<ProfessorListagemDTO>( entityList.size() );
        for ( Professor professor : entityList ) {
            list.add( toDto( professor ) );
        }

        return list;
    }
}
