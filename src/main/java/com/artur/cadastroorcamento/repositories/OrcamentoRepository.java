package com.artur.cadastroorcamento.repositories;

import com.artur.cadastroorcamento.entities.Orcamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrcamentoRepository extends JpaRepository<Orcamento, Long> {
}
