package com.javanalta.agendadortarefa.business.mapper;

import com.javanalta.agendadortarefa.business.dto.TarefasDTO;
import com.javanalta.agendadortarefa.infastructure.entity.TarefasEntity;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface TarefaUpdateConverter {

    void updateTarefas (TarefasDTO dto, @MappingTarget TarefasEntity entity);
}
