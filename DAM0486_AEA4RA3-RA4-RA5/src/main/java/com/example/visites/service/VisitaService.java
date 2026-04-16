package com.example.visites.service;

import com.example.visites.model.VisitaMedica;
import com.example.visites.repository.VisitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class VisitaService {

    @Autowired
    private VisitaRepository visitaRepository;

    /**
     * Llistar totes les visites mèdiques
     */
    public List<VisitaMedica> llistar() {
        return visitaRepository.findAll();
    }

    /**
     * Guardar una nova visita o actualitzar-la
     */
    public VisitaMedica guardar(VisitaMedica visita) {
        return visitaRepository.save(visita);
    }

    /**
     * Obtenir una visita per ID
     */
    public VisitaMedica obtenirPerId(Long id) {
        Optional<VisitaMedica> visita = visitaRepository.findById(id);
        return visita.orElse(null);
    }

    /**
     * Eliminar una visita per ID
     */
    public void eliminar(Long id) {
        visitaRepository.deleteById(id);
    }

    /**
     * Existeix una visita amb aquest ID
     */
    public boolean existeix(Long id) {
        return visitaRepository.existsById(id);
    }
}
