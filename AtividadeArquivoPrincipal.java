package com.mycompany.atividadearquivoprincipal;

public class AtividadeArquivoPrincipal {

    public static void main(String[] args) {
        Livros livroUm = new Livros("Branca de neve e os sete negões", "Pablo Vegetti", 800, 20);
        Livros livroDois = new Livros("A culpa é das estrelas", "Pablo Marçal", 900, 50);
        
        
        System.out.println("Nome do livro: " + livroUm.getTitulo());
        System.out.println("Nome do autor: " + livroUm.getAutor());
        System.out.println("Número de páginas: "+ livroUm.getNumero_de_paginas());
        System.out.println("Preço do livro: " + livroUm.getPreco());
        System.out.println("Nome do livro: " + livroDois.getTitulo());
        System.out.println("Autor do livro: " + livroDois.getAutor());
        System.out.println("Número de páginas: " + livroDois.getNumero_de_paginas());
        System.out.println("Preço do livro: " + livroDois.getPreco());
    }
}
