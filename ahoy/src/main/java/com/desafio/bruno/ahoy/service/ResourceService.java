package com.desafio.bruno.ahoy.service;

import com.desafio.bruno.ahoy.service.dto.ResourceDto;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@ComponentScan
public interface ResourceService {

    ResourceDto buscarPorId(Long id);

    ResourceDto adicionar(ResourceDto resource);

//    List<Optional<ResourceDto>> adicionarTodos(List<ResourceDto> resource);
//
//    List<Optional<ResourceDto>> adicionarTodos(List<Resources> resourcesList);
//
    List<ResourceDto> buscarTodos();
}
