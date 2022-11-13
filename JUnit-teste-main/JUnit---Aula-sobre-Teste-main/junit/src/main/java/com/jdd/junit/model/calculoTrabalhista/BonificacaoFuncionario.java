package com.jdd.junit.model.calculoTrabalhista;

import com.jdd.junit.model.Funcionario;

import java.math.BigDecimal;

public class BonificacaoFuncionario {
    public BigDecimal bonusFuncionario(Funcionario funcionario){
        BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
        if(valor.compareTo(new BigDecimal("1000")) > 0){
            valor = new BigDecimal("1000");
        }//Bonificação de 10% se maior que mil será mil.
        return valor;
    }
}
