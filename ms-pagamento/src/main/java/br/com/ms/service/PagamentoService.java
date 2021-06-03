package br.com.ms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.com.ms.model.Pagamento;
import br.com.ms.repository.PagamentoRepository;

@Service
public class PagamentoService {

	@Autowired
	private PagamentoRepository repository;
	
	public List<Pagamento> lista() {
		return this.repository.findAll();
	}
}
