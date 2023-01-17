package com.desafio.bruno.ahoy.rest;

import com.desafio.bruno.ahoy.service.ResourceService;
import com.desafio.bruno.ahoy.service.dto.ResourceDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/agentes")
public class ResourceController {

    @Autowired
    private ResourceService service;

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResourceDto buscarPorid(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ResourceDto> buscarTodos() {
        return service.buscarTodos();
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public ResourceDto adicionar(@RequestBody ResourceDto resource) {

        return service.adicionar(resource);
    }
//    @PostMapping("/todos")
//    @ResponseStatus(HttpStatus.CREATED)
//    public List<Optional<ResourceDto>> adicionarTodos(@RequestBody List<ResourceDto> resources) {
//        return service.adicionarTodos(resources);
//    }

}
