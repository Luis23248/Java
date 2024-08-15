/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.diagramadeclasses;

/**
 *
 * @author Aluno
 */
public enum Setor {
    FUNCIONARIO("Funcionário"),
    RECURSOS_HUMANOS("Recursos humanos"),
    VENDAS("Vendas"),
    MARKETING("Marketing");

   
    private String texto;

    private Setor(String texto) {
        this.texto = texto;
        
    }

    public String getTexto() {
        return texto;
    }
    
    
}
