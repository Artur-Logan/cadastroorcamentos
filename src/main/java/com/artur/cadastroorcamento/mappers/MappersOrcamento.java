package com.artur.cadastroorcamento.mappers;

import com.artur.cadastroorcamento.dto.request.OrcamentoRequest;
import com.artur.cadastroorcamento.dto.response.OrcamentoResponse;
import com.artur.cadastroorcamento.entities.Orcamento;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface MappersOrcamento {

    Orcamento toEntity(OrcamentoRequest orcamentoRequest);
    OrcamentoResponse toResponse(Orcamento orcamento);
    Orcamento uptade(OrcamentoRequest orcamentoRequest, @MappingTarget Orcamento orcamento);

}
