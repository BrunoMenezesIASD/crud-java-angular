package com.desafio.bruno.ahoy.repository;

import com.desafio.bruno.ahoy.model.Resources;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResourceRepository extends JpaRepository<Resources,Long> {

    List<Resources> findAllByNome(String nome);

    Resources findByIdOrderByNome(Long id);




}
