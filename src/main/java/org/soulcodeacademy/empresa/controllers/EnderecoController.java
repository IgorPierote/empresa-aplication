package org.soulcodeacademy.empresa.controllers;

import org.soulcodeacademy.empresa.DTO.EnderecoDTO;
import org.soulcodeacademy.empresa.domain.Endereco;
import org.soulcodeacademy.empresa.services.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @GetMapping("/enderecos") // Listagem todos
    public List<Endereco> listar() {
        return this.enderecoService.listar();
    }

    @DeleteMapping("/enderecos/{idEndereco}") // DELETE
    public void deletar(@PathVariable Integer idEndereco) {
        this.enderecoService.deletar(idEndereco);
    }


    @PutMapping("/enderecos/{idEndereco}") // atualizar
    public Endereco atualizar(@PathVariable Integer idEndereco, @Valid @RequestBody EnderecoDTO endereco) {
        Endereco atualizado = this.enderecoService.atualizar(idEndereco, endereco);
        return atualizado; // Resposta para o cliente (cargo atualizado)
    }
}
