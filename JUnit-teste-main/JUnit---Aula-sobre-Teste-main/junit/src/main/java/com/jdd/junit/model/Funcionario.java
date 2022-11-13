package com.jdd.junit.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Funcionario {
	private String nome;
	private LocalDate dataAdmissao;
	private BigDecimal salario;
}
