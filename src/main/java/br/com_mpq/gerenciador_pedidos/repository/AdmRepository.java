package br.com_mpq.gerenciador_pedidos.repository;

import br.com_mpq.gerenciador_pedidos.domain.adm.Adm;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdmRepository extends JpaRepository<Adm, Long> {
}
