package com.javanalta.agendadortarefa.business.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.javanalta.agendadortarefa.infastructure.enums.StatusNotificacaoEnum;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TarefasDTO {

    private String id;
    private String nomeTarefa;
    private String descricao;
    private LocalDateTime dataCriacao;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime dataEvento;
    private String emailUsuario;
    private LocalDateTime dataALteracao;
    private StatusNotificacaoEnum statusNotificacaoEnum;
}
