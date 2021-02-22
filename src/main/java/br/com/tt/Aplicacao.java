package br.com.tt;

import br.com.tt.model.Usuario;

import java.util.Scanner;

public class Aplicacao {
    private static Usuario[] usuarios = new Usuario[2];
    private static int indiceUsuario = 0;

    public static void main(String[] args) {
        perguntarUsername();
        perguntarMensagem(); //D while
        //ListarMensagem();


    }

    private static void perguntarMensagem() {
        System.out.println("Informe sua mensagem: ");
        String msg = new Scanner(System.in).nextLine();
    }

    private static void perguntarUsername() {
        System.out.println("Bem vindo!");
        System.out.println("Informe teu nome: ");
        String nome = new Scanner(System.in).nextLine();

        Usuario novoUsuario = new Usuario();
        novoUsuario.setNome(nome);
        usuarios[indiceUsuario++] = novoUsuario;
    }
}
