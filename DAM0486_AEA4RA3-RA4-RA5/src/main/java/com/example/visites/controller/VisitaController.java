package com.example.visites.controller;

import com.example.visites.model.VisitaMedica;
import com.example.visites.service.VisitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class VisitaController {

    @Autowired
    private VisitaService servei;

    /**
     * Llistar totes les visites mèdiques
     */
    @GetMapping("/")
    public String llistar(Model model) {
        model.addAttribute("visites", servei.llistar());
        return "index";
    }

    /**
     * Mostrar formulari per crear nova visita
     */
    @GetMapping("/nova")
    public String mostrarFormulari(Model model) {
        model.addAttribute("visita", new VisitaMedica());
        return "form";
    }

    /**
     * Guardar una nova visita o actualitzar-la
     */
    @PostMapping("/guardar")
    public String guardar(@ModelAttribute VisitaMedica visita) {
        servei.guardar(visita);
        return "redirect:/";
    }

    /**
     * Mostrar formulari per editar una visita
     */
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        VisitaMedica visita = servei.obtenirPerId(id);
        if (visita != null) {
            model.addAttribute("visita", visita);
            return "form";
        }
        return "redirect:/";
    }

    /**
     * Eliminar una visita
     */
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        if (servei.existeix(id)) {
            servei.eliminar(id);
        }
        return "redirect:/";
    }
}
