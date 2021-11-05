package br.edu.iftm.encapsulamento.classes.testes;

import br.edu.iftm.encapsulamento.classes.Banco;
//import br.edu.iftm.encapsulamento.classes.Cliente;
import br.edu.iftm.encapsulamento.classes.Conta;

public class BancoTestes{

    public static void main(String[] args) {

        Banco banco = new Banco("CAIXA", 10);
        banco.iniciar();
        
        /*banco.abrirConta();

        Conta c1 = banco.buscarConta(1);
        banco.realizaOperacao("deposito", c1, null, 100d);
        System.out.println("Saldo : " + c1.getSaldo());

        c1 = banco.buscarConta(1);
        System.out.println("Saldo : " + c1.getSaldo());*/

        /*Cliente c1 = new Cliente("Cornelius", null, "12345678910",27, 10, 1981);
        Cliente c2 = new Cliente("Telemaco", "Pisistrato", "11111231111", 19, 8, 2000);

        Conta conta1 = new Conta(c1); 
        System.out.println("\nO número de contas C1 é: " + conta1.getTotalDeContas());
        Conta conta2 = new Conta(2, c2);
        System.out.println("O número de contas C2 é: " + conta2.getTotalDeContas());

        conta1.setNumero(1);
        Cliente aux = conta1.getCliente();
        System.out.println(aux.getNome());
        //System.out.println((conta1.getCliente()).getNome());
        System.out.println(conta1.getNumero());

        System.out.println();

        System.out.println((conta2.getCliente()).getNome());
        System.out.println(conta2.getNumero());

        conta1.depositar(100d);
        System.out.println(conta1.sacar(50d));

        System.out.println("\nSaldo da conta 1: " + conta1.getSaldo());
        System.out.println("Saldo da conta 2: " + conta2.getSaldo());
        conta1.transferir(conta2, 50d);
        System.out.println("Valores após a transferência:");
        System.out.println("\nSaldo da conta 1: " + conta1.getSaldo());
        System.out.println("Saldo da conta 2: " + conta2.getSaldo());*/

        

    }

}