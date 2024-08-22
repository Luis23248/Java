/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal3;

/**
 *
 * @author Aluno
 */
public class Engenheiro extends Funcionario{
    private String crea;

    public Engenheiro(String crea) {
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    @Override
    public String toString() {
        return "Engenheiro{" + "\ncrea = "  + super.toString() + crea + '}';
    }
    
}
