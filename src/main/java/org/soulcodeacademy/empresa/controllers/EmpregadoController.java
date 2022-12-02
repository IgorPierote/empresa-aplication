package org.soulcodeacademy.empresa.controllers;

import org.soulcodeacademy.empresa.DTO.EmpregadoDTO;
import org.soulcodeacademy.empresa.domain.Empregado;
import org.soulcodeacademy.empresa.services.EmpregadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class EmpregadoController {
    @Autowired
    private EmpregadoService empregadoService;

    @GetMapping("/empregados") // Metodo de Listagem todos
    public List<Empregado> listar() {
        return this.empregadoService.listar();
    }


    @DeleteMapping("/empregados/{idEmpregado}") // Verbo DELETE
    public void deletar(@PathVariable Integer idEmpregado) {
        this.empregadoService.deletar(idEmpregado);
    }

    @PutMapping("/empregados/{idEmpregado}") // atualizar
    public Empregado atualizar(@PathVariable Integer idEmpregado, @Valid @RequestBody EmpregadoDTO empregado) {
        Empregado atualizado = this.empregadoService.atualizar(idEmpregado, empregado);
        return atualizado; // Resposta para o cliente (cargo atualizado)
    }
}
