package com.listagem.api_listagem.dto;

public class FundoDTO {

    private Long codigoFundo;
    private String nomeFundo;
    private String nomeAbreviadoFundo;

    public Long getCodigoFundo() {
        return codigoFundo;
    }

    public void setCodigoFundo(Long codigoFundo) {
        this.codigoFundo = codigoFundo;
    }

    public String getNomeFundo() {
        return nomeFundo;
    }

    public void setNomeFundo(String nomeFundo) {
        this.nomeFundo = nomeFundo;
    }

    public String getNomeAbreviadoFundo() {
        return nomeAbreviadoFundo;
    }

    public void setNomeAbreviadoFundo(String nomeAbreviadoFundo) {
        this.nomeAbreviadoFundo = nomeAbreviadoFundo;
    }
}