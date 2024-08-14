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
        Endereco casa = new Endereco("Rua da putaria", 69, "Salvador");
        Cliente cliente = new Cliente("Marivaldo", 24, casa);
        
        
        System.out.println("Nome: "+ cliente.getNome());
        System.out.println("Idade do cliente: "+cliente.getIdade()+" anos");
        
       
        System.out.println("Endereço do cliente:");
        System.out.println("Rua"+cliente.getEndereco().getLogradouro());
        System.out.println("Número da casa: "+cliente.getEndereco().getNumero());
        System.out.println("Cidade: "+cliente.getEndereco().getCidade());
    }
    
}
