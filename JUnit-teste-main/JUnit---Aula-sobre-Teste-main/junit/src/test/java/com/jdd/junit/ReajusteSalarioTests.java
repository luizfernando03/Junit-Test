package com.jdd.junit;

import com.jdd.junit.model.Funcionario;
import com.jdd.junit.model.calculoTrabalhista.ReajusteSalario;
import com.jdd.junit.model.enuns.DesempenhoFuncionario;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootTest
class ReajusteSalarioTests {

	@Test
	void reajusteTresPorcentoADesejar() {
		//Não as classe mas penso que existe class ReajusteSalario e Enum DesempenhoFuncionaio
		ReajusteSalario reajusteSalario = new ReajusteSalario();
		Funcionario funcionario = new Funcionario("Chapolin", LocalDate.now(), new BigDecimal("1000"));
		reajusteSalario.concederReajuste(funcionario, DesempenhoFuncionario.A_Desejar);
		Assertions.assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
	}
}