package com.listagem.api_listagem.controller;


import com.listagem.api_listagem.dto.FundoDTO;
import com.listagem.api_listagem.service.FundoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//diz ao Spring "essa classe responde requisições HTTP e devolve JSON".
@RequestMapping("/fundos")
// define a URL base do controller path
public class FundoController {
    @Autowired
    private FundoService fundoService;

    @GetMapping //diz ao Spring "quando chegar
    // uma requisição HTTP GET em /fundos execute esse metodo

    // o metodo é público e devolve uma lista de DTOs —
    //  que o Spring automaticamente converte para JSON
    //  antes de mandar na resposta
   public  List<FundoDTO> listarFundos() {
       return fundoService.listarFundos();
    }
}
