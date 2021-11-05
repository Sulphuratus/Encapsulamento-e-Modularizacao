package br.edu.iftm.encapsulamento.classes;

public class Cliente {
    private String nome;
    private String sobrenome;
    private String cpf;
    private int dia;
    private int mes;
    private int ano;

    public Cliente (String cpf){
        if (this.validaCPF(cpf)){
            this.cpf = cpf;
        }else{
            imprimirMensagem("O CPF não é válido!!");
        }
       
    }

    public Cliente(String nome, String sobrenome, String cpf, int dia, int mes, int ano) {
        if(this.validaCPF(cpf)){
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.cpf = cpf;
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }else{
            imprimirMensagem("O CPF não é válido!!");
        }
    
    }

    private boolean validaCPF (String cpf){
        if (cpf.length() == 11){
            if (cpf.equals("00000000000")){
                return false;
            }else if(cpf.equals("11111111111")){
                return false;
            }else if(cpf.equals("22222222222")){
                return false;
            }else if(cpf.equals("33333333333")){
                return false;
            }else if(cpf.equals("44444444444")){
                return false;
            }else if(cpf.equals("55555555555")){
                return false;
            }else if(cpf.equals("66666666666")){
                return false;
            }else if(cpf.equals("77777777777")){
                return false;
            }else if(cpf.equals("88888888888")){
                return false;
            }else if(cpf.equals("99999999999")){
                return false;
            }
            return true;
        }
        return false;
    }

    private void imprimirMensagem(String msg){
        System.out.println(msg);
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSobrenome(){
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public String getCpf(){
        return this.cpf;
    }

    /*public void setCpf(String cpf){
        this.cpf = cpf;
    }*/

    public int getDia(){
        return this.dia;
    }

    public void setDia(int dia){
        this.dia = dia;
    }

    public int getMes(){
        return this.mes;
    }

    public void setMes(int mes){
        this.mes = mes;
    }

    public int getAno(){
        return this.ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

}
