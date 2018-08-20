/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Honwana
 */
public class Teste {
    public static void main(String[] args) {
        ContaCorrente contacorrente=new ContaCorrente();
        ContaPoupanca contapoupanca=new ContaPoupanca();
        contacorrente.setHistorico("kklk");
        contacorrente.setNumeroDeConta(0324773532);
        contacorrente.setSaldo(45);
        
        contapoupanca.setHistorico("kksdsa");
        contapoupanca.setNumeroDeConta(3324324);
        contapoupanca.setSaldo(34);
        
        contacorrente.depositar(5000);
        contapoupanca.depositar(5000);
        
        contacorrente.sacar(500);
        contapoupanca.sacar(6000);
        
        Relatorio relatorio=new Relatorio();
        relatorio.gerarRelatorio(contapoupanca);
        relatorio.gerarRelatorio(contacorrente);
    }
}
