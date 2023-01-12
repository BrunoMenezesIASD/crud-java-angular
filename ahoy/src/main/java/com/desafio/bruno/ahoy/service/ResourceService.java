package com.desafio.bruno.ahoy.service;

import com.desafio.bruno.ahoy.model.Resource;

import java.util.List;

public interface ResourceService {

    Resource buscarPorId(Long id);

    Resource adicionar(Resource resource);

    List<Resource> adicionarTodos(List<Resource> resource);

    List<Resource> buscarTodos();
}
