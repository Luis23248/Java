/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principal;

/**
 *
 * @author Aluno
 */
public class Principal {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("14/08/2024", "PIX", "Luis", 21, "Rua de baixo, Periperi, Salvador", "71 98869-2345");
        
        Funcionario funcionario = new Funcionario(4872, "CEO", "LPL", 21, "Rua da glória, Periperi, Salvador", "71 98632-4801");
        
        
        System.out.println("\nDados do cliente:");
        System.out.println("Nome: "+cliente.getNome());
        System.out.println("Idade: "+cliente.getIdade());
        System.out.println("Telefone: "+cliente.getTelefone());
        System.out.println("Data da compra: "+cliente.getData_compra());
        System.out.println("Forma de pagamento: "+cliente.getForma_pagamento());
        System.out.println("Endereço: "+cliente.getEndereco());
        
        System.out.println("\nDados do funcionário: ");
        System.out.println("Nome: "+funcionario.getNome());
        System.out.println("Idade: "+funcionario.getIdade());
        System.out.println("Telefone: "+funcionario.getTelefone());
        System.out.println("Matricula: "+funcionario.getMatricula());
        System.out.println("Cargo: "+funcionario.getCargo());
        System.out.println("Endereço: "+funcionario.getEndereco());
    }
}
