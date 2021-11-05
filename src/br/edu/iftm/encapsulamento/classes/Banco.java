package br.edu.iftm.encapsulamento.classes;

import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;

public class Banco {
    private int indice;
    private String nome;
    private Conta[] vetorContas;

        public Banco (){
            vetorContas = new Conta[10];
        }

        public Banco (String nome, int numeroDeContas){
            this.nome = nome;
            vetorContas = new Conta[numeroDeContas];
        }

        public void abrirConta(){
            Cliente cl = cadastroCliente();
            Conta c = new Conta(cl);
            c.setNumero(c.getTotalDeContas());
            this.vetorContas[indice] = c;
            indice ++;
        }

        private String inputDados(String msg){
            String temp = JOptionPane.showInputDialog(null, msg);
            return temp;
        }

        private Cliente cadastroCliente(){
            String nome = inputDados("Digite o nome do Cliente: ");
            String sobrenome = inputDados("Digite o sobrenome do Cliente: ");
            String cpf = inputDados("Digite o CPF do Cliente: ");
            String temp = inputDados("Digite o dia do nascimento do Cliente: ");
            int dia = Integer.parseInt(temp);
            temp = inputDados( "Digite o mes do nascimento do Cliente: ");
            int mes = Integer.parseInt(temp);
            temp = inputDados( "Digite o ano do nascimento do Cliente: ");
            int ano = Integer.parseInt(temp);
            Cliente c = new Cliente(nome, sobrenome, cpf, dia, mes, ano);
            return c;
        }

        public Conta buscarConta(int numero){
            for (Conta conta : vetorContas) {
                if (conta.getNumero() == numero){
                    return conta;
                }
            }
            return null;
        }

        public boolean operacaoSaque(Conta conta, double valor){
            return conta.sacar(valor);
        }

        public boolean operacaoDeposito(Conta conta, double valor){
            return conta.depositar(valor);
        }

        public boolean operacaoTransferir(Conta conta, double valor, Conta destino){
            return conta.transferir(destino, valor);
        }
        //** 
        public double mostraSaldo(Conta conta){
            return conta.mostrar();
        }

        public int realizaOperacao(){
            System.out.println("Menu:");
            System.out.println("1 - Abrir conta ");
            System.out.println("2 - Efetuar saque ");
            System.out.println("3 - Efetuar depósito ");
            System.out.println("4 - Efetuar transferência ");
            System.out.println("5 - Visualizar saldo ");
            System.out.println("0 - Sair ");
            String temp = inputDados("Qual opção deseja escolher? ");
            int opcao = Integer.parseInt(temp);

            if (opcao ==1){
                abrirConta();
            }else if(opcao == 2){
                temp = inputDados("Digite o numero da conta ");
                Integer numero = Integer.parseInt(temp);
                Conta c = buscarConta(numero);
                if (c != null){
                    temp = inputDados("Digite o valor do saque: ");
                    double valor  = Double.parseDouble(temp);
                    operacaoSaque(c, valor);
                }
            }else if(opcao == 3){
                temp = inputDados("Digite o numero da conta de destino:");
                Integer numero = Integer.parseInt(temp);
                Conta c = buscarConta(numero);
                if (c != null){
                    temp = inputDados("Digite o valor do depósito: ");
                    double valor  = Double.parseDouble(temp);
                    operacaoDeposito(c, valor);
                }
            }else if (opcao == 4){
                temp = inputDados("Digite o numero da conta de origem: ");
                Integer numero = Integer.parseInt(temp);
                Conta c = buscarConta(numero);
                temp = inputDados("Digite o numero da conta de destino: ");
                numero = Integer.parseInt(temp);
                Conta d = buscarConta(numero);
                if (c != null && d != null){
                    temp = inputDados("Digite o valor do depósito: ");
                    double valor  = Double.parseDouble(temp);
                    operacaoTransferir(c, valor, d);
                }
                //**
            }else if (opcao == 5){
                temp = inputDados("Digite o número da conta");
                Integer numero = Integer.parseInt(temp);
                Conta c = buscarConta(numero);
                if (c != null){
                    JOptionPane.showMessageDialog(null, mostraSaldo(c), "Saldo Atual", JOptionPane.INFORMATION_MESSAGE);
                    //System.out.println("Saldo atual: " + mostraSaldo(c));
                }else{
                    JOptionPane.showMessageDialog(null, "Conta Inexistente!", "Operação Inválida", JOptionPane.INFORMATION_MESSAGE);
                    //System.out.println("Conta inexistente!");
                }
            }
            return opcao;
        }
        
        public void iniciar() {
            int opcao = 0;
            do { 
                opcao = realizaOperacao();
            } while (opcao != 0);
        }

                       
        


    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Conta[] getVetorContas() {
        return this.vetorContas;
    }

    public void setVetorContas(Conta[] vetorContas) {
        this.vetorContas = vetorContas;
    }

}
    

