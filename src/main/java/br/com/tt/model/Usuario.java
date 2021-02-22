package br.com.tt.model;

public class Usuario {

    private Long id;
    private String nome;


    public void setNome(String novoNome) {
        if(novoNome.length() < 3) {
            System.err.println(("Seu nome deve ter mais de 3 caracteres"));
            System.exit(1);
        }
        nome = novoNome;
    }
}
