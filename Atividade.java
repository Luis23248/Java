/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.operadores;

import java.util.Scanner;


/**
 *
 * @author Aluno
 */
public class Atividade {
    public static void main(String[] args){
    
    
    Scanner scan = new Scanner(System.in);
    
        System.out.println("Digite seu nome: ");
        String nome = scan.next();
        
        System.out.println("Digite a sua idade: ");
        int idade = scan.nextInt();
        
        System.out.println("Digite seu peso: ");
        double peso = scan.nextDouble();
        
        
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Peso: " + peso + " quilos");
                
    }
          
}
