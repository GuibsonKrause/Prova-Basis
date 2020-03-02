package br.com.basis.prova.servico.mapper;

import br.com.basis.prova.dominio.Professor;
import br.com.basis.prova.dominio.dto.ProfessorDetalhadoDTO;
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
public class ProfessorDetalhadoMapperImpl implements ProfessorDetalhadoMapper {

    @Override
    public Professor toEntity(ProfessorDetalhadoDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Professor professor = new Professor();

        professor.setId( dto.getId() );

        return professor;
    }

    @Override
    public ProfessorDetalhadoDTO toDto(Professor entity) {
        if ( entity == null ) {
            return null;
        }

        ProfessorDetalhadoDTO professorDetalhadoDTO = new ProfessorDetalhadoDTO();

        professorDetalhadoDTO.setId( entity.getId() );

        return professorDetalhadoDTO;
    }

    @Override
    public List<Professor> toEntity(List<ProfessorDetalhadoDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Professor> list = new ArrayList<Professor>( dtoList.size() );
        for ( ProfessorDetalhadoDTO professorDetalhadoDTO : dtoList ) {
            list.add( toEntity( professorDetalhadoDTO ) );
        }

        return list;
    }

    @Override
    public List<ProfessorDetalhadoDTO> toDto(List<Professor> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ProfessorDetalhadoDTO> list = new ArrayList<ProfessorDetalhadoDTO>( entityList.size() );
        for ( Professor professor : entityList ) {
            list.add( toDto( professor ) );
        }

        return list;
    }
}
