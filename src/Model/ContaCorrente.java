/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 * Classe para conta corrente
 *@see  ContaBancaria
 * @author Honwana
 */
public class ContaCorrente extends ContaBancaria implements Imprimivel,Serializable{
    private double taxaDeOperacao=0.0001;
    @Override
    public void sacar(double valor) {
        double c=this.getSaldo()-valor-valor*taxaDeOperacao;
        if(c>=0){
            this.setSaldo(c);
            JOptionPane.showMessageDialog(null,"Valor sacado com sucesso");
        } else{
            JOptionPane.showMessageDialog(null,"Saldo Insuficiente");
        }    
    }

    public double getTaxaDeOperacao() {
        return taxaDeOperacao;
    }

    public void setTaxaDeOperacao(double taxaDeOperacao) {
        this.taxaDeOperacao = taxaDeOperacao;
    }
    
    @Override
    public void depositar(double valor) {
        double c=this.getSaldo()+valor-valor*taxaDeOperacao;
        this.setSaldo(c);
        JOptionPane.showMessageDialog(null,"Valor depositado com sucesso");
    }    

    @Override
    public void mostrarDados() {
        JOptionPane.showMessageDialog(null,"Conta Numero: "+this.getNumeroDeConta()+" Historico: "+this.getHistorico()+" Saldo: "+this.getSaldo()+" Taxa da operacao: "+ this.getTaxaDeOperacao());
    }
}
