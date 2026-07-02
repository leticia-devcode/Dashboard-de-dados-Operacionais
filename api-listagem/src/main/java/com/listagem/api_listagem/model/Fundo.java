package com.listagem.api_listagem.model;

import jakarta.persistence.*;

@Entity
@Table(name = "fundos")
public class Fundo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigoFundo;

    public void setCodigoFundo(Long codigoFundo) {
        this.codigoFundo = codigoFundo;
    }

    public void setNomeFundo(String nomeFundo) {
        this.nomeFundo = nomeFundo;
    }

    public void setNomeAbreviadoFundo(String nomeAbreviadoFundo) {
        this.nomeAbreviadoFundo = nomeAbreviadoFundo;
    }

    @Column(name = "nomeFundo")
    private String nomeFundo;

    @Column(name = "nomeAbreviadoFundo")
    private String nomeAbreviadoFundo;

    public Long getCodigoFundo() {
        return codigoFundo;
    }

    public String getNomeFundo(){
        return nomeFundo;
    }

    public String getNomeAbreviadoFundo(){
        return nomeAbreviadoFundo;
    }
}
