/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author Aluno
 */
public class Cliente extends Pessoa{
    private String data_compra;
    private String forma_pagamento;

    public Cliente(String data_compra, String forma_pagamento, String nome, int idade, String endereco, String telefone) {
        super(nome, idade, endereco, telefone);
        this.data_compra = data_compra;
        this.forma_pagamento = forma_pagamento;
    }

    public String getData_compra() {
        return data_compra;
    }

    public void setData_compra(String data_compra) {
        this.data_compra = data_compra;
    }

    public String getForma_pagamento() {
        return forma_pagamento;
    }

    public void setForma_pagamento(String forma_pagamento) {
        this.forma_pagamento = forma_pagamento;
    }

    
}

