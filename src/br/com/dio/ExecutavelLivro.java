package br.com.dio;

import br.com.dio.model.Livro;

public class ExecutavelLivro {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Problema dos 3 corpos", 300);
        System.out.println(livro1);

        Livro livro = new Livro ("O investidor inteligente", 400);
        System.out.println(livro);
    }
}
