package com.desafio.bruno.ahoy.service;

import com.desafio.bruno.ahoy.repository.ResourceRepository;
import com.desafio.bruno.ahoy.service.dto.ResourceDto;
import com.desafio.bruno.ahoy.service.mapper.MapperStruct;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@ComponentScan
@Service
public class ResourcesServiceImpl implements ResourceService{

    @Autowired
    ResourceRepository repository;

    @Autowired
    ModelMapper mapper;

    MapperStruct mapperStruct;

    @Override
    public ResourceDto buscarPorId(Long id) {
        return  mapperStruct.modelToDto(repository.findByIdOrderByNome(id));
    }


    @Override
    public ResourceDto adicionar(ResourceDto resource) {

        return mapperStruct.modelToDto(repository.save(mapperStruct.dtoToModel(resource)));
    }
//
//    @Override
//    public List<Optional<ResourceDto>> adicionarTodos(List<Resources> resourcesList) {
//        List<Optional<Resources>> retornoResourcesList = new ArrayList<>();
//        resourcesList.forEach(item ->{
//            retornoResourcesList.add(mapperStruct.modelToDto(repository.save(item)));
//        });
//        return mapperStruct.modelToDto();
//    }
//
    @Override
    public List<ResourceDto> buscarTodos() {
        List<ResourceDto> list = new ArrayList<>();
        repository.findAll().forEach(item -> {
            list.add(mapperStruct.modelToDto(item));});
        return list;
    }
}
