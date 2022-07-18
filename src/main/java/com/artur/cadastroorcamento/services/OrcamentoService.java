package com.artur.cadastroorcamento.services;

import com.artur.cadastroorcamento.dto.request.OrcamentoRequest;
import com.artur.cadastroorcamento.dto.response.OrcamentoResponse;
import com.artur.cadastroorcamento.entities.Orcamento;
import com.artur.cadastroorcamento.mappers.MappersOrcamento;
import com.artur.cadastroorcamento.repositories.OrcamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrcamentoService {

    private final OrcamentoRepository orcamentoRepository;
    private final MappersOrcamento mappersOrcamento;

    public OrcamentoResponse inserir(OrcamentoRequest orcamentoRequest){
        Orcamento orcamento = mappersOrcamento.toEntity(orcamentoRequest);

        orcamentoRepository.save(orcamento);

        return mappersOrcamento.toResponse(orcamento);
    }

    public OrcamentoResponse obter(Long id){
        Orcamento orcamento = orcamentoRepository.findById(id).get();

        return mappersOrcamento.toResponse(orcamento);
    }

    public void deletar(Long id){
        Orcamento orcamento = orcamentoRepository.findById(id).get();

        orcamentoRepository.delete(orcamento);
    }

    public OrcamentoResponse atualizar(Long id, OrcamentoRequest orcamentoRequest){
        Orcamento orcamento = orcamentoRepository.findById(id).get();

        mappersOrcamento.uptade(orcamentoRequest, orcamento);

        return mappersOrcamento.toResponse(orcamento);
    }

    public List<OrcamentoResponse> listarTodos(){
        List<Orcamento> orcamentoList = orcamentoRepository.findAll();

        return orcamentoList.stream().map(mappersOrcamento::toResponse).collect(Collectors.toList());
    }
}
