package com.finan.orcamento.interfaces;

import com.finan.orcamento.model.OrcamentoModel;

public interface OrcamentoService {

    void createOrcamento(OrcamentoModel orcamento);

    OrcamentoModel getOrcamentoById(Long id);

    void updateOrcamento(OrcamentoModel orcamento);

    void deleteOrcamento(Long id);
}