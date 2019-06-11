package model.automatoPilha;

import java.util.Stack;

public class Iteracao {

    private Stack<String> pilha;
    private String nomeEstado;
    private Cadeia cadeia;


    public Iteracao(Stack<String> pilha, String nomeEstado, Cadeia cadeia) {
        this.pilha = pilha;
        this.nomeEstado = nomeEstado;
        this.cadeia = cadeia;
    }

    public Iteracao() {
    }

    public Stack<String> getPilha() {
        return pilha;
    }

    public void setPilha(Stack<String> pilha) {
        this.pilha = pilha;
    }

    public String getNomeEstado() {
        return nomeEstado;
    }

    public void setNomeEstado(String nomeEstado) {
        this.nomeEstado = nomeEstado;
    }

    public Cadeia getCadeia() {
        return cadeia;
    }

    public void setCadeia(Cadeia cadeia) {
        this.cadeia = cadeia;
    }
}
