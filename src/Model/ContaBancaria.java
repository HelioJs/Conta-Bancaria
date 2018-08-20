/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author Honwana
 */
public abstract class ContaBancaria implements Serializable{
    private String historico;
    private int numeroDeConta;
    private double saldo=0;
    /**
     * Metodo para sacar valor de uma conta
     * @param valor 
     */
    public abstract void sacar(double valor);
    
    /**
     * metodo para depositar valor numa conta
     * @param valor 
     */
    public abstract void depositar(double valor);
    
    public void transferir(ContaBancaria conta, double valor){
        this.sacar(valor);
        conta.depositar(valor);
    }
    public int getNumeroDeConta() {
        return numeroDeConta;
    }

    public void setNumeroDeConta(int numeroDeConta) {
        this.numeroDeConta = numeroDeConta;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
