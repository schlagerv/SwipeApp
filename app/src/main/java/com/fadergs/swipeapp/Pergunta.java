package com.fadergs.swipeapp;

public class Pergunta {
    String pergunta;
    boolean resposta;

    public void setGabarito(String pergunta, Boolean resposta) {
        this.pergunta = pergunta;
        this.resposta = resposta;

    }

    public String getPergunta() {
        return pergunta;
    }

    public boolean getResposta() {
        return resposta;
    }
}

