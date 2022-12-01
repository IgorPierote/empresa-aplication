package org.soulcodeacademy.empresa.services;

import org.soulcodeacademy.empresa.domain.Empregado;
import org.soulcodeacademy.empresa.repositories.EmpregadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpregadoService {
    @Autowired
    private EmpregadoRepository empregadoRepository;

    public List<Empregado> listar() {
        return this.empregadoRepository.findAll();
    }

    // Listar um pelo ID
    public Empregado getEmpregado(Integer idEmpregado) {
        // SELECT * FROM cargo WHERE idCargo = ?
        // Optional = Pode haver cargo ou não
        Optional<Empregado> empregado = this.empregadoRepository.findById(idEmpregado);
        return empregado.get(); // Extrair o cargo de dentro do optional
    }

    public void deletar(Integer idEmpregado) {
        Empregado empregado = this.getEmpregado(idEmpregado);
        // DELETE FROM cargo WHERE idCargo = ?
        this.empregadoRepository.delete(empregado);
    }
}