package br.com.basis.prova.servico.mapper;

import br.com.basis.prova.dominio.Disciplina;
import br.com.basis.prova.dominio.Professor;
import br.com.basis.prova.dominio.dto.DisciplinaDetalhadaDTO;
import br.com.basis.prova.dominio.dto.ProfessorDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-03-02T02:03:35-0300",
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
        disciplina.setCargaHoraria( dto.getCargaHoraria() );
        disciplina.setProfessor( professorDTOToProfessor( dto.getProfessor() ) );

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
        disciplinaDetalhadaDTO.setCargaHoraria( entity.getCargaHoraria() );
        disciplinaDetalhadaDTO.setProfessor( professorToProfessorDTO( entity.getProfessor() ) );

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

    protected Professor professorDTOToProfessor(ProfessorDTO professorDTO) {
        if ( professorDTO == null ) {
            return null;
        }

        Professor professor = new Professor();

        professor.setId( professorDTO.getId() );
        professor.setNome( professorDTO.getNome() );
        professor.setMatricula( professorDTO.getMatricula() );
        professor.setArea( professorDTO.getArea() );
        professor.setDataNascimento( professorDTO.getDataNascimento() );

        return professor;
    }

    protected ProfessorDTO professorToProfessorDTO(Professor professor) {
        if ( professor == null ) {
            return null;
        }

        ProfessorDTO professorDTO = new ProfessorDTO();

        professorDTO.setId( professor.getId() );
        professorDTO.setNome( professor.getNome() );
        professorDTO.setMatricula( professor.getMatricula() );
        professorDTO.setArea( professor.getArea() );
        professorDTO.setDataNascimento( professor.getDataNascimento() );

        return professorDTO;
    }
}
