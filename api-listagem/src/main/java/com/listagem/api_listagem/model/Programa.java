package com.listagem.api_listagem.model;


import jakarta.persistence.*;

@Entity
@Table(name = "Programa")
public class Programa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigoPrograma;

    public void setCodigoPrograma(int codigoPrograma) {
        this.codigoPrograma = codigoPrograma;
    }

    public void setNomePrograma(String nomePrograma) {
        this.nomePrograma = nomePrograma;
    }


    public void setNomeAbreviadoPrograma(String nomeAbreviadoPrograma) {
        this.nomeAbreviadoPrograma = nomeAbreviadoPrograma;
    }



    @Column(name = "nomeAbreviadoPrograma")
    private String nomeAbreviadoPrograma;

    @Column(name = "nomePrograma")
    private String nomePrograma;



    public int getCodigoPrograma(){
        return codigoPrograma;
    }

    public String getNomePrograma(){
        return nomePrograma;
    }

    public String getNomeAbreviadoPrograma() {
        return nomeAbreviadoPrograma;
    }
}
