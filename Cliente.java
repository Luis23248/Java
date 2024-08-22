/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal3;

/**
 *
 * @author Aluno
 */
public class Cliente extends Fisica{
    int ProtocoloAtendimento;

    public Cliente(int ProtocoloAtendimento) {
        this.ProtocoloAtendimento = ProtocoloAtendimento;
    }

    public int getProtocoloAtendimento() {
        return ProtocoloAtendimento;
    }

    public Sexo getSexo() {
        return getSexo();
    }

    public EstadoCivil getEstadoCivil() {
        return getEstadoCivil();
    }

    public String getDataNascimento() {
        return getDataNascimento();
    }

    @Override
    public String toString() {
        return "Cliente{" + "\nProtocoloAtendimento = " + super.toString() + ProtocoloAtendimento + '}';
    }
    
    
}
