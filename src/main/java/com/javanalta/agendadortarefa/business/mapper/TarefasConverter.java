package com.javanalta.agendadortarefa.business.mapper;

import com.javanalta.agendadortarefa.business.dto.TarefasDTO;
import com.javanalta.agendadortarefa.infastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TarefasConverter {

    TarefasEntity paraTarefaEntity(TarefasDTO dto);

    TarefasDTO paraTarefaDTO(TarefasEntity entity);
}
