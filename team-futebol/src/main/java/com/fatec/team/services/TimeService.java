package com.fatec.team.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fatec.team.dtos.TimeRequest;
import com.fatec.team.dtos.TimeResponse;
import com.fatec.team.entities.Time;
import com.fatec.team.mappers.TimeMapper;
import com.fatec.team.repositories.TimeRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class TimeService {

    private final TimeRepository repository;

    TimeService(TimeRepository repository) {
        this.repository = repository;
    }

    public List<TimeResponse> findAll() {
        return repository.findAll()
                         .stream()
                         .map(TimeMapper::toDTO)
                         .toList();
    }

    public TimeResponse findById(Long id) {
        Time t = repository.findById(id)
                  .orElseThrow(() -> new EntityNotFoundException("Time não cadastrado"));
        return TimeMapper.toDTO(t);
    }

    public void deleteById(Long id) {
        if (repository.existsById(id))
            repository.deleteById(id);
        else
            throw new EntityNotFoundException("Time não cadastrado");
    }

    public TimeResponse save(TimeRequest time) {
        Time t = repository.save(TimeMapper.toEntity(time));
        return TimeMapper.toDTO(t);
    }

    public void update(TimeRequest time, Long id) {
        Time t = repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Time não cadastrado"));

        t.setNome(time.nome());
        t.setSigla(time.sigla());
        t.setCidade(time.cidade());
        t.setEstado(time.estado());
        t.setAnoFundacao(time.anoFundacao());
        t.setTecnico(time.tecnico());

        repository.save(t);
    }

}
