/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principal2;

/**
 *
 * @author Aluno
 */
public class Principal2 {

    public static void main(String[] args) {
        Pet pet = new Pet("Robyssinho", 4, "Pit Bull");
        Cliente cliente = new Cliente("Robyssão", 22, pet);
                         
        
        
        System.out.println("=== Informações do cliente ===");
        System.out.println("Nome "+cliente.getNome());
        System.out.println("Idade: "+cliente.getIdade());
        
        
        System.out.println("=== Informaçoes do pet do cliete ===");
        System.out.println("Nome do pet: "+cliente.getPet().getNome());
        System.out.println("Idade do pet: "+cliente.getPet().getIdade());
        System.out.println("Raça do pet: "+cliente.getPet().getRaca());
        
        
        
        
        
    }
}
