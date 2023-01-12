package com.desafio.bruno.ahoy.service;

import com.desafio.bruno.ahoy.model.Resource;
import com.desafio.bruno.ahoy.repository.ResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ResourceServiceImpl implements ResourceService{


    @Autowired
    ResourceRepository repository;

    @Override
    public Resource buscarPorId(Long id) {
        return null;
    }

    @Override
    @Transactional
    public Resource adicionar(Resource resource) {
        return repository.save(resource);
    }

    @Override
    @Transactional
    public List<Resource> adicionarTodos(List<Resource> resource) {
        return repository.saveAll(resource);
    }

    @Override
    public List<Resource> buscarTodos() {
        return repository.findAll();
    }

}
