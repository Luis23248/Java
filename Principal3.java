/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principal3;

/**
 *
 * @author Aluno
 */
public class Principal3 {

    public static void main(String[] args) {
        Endereco endereco1 = new Endereco("Rua de cima", "260", "C",  "1544545", "Salvador", UnidadeFederativa.BAHIA);
        
        Pessoa pessoa1 = new Pessoa(5115, "LPL", "748541515", "LPL@hotmail.com", endereco1);
        
    }
}
