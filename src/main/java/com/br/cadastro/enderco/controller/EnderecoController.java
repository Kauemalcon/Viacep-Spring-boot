package com.br.cadastro.enderco.controller;

import com.br.cadastro.enderco.model.dto.EnderecoRequest;
import com.br.cadastro.enderco.service.EnderecoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/endereco")
public class EnderecoController {

    private final EnderecoService enderecoService;
    @GetMapping("/consulta")
    public ResponseEntity consultarCep(@RequestBody EnderecoRequest enderecoRequest){

        return ResponseEntity.ok(enderecoService.executa(enderecoRequest));
    }

}
