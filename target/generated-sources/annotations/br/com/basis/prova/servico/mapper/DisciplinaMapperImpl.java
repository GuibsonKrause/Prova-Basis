package br.com.basis.prova.servico.mapper;

import br.com.basis.prova.dominio.Disciplina;
import br.com.basis.prova.dominio.dto.DisciplinaDTO;
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
public class DisciplinaMapperImpl implements DisciplinaMapper {

    @Override
    public Disciplina toEntity(DisciplinaDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Disciplina disciplina = new Disciplina();

        disciplina.setId( dto.getId() );
        disciplina.setNome( dto.getNome() );
        disciplina.setDescricao( dto.getDescricao() );
        disciplina.setCargaHoraria( dto.getCargaHoraria() );
        disciplina.setAtiva( dto.getAtiva() );
        disciplina.setProfessor( dto.getProfessor() );

        return disciplina;
    }

    @Override
    public DisciplinaDTO toDto(Disciplina entity) {
        if ( entity == null ) {
            return null;
        }

        DisciplinaDTO disciplinaDTO = new DisciplinaDTO();

        disciplinaDTO.setId( entity.getId() );
        disciplinaDTO.setNome( entity.getNome() );
        disciplinaDTO.setDescricao( entity.getDescricao() );
        disciplinaDTO.setCargaHoraria( entity.getCargaHoraria() );
        disciplinaDTO.setAtiva( entity.getAtiva() );
        disciplinaDTO.setProfessor( entity.getProfessor() );

        return disciplinaDTO;
    }

    @Override
    public List<Disciplina> toEntity(List<DisciplinaDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Disciplina> list = new ArrayList<Disciplina>( dtoList.size() );
        for ( DisciplinaDTO disciplinaDTO : dtoList ) {
            list.add( toEntity( disciplinaDTO ) );
        }

        return list;
    }

    @Override
    public List<DisciplinaDTO> toDto(List<Disciplina> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<DisciplinaDTO> list = new ArrayList<DisciplinaDTO>( entityList.size() );
        for ( Disciplina disciplina : entityList ) {
            list.add( toDto( disciplina ) );
        }

        return list;
    }
}
