/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author Aluno
 */
public class Funcionario extends Pessoa{
    private int matricula;
    private String cargo;

    public Funcionario(int matricula, String cargo, String nome, int idade, String endereco, String telefone) {
        super(nome, idade, endereco, telefone);
        this.matricula = matricula;
        this.cargo = cargo;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    
}
