/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.diagramadeclasses;

/**
 *
 * @author Aluno
 */
public class DiagramaDeClasses {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(1548, "LPL", 21, 3500, Setor.MARKETING, Sexo.MASCULINO);
        
        System.out.println("\n...Dados do Funcionário...");
        System.out.println("Nome: "+funcionario.getNome());
        System.out.println("Idade: "+funcionario.getIdade());
        System.out.println("Sexo: "+funcionario.getSexo());
        System.out.println("ID: "+funcionario.getId());
        System.out.println("Setor: "+funcionario.getSetor());
        System.out.println("Salário: "+funcionario.getSalario());
        
    }
}
