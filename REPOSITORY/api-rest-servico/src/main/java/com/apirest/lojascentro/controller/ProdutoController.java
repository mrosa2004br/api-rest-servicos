package com.apirest.lojascentro.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.lojascentro.model.Produto;
import com.apirest.lojascentro.repository.ProdutoRepository;

/**
 * 
 * @author Marcos Rosa
 *
 */

@RestController
@RequestMapping(value = "/lojasCentro")
public class ProdutoController {
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	@GetMapping("/produtos")
	public List<Produto> listaProdutos () {
		
		return produtoRepository.findAll();
	}
		
	@GetMapping("/produto/{id}") 
	public Optional<Produto> produtoFindId( @PathVariable(value="id") Integer id) {
	  
	  return produtoRepository.findById(id);
	  
	}
	
	@PostMapping("/produto")
	public Produto produtoSave(@RequestBody Produto produto) {
		
		return produtoRepository.save(produto);
	}
	 
	@DeleteMapping("/produto")
	public void produtoDelete(@RequestBody Produto produto) {
		
		produtoRepository.delete(produto);
	}
	
	@PutMapping("/produto")
	public Produto produtoUpdate(@RequestBody Produto produto) {
		
		return produtoRepository.save(produto);
	}
	
}
