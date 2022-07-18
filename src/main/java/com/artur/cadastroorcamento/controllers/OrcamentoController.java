package com.artur.cadastroorcamento.controllers;

import com.artur.cadastroorcamento.dto.request.OrcamentoRequest;
import com.artur.cadastroorcamento.dto.response.OrcamentoResponse;
import com.artur.cadastroorcamento.entities.Orcamento;
import com.artur.cadastroorcamento.services.OrcamentoService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/orcamentos")
@RestController
@RequiredArgsConstructor
public class OrcamentoController {

    private final OrcamentoService orcamentoService;

    @GetMapping
    public ResponseEntity<List<OrcamentoResponse>> listarTodos(){
        List<OrcamentoResponse> orcamentoResponses = orcamentoService.listarTodos();

        return ResponseEntity.ok().body(orcamentoResponses);
    }

    @PostMapping
    public ResponseEntity<OrcamentoResponse> inserir(@RequestBody OrcamentoRequest orcamentoRequest){
        OrcamentoResponse orcamentoResponse = orcamentoService.inserir(orcamentoRequest);

        return ResponseEntity.ok().body(orcamentoResponse);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        orcamentoService.deletar(id);

        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<OrcamentoResponse> obter(@PathVariable Long id){
        OrcamentoResponse orcamentoResponse = orcamentoService.obter(id);

        return ResponseEntity.ok().body(orcamentoResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<OrcamentoResponse> atualizar(@PathVariable Long id, OrcamentoRequest orcamentoRequest){
        OrcamentoResponse orcamentoResponse = orcamentoService.atualizar(id, orcamentoRequest);

        return ResponseEntity.ok().body(orcamentoResponse);
    }
}
