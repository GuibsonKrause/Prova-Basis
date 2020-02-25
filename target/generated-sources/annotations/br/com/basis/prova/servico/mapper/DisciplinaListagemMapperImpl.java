package br.com.basis.prova.servico.mapper;

import br.com.basis.prova.dominio.Disciplina;
import br.com.basis.prova.dominio.dto.DisciplinaListagemDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-02-24T18:41:15-0300",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_232 (Oracle Corporation)"
)
@Component
public class DisciplinaListagemMapperImpl implements DisciplinaListagemMapper {

    @Override
    public Disciplina toEntity(DisciplinaListagemDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Disciplina disciplina = new Disciplina();

        disciplina.setId( dto.getId() );
        disciplina.setNome( dto.getNome() );
        disciplina.setDescricao( dto.getDescricao() );
        disciplina.setCargaHoraria( dto.getCargaHoraria() );

        return disciplina;
    }

    @Override
    public DisciplinaListagemDTO toDto(Disciplina entity) {
        if ( entity == null ) {
            return null;
        }

        DisciplinaListagemDTO disciplinaListagemDTO = new DisciplinaListagemDTO();

        disciplinaListagemDTO.setId( entity.getId() );
        disciplinaListagemDTO.setNome( entity.getNome() );
        disciplinaListagemDTO.setCargaHoraria( entity.getCargaHoraria() );
        disciplinaListagemDTO.setDescricao( entity.getDescricao() );

        return disciplinaListagemDTO;
    }

    @Override
    public List<Disciplina> toEntity(List<DisciplinaListagemDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Disciplina> list = new ArrayList<Disciplina>( dtoList.size() );
        for ( DisciplinaListagemDTO disciplinaListagemDTO : dtoList ) {
            list.add( toEntity( disciplinaListagemDTO ) );
        }

        return list;
    }

    @Override
    public List<DisciplinaListagemDTO> toDto(List<Disciplina> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<DisciplinaListagemDTO> list = new ArrayList<DisciplinaListagemDTO>( entityList.size() );
        for ( Disciplina disciplina : entityList ) {
            list.add( toDto( disciplina ) );
        }

        return list;
    }
}
