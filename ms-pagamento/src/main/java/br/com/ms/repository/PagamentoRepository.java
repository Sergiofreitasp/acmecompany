package br.com.ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ms.model.Pagamento;


@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Long>{

}
