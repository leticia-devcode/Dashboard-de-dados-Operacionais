package com.listagem.api_listagem.dto;

public class ProgramaDTO {
    private int codigoPrograma;
    private String nomePrograma;
    private String nomeAbreviadoPrograma;

    public int getCodigoPrograma() {
        return codigoPrograma;
    }

    public void setCodigoPrograma(int codigoPrograma) {
        this.codigoPrograma = codigoPrograma;
    }

    public String getNomePrograma(){
        return nomePrograma;
    }

    public void setNomePrograma(String nomePrograma){ this.nomePrograma = nomePrograma;}

    public String getNomeAbreviadoPrograma(){
        return nomeAbreviadoPrograma;
    }

    public void setNomeAbreviadoPrograma(String nomeAbreviadoPrograma) {
        this.nomeAbreviadoPrograma = nomeAbreviadoPrograma;
    }
}




