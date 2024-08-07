package com.mycompany.principau;

public class Principau {

    public static void main(String[] args) {
        Funcionarios funcionario = new Funcionarios();
        
        funcionario.setNome("Robson Fudelancio da Silva");
        funcionario.setIdade(39);
        funcionario.setSalario(110000);
        
        System.out.println("O nome do puto: "+ funcionario.getNome());
        System.out.println("Idade do traficante: "+ funcionario.getIdade()+ " anos");
        System.out.println("Salário na biqueira: "+funcionario.getSalario());
    }
}
