package com.desafio.bruno.ahoy.rest;

import com.desafio.bruno.ahoy.model.Resource;
import com.desafio.bruno.ahoy.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/agentes")
public class ResourceController {

    @Autowired
    private ResourceService service;

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Resource buscarPorid(@PathVariable Long id) {
        Resource resource = new Resource();
        return resource = service.buscarPorId(id);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Resource> buscarTodos() {
        List<Resource> resources = new ArrayList<>();
        return resources = service.buscarTodos();
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public Resource adicionarEndereco(@RequestBody Resource resource) {
        return service.adicionar(resource);
    }
    @PostMapping("/todos")
    @ResponseStatus(HttpStatus.CREATED)
    public List<Resource> adicionarEndereco(@RequestBody List<Resource> resources) {
        return service.adicionarTodos(resources);
    }

}
