package com.mycompany.principal;

public class Principal {

    public static void main(String[] args) {
        Clientess cliente = new Clientess();
        
        
        cliente.setNome("LPL");
        cliente.setIdade(21);
        
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade() + " anos");
    }
}
