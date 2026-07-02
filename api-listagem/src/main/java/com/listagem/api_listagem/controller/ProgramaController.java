package com.listagem.api_listagem.controller;


import com.listagem.api_listagem.dto.ProgramaDTO;
import com.listagem.api_listagem.service.ProgramaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@RequestMapping("/programa")
public class ProgramaController {
    @Autowired
    private ProgramaService programaService;

    @GetMapping
    public List<ProgramaDTO> listarPrograma(){
        return programaService.listarProgramas();
    }


}
