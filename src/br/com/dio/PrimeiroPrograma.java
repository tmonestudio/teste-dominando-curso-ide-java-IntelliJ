package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);
        Livros livro = new Livros("o prolema dos 3 corpos", 300);
        System.out.println(livro);
        /*int a = 5;
        int b = 3;
        System.out.println("hello " + (a+b));*/
    }
    class Livros{
        private String nome;
        private String numPaginas;

        public Livros(String nome, String numPaginas) {
            this.nome = nome;
            this.numPaginas = numPaginas;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setNumPaginas(String numPaginas) {
            this.numPaginas = numPaginas;
        }

        @Override
        public String toString() {
            return "Livros{" +
                    "nome='" + nome + '\'' +
                    ", numPaginas='" + numPaginas + '\'' +
                    '}';
        }
    }
}
