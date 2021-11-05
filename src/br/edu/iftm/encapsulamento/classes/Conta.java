package br.edu.iftm.encapsulamento.classes;

public class Conta{

    private static int totalDeContas;
    private int numero;
    private double saldo;
    private double limite;
    //private String titular; Substituído pelo objeto Cliente
    private Cliente cliente;

    public Conta (){
        Conta.totalDeContas = Conta.totalDeContas + 1 ;
    }

    public Conta (Cliente cliente){
        this();
        this.cliente = cliente;
    }

    public Conta (int numero, Cliente cliente){
        this(cliente);
        this.numero = numero;
    }

    public boolean sacar(double valorSaque){
        //double saldoTotal = this.saldo + this.limite; // movido para método verificaSaldo
        //if(saldoTotal >= valorSaque){ // Troca essa linha pela próxima 
        if(verificaSaldo(valorSaque)){ // Se verificaSaldo for verdadeiro continue
            this.saldo -= valorSaque;
            return true;
        }else{
            return false;
        }
    }

    public boolean depositar(double valorDeposito){
        if(valorDeposito > 0){
            this.saldo += valorDeposito;
            return true;
        }
        return false;
    }

    public boolean transferir(Conta destino, double valorTransferencia){
        if (verificaSaldo(valorTransferencia)){
            this.saldo -= valorTransferencia;
            destino.depositar(valorTransferencia);
            //System.out.println("Transferência realizada com sucesso!");
            return true;
        }
        return false;
    }

    private boolean verificaSaldo (double valor){
        double saldoTotal = this.saldo + this.limite;
        if (saldoTotal >= valor){
            return true;
        }
        imprimirMensagem("Saldo Insuficiente!!");
        return false;
    }

    private void imprimirMensagem(String msg){
        System.out.println(msg);
    }

    //**
    /*public double mostrar(){
        double saldoTotal = this.saldo + this.limite;;
        return saldoTotal;
    }*/

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    /*public void setSaldo(double saldo) {
        this.saldo = saldo;
    }*/

    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getTotalDeContas(){
        return Conta.totalDeContas;
    }

   

} 
