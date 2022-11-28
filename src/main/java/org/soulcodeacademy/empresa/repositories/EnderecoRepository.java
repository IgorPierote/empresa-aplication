package org.soulcodeacademy.empresa.repositories;

import org.soulcodeacademy.empresa.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
}
