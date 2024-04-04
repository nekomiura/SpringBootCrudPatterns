package com.finan.orcamento.proxy;

import com.finan.orcamento.model.OrcamentoModel;
import com.finan.orcamento.service.OrcamentoService;
import org.springframework.stereotype.Service;

@Service
public class OrcamentoServiceProxy extends OrcamentoService {

    private final OrcamentoService realService;

    public OrcamentoServiceProxy(OrcamentoService realService) {
        this.realService = realService;
    }

    private boolean primeiraChamada = true; //testa se é a primeira chamada do get

    @Override
    public OrcamentoModel getOrcamentoById(Long id) {
        if (primeiraChamada) {
            try {
                Thread.sleep(300);//300 milisegundos = 3 segundos
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            primeiraChamada= false;
        }
        return realService.getOrcamentoById(id);
    }
}