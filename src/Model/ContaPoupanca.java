/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author Honwana
 */
public class ContaPoupanca extends ContaBancaria implements Imprimivel,Serializable{
    private double limite=-2000;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    @Override
    public void sacar(double valor) {
      if(valor>0){  
        double c=this.getSaldo()-valor;
        if(c>=limite){
            this.setSaldo(c);
            JOptionPane.showMessageDialog(null,"Valor sacado com sucesso");
        } else{
            JOptionPane.showMessageDialog(null,"Impossivel executar esta operacao");
        }
      }else{
          JOptionPane.showMessageDialog(null,"Impossivel sacar valores negativos");
      }  
    }
    @Override
    public void depositar(double valor) {
        if(valor>0){
        double c=this.getSaldo()+valor;
        this.setSaldo(c);
        JOptionPane.showMessageDialog(null,"Valor depositado com sucesso");
        }else{
            JOptionPane.showMessageDialog(null,"Nao e possivel depositar valores inferiores ou iguais a zero");
        }
    }

    @Override
    public void mostrarDados() {
            JOptionPane.showMessageDialog(null,"Conta Numero: "+this.getNumeroDeConta()+" Historico: "+this.getHistorico()+" Saldo: "+this.getSaldo()+" Limite: "+ this.getLimite());
    }
    
}
