package br.com.tt.model;

import java.time.LocalDateTime;

public class Mensagem {

    private String mensagem;
    private Short idUsuarioOrigem;
    private Short idusuarioDestino;
    private LocalDateTime dataHoraEnvio;

    public void setMensagem(Mensagem[] novaMensagem) {
        if (novaMensagem.length() >= 5) {
        } else {
            System.err.println(("Sua mensagem deve ter mais de 5 caracteres!"));
            System.exit(1);
        }
        novaMensagem = novaMensagem;
    }
}
