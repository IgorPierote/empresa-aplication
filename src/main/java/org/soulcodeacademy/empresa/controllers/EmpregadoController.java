package org.soulcodeacademy.empresa.controllers;

import org.soulcodeacademy.empresa.domain.Empregado;
import org.soulcodeacademy.empresa.services.EmpregadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpregadoController {
    @Autowired
    private EmpregadoService empregadoService;

    @GetMapping("/empregados") // Metodo de Listagem todos
    public List<Empregado> listar() {
        return this.empregadoService.listar();
    }


    @DeleteMapping("/empregados/{idEmpregado}") // Verbo DELETE no /cargos/1
    public void deletar(@PathVariable Integer idEmpregado) {
        this.empregadoService.deletar(idEmpregado);
    }
}
