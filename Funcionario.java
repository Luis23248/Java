/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal3;

/**
 *
 * @author Aluno
 */
public abstract class Funcionario extends Fisica{
    private String cpf;
    private String rg;
    private String matricula;
    private Setor setor;
    private double salario;

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getMatricula() {
        return matricula;
    }

    public Setor getSetor() {
        return setor;
    }

    public double getSalario() {
        return salario;
    }
    
}
