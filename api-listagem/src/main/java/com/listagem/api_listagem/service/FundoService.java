package com.listagem.api_listagem.service;
import com.listagem.api_listagem.model.Fundo;
import com.listagem.api_listagem.repository.FundoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.listagem.api_listagem.dto.FundoDTO;
import java.util.ArrayList;
import java.util.List;

@Service
public class FundoService {
@Autowired
private FundoRepository fundoRepository;


    public List<FundoDTO> listarFundos() {
        List<Fundo> fundos = fundoRepository.findAll();
        List<FundoDTO> dtos = new ArrayList<>();

        for (Fundo fundo : fundos) {
            FundoDTO dto = new FundoDTO();
            dto.setCodigoFundo(fundo.getCodigoFundo());
            dto.setNomeFundo(fundo.getNomeFundo());
            dto.setNomeAbreviadoFundo(fundo.getNomeAbreviadoFundo());
            dtos.add(dto);
        }

        return dtos;
    }
}