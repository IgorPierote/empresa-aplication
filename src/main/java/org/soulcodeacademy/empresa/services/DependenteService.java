package org.soulcodeacademy.empresa.services;

import org.soulcodeacademy.empresa.domain.Dependente;
import org.soulcodeacademy.empresa.repositories.DependenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DependenteService {

    @Autowired
    private DependenteRepository dependenteRepository;

    public List<Dependente> listar() {
        return this.dependenteRepository.findAll();
    }

    // Listar um pelo ID
    public Dependente getDependente(Integer idDependente) {
        // SELECT * FROM cargo WHERE idCargo = ?
        Optional<Dependente> dependente = this.dependenteRepository.findById(idDependente);
        return dependente.get(); // Extrair o cargo de dentro do optional
    }

    public void deletar(Integer idDependente) {
        Dependente dependente = this.getDependente(idDependente);
        // DELETE FROM cargo WHERE idCargo = ?
        this.dependenteRepository.delete(dependente);
    }
}
