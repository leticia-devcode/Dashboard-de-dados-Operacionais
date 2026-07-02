package com.listagem.api_listagem.service;

import com.listagem.api_listagem.dto.ProgramaDTO;
import com.listagem.api_listagem.model.Programa;
import com.listagem.api_listagem.repository.ProgramaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProgramaService {
    @Autowired
    private ProgramaRepository programaRepository;

    public List<ProgramaDTO> listarProgramas(){
        List<Programa> programas = programaRepository.findAll();
        List<ProgramaDTO> dtos = new ArrayList<>();

        for (Programa programa : programas) {
            ProgramaDTO dto = new ProgramaDTO();
            dto.setCodigoPrograma(programa.getCodigoPrograma());
            dto.setNomePrograma(programa.getNomePrograma());
            dto.setNomeAbreviadoPrograma(programa.getNomeAbreviadoPrograma());
            dtos.add(dto);
        }
        return dtos;
    }
}
