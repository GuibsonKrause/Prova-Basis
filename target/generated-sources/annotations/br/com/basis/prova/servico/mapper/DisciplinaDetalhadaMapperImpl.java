package br.com.basis.prova.servico.mapper;

import br.com.basis.prova.dominio.Disciplina;
import br.com.basis.prova.dominio.dto.DisciplinaDetalhadaDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-03-01T23:33:48-0300",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_241 (Oracle Corporation)"
)
@Component
public class DisciplinaDetalhadaMapperImpl implements DisciplinaDetalhadaMapper {

    @Override
    public Disciplina toEntity(DisciplinaDetalhadaDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Disciplina disciplina = new Disciplina();

        disciplina.setId( dto.getId() );
        disciplina.setNome( dto.getNome() );

        return disciplina;
    }

    @Override
    public DisciplinaDetalhadaDTO toDto(Disciplina entity) {
        if ( entity == null ) {
            return null;
        }

        DisciplinaDetalhadaDTO disciplinaDetalhadaDTO = new DisciplinaDetalhadaDTO();

        disciplinaDetalhadaDTO.setId( entity.getId() );
        disciplinaDetalhadaDTO.setNome( entity.getNome() );

        return disciplinaDetalhadaDTO;
    }

    @Override
    public List<Disciplina> toEntity(List<DisciplinaDetalhadaDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Disciplina> list = new ArrayList<Disciplina>( dtoList.size() );
        for ( DisciplinaDetalhadaDTO disciplinaDetalhadaDTO : dtoList ) {
            list.add( toEntity( disciplinaDetalhadaDTO ) );
        }

        return list;
    }

    @Override
    public List<DisciplinaDetalhadaDTO> toDto(List<Disciplina> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<DisciplinaDetalhadaDTO> list = new ArrayList<DisciplinaDetalhadaDTO>( entityList.size() );
        for ( Disciplina disciplina : entityList ) {
            list.add( toDto( disciplina ) );
        }

        return list;
    }
}
