package com.jdd.junit;

import com.jdd.junit.model.Funcionario;
import com.jdd.junit.model.calculoTrabalhista.BonificacaoFuncionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootTest
class JunitApplicationTests {

	@Test
	void somaValores() {
		Calculadora cal = new Calculadora();//Objeto
		float soma = cal.somar(100, 50);//Envio parametros
		Assertions.assertEquals(150, soma);//teste
	}

	@Test
	void bonificacaoFuncionario() {
		BonificacaoFuncionario Bonifica = new BonificacaoFuncionario();
		//Simulação todas as ações do objeto como nome, data e renda
		BigDecimal bonus =  Bonifica.bonusFuncionario(new Funcionario("Fulano", LocalDate.now(), new BigDecimal("50000")));
		//Coloquei um caso onde o funcionario não recebe bonus
		Assertions.assertEquals(new BigDecimal("1000"), bonus);
	}
}