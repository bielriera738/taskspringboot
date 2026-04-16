package com.example.visites.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "VisitesMediques")
public class VisitaMedica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IdVisita")
    private Long idVisita;

    @Column(name = "Nom_Pacient", length = 40, nullable = false)
    private String nomPacient;

    @Column(name = "Nom_Metge", length = 40, nullable = false)
    private String nomMetge;

    @Column(name = "Data", nullable = false)
    private LocalDate data;

    @Column(name = "Diagnostic", length = 250, nullable = false)
    private String diagnostic;

    // Constructors
    public VisitaMedica() {
    }

    public VisitaMedica(String nomPacient, String nomMetge, LocalDate data, String diagnostic) {
        this.nomPacient = nomPacient;
        this.nomMetge = nomMetge;
        this.data = data;
        this.diagnostic = diagnostic;
    }

    // Getters and Setters
    public Long getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(Long idVisita) {
        this.idVisita = idVisita;
    }

    public String getNomPacient() {
        return nomPacient;
    }

    public void setNomPacient(String nomPacient) {
        this.nomPacient = nomPacient;
    }

    public String getNomMetge() {
        return nomMetge;
    }

    public void setNomMetge(String nomMetge) {
        this.nomMetge = nomMetge;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    @Override
    public String toString() {
        return "VisitaMedica{" +
                "idVisita=" + idVisita +
                ", nomPacient='" + nomPacient + '\'' +
                ", nomMetge='" + nomMetge + '\'' +
                ", data=" + data +
                ", diagnostic='" + diagnostic + '\'' +
                '}';
    }
}
