package com.fatec.team.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatec.team.entities.Time;

public interface TimeRepository extends JpaRepository<Time, Long> {

}
