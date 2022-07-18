package com.artur.cadastroorcamento.dto.response;

import lombok.Data;

import java.time.LocalDate;

@Data
public class OrcamentoResponse {

    private Long id;
    private String nomeCliente;
    private String cpfCliente;
    private Double valor;
    private LocalDate data;
    private String servico;
    private LocalDate dataExecucao;
}
