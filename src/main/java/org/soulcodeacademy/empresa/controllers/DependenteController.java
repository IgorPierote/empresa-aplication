package org.soulcodeacademy.empresa.controllers;

import org.soulcodeacademy.empresa.domain.Dependente;
import org.soulcodeacademy.empresa.services.DependenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DependenteController {

    @Autowired
    private DependenteService dependenteService;

    @GetMapping("/dependentes") // Metodo de Listagem todos
    public List<Dependente> listar() {
        return this.dependenteService.listar();
    }


    @DeleteMapping("/dependentes/{idDependente}") //DELETE
    public void deletar(@PathVariable Integer idDependente) {
        this.dependenteService.deletar(idDependente);
    }
}

