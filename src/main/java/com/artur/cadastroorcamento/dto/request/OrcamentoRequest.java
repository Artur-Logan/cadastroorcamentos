package com.artur.cadastroorcamento.dto.request;

import lombok.Data;

import java.time.LocalDate;

@Data
public class OrcamentoRequest {

    private String nomeCliente;
    private String cpfCliente;
    private Double valor;
    private LocalDate data;
    private String servico;
    private LocalDate dataExecucao;
}
