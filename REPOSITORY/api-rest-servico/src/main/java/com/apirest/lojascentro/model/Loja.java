package com.apirest.lojascentro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * @author Marcos Rosa
 */
import lombok.Data;

@Data
@Entity
@Table(name = "loja", schema = "dbo")
public class Loja {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "loja_id")
	private int lojaId;
	
	@Column(name = "loja_name")
	private String lojaName;

}
