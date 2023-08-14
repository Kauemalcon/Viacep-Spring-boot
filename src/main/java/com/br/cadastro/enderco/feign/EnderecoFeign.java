package com.br.cadastro.enderco.feign;

import com.br.cadastro.enderco.model.dto.EnderecoResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "https://viacep.com.br/ws/", name = "viacep")
public interface EnderecoFeign {
    @GetMapping("{cep}/json")
    EnderecoResponse buscaEntederecoCep(@PathVariable("cep") String cep);
}
