package com.desafio.bruno.ahoy.service.mapper;

import com.desafio.bruno.ahoy.model.Agentes;
import com.desafio.bruno.ahoy.model.Regiao;
import com.desafio.bruno.ahoy.model.Resources;
import com.desafio.bruno.ahoy.service.dto.AgentesDto;
import com.desafio.bruno.ahoy.service.dto.RegiaoDto;
import com.desafio.bruno.ahoy.service.dto.ResourceDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@Mapper
public interface MapperStruct {

    MapperStruct INTANCE = Mappers.getMapper(MapperStruct.class);

    @Mapping(source = "declaration", target = "_declaration")
    ResourceDto modelToDto(Resources resource);

    @Mapping(source = "_declaration", target = "declaration")
    Resources dtoToModel(ResourceDto resourceDto);

    @Mapping(source = "agentes", target = "_agentes")
    AgentesDto modelToDto(Agentes agentes);

    @Mapping(source = "_agentes", target = "agentes")
    Agentes dtoToModel(AgentesDto agentesDto);

    @Mapping(source = "attributes", target = "_attributes")
    RegiaoDto modelToDto(Regiao regiao);

    @Mapping(source = "_attributes", target = "attributes")
    Regiao dtoToModel(RegiaoDto regiaoDto);

}
