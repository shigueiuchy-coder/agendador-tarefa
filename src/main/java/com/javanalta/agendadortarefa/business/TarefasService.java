package com.javanalta.agendadortarefa.business;

import com.javanalta.agendadortarefa.business.dto.TarefasDTO;
import com.javanalta.agendadortarefa.business.mapper.TarefasConverter;
import com.javanalta.agendadortarefa.infastructure.entity.TarefasEntity;
import com.javanalta.agendadortarefa.infastructure.enums.StatusNotificacaoEnum;
import com.javanalta.agendadortarefa.infastructure.repository.TarefasRepository;
import com.javanalta.agendadortarefa.infastructure.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class TarefasService {

    private final TarefasRepository tarefasRepository;
    private final TarefasConverter tarefasConverter;
    private final JwtUtil jwtUtil;

    public TarefasDTO gravarTarefa(String token, TarefasDTO dto){
        String email = jwtUtil.extrairEmailToken(token.substring(7));
        dto.setDataCriacao(LocalDateTime.now());
        dto.setStatusNotificacaoEnum(StatusNotificacaoEnum.PENDENTE);
        dto.setEmailUsuario(email);
       TarefasEntity entity =  tarefasConverter.paraTarefaEntity(dto);

        return tarefasConverter.paraTarefaDTO(
                tarefasRepository.save(entity));
    }


}
