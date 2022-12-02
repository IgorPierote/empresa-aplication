package org.soulcodeacademy.empresa.repositories;

import org.soulcodeacademy.empresa.domain.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {
    @Override
    List<Endereco> findAllById(Iterable<Integer> integers);
}
