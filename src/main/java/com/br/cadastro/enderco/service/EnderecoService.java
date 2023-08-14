package com.br.cadastro.enderco.service;

import com.br.cadastro.enderco.feign.EnderecoFeign;
import com.br.cadastro.enderco.model.dto.EnderecoRequest;
import com.br.cadastro.enderco.model.dto.EnderecoResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor
@Service
public class EnderecoService {

    private final EnderecoFeign enderecoFeign;
    public EnderecoResponse executa(EnderecoRequest request){
        return enderecoFeign.buscaEntederecoCep(request.getCep());

    }
}
