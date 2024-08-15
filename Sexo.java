/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.diagramadeclasses;

/**
 *
 * @author Aluno
 */
public enum Sexo {
    MASCULINO('M'),
    FEMININO('F');
    
    char caracter;

    private Sexo(char caracter) {
        this.caracter = caracter;
    }

    public char getCaracter() {
        return caracter;
    }
    
    
}
