package br.com.joaov.usuario.infrastructure.repository;


import br.com.joaov.usuario.infrastructure.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EndercoRepository extends JpaRepository<Endereco,Long> {
}
