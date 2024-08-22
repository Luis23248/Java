/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal3;

/**
 *
 * @author Aluno
 */
public class Medico extends Funcionario{
    private String crm;

    public Medico(String crm) {
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    @Override
    public String toString() {
        return "Medico{" + "\ncrm = " + super.toString() + crm + '}';
    }
    
    
}
