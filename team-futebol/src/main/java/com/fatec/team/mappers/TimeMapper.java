package com.fatec.team.mappers;

import com.fatec.team.dtos.TimeRequest;
import com.fatec.team.dtos.TimeResponse;
import com.fatec.team.entities.Time;

public class TimeMapper {

    public static Time toEntity(TimeRequest request) {
        Time t = new Time();
        t.setNome(request.nome());
        t.setSigla(request.sigla());
        t.setCidade(request.cidade());
        t.setEstado(request.estado());
        t.setAnoFundacao(request.anoFundacao());
        t.setTecnico(request.tecnico());

        return t;
    }

    public static TimeResponse toDTO(Time time) {
        return new TimeResponse(
            time.getId(),
            time.getNome(),
            time.getSigla(),
            time.getCidade(),
            time.getEstado(),
            time.getAnoFundacao(),
            time.getTecnico()
        );
    }
}
