package com.desafio.bruno.ahoy.service.mapper;

import com.desafio.bruno.ahoy.model.Resource;
import com.desafio.bruno.ahoy.service.dto.ResourceDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@ComponentScan
@Component
public class ResourceMapper {

    private static ModelMapper mapper;

    @Autowired
    public void setModelMapper(ModelMapper mapper) {
        ResourceMapper.mapper = mapper;
    }

    public Resource toEntity(ResourceDto resourceRequest){
        return mapper.map(resourceRequest,Resource.class);
    }

    public void mapToEntity(ResourceDto resourceDto, Resource resource) {
        mapper.map(resourceDto,resource);

    }

    public List<Resource> mapToCollectionDomain(List<ResourceDto> resourceDto) {
        return resourceDto.stream()
                .map(Resource -> toEntity(Resource))
                .collect(Collectors.toList());
    }


}
