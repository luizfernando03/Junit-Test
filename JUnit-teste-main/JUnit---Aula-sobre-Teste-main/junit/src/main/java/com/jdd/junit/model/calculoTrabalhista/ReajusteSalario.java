package com.jdd.junit.model.calculoTrabalhista;

import com.jdd.junit.model.Funcionario;
import com.jdd.junit.model.enuns.DesempenhoFuncionario;

import java.math.BigDecimal;

public class ReajusteSalario {
    public void concederReajuste(Funcionario funcionario, DesempenhoFuncionario desempenho) {
        if(desempenho == DesempenhoFuncionario.A_Desejar){
            BigDecimal valorADD = funcionario.getSalario().multiply(new BigDecimal("0.03"));
            BigDecimal reajuste = funcionario.getSalario().add(valorADD);
            funcionario.setSalario(reajuste);
        }
    }
}
