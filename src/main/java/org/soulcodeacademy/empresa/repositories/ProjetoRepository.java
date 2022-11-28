package org.soulcodeacademy.empresa.repositories;

import org.soulcodeacademy.empresa.domain.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<Projeto, Integer> {
}
