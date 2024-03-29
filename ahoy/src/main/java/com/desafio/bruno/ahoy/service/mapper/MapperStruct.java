package com.desafio.bruno.ahoy.service.mapper;

import com.desafio.bruno.ahoy.model.*;
import com.desafio.bruno.ahoy.service.dto.*;
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

    @Mapping(source = "id", target = "id")
    CompraDto modelToDto(Compra regiao);

    @Mapping(source = "id", target = "id")
    Compra dtoToModel(CompraDto compraDto);

    @Mapping(source = "id", target = "id")
    PrecoMedioDto modelToDto(PrecoMedio regiao);

    @Mapping(source = "id", target = "id")
    PrecoMedio dtoToModel(PrecoMedioDto precoMedioDto);

    @Mapping(source = "id", target = "id")
    GeracaoDto modelToDto(Geracao geracao);

    @Mapping(source = "id", target = "id")
    Geracao dtoToModel(GeracaoDto geracaoDto);

    @Mapping(source = "id", target = "id")
    ValorDto modelToDto(Valor valor);

    @Mapping(source = "id", target = "id")
    Valor dtoToModel(ValorDto valorDto);

    @Mapping(source = "id", target = "id")
    AttributesDto modelToDto(Attributes attributes);

    @Mapping(source = "id", target = "id")
    Attributes dtoToModel(AttributesDto attributesDto);
}
