package State2.Context;

import State2.state.Estado;
import State2.state.Pendente;

public class Tarefa {

    private String nome;
    private String descricao;
    private Estado estado;

    public Tarefa() {
    }

    public Tarefa(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.estado = new Pendente(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
        System.out.println(getEstado());
    }

    // Sera requisitado pela classe main
    protected void requisitarPendente() {
        estado.pendente();
    }

    protected void requisitarConcluida() {
        estado.concluida();
    }

    protected void requistarAtrasada() {
        estado.atrasada();
    }

    @Override
    public String toString() {
        return "Tarefa [nome=" + nome + ", descricao=" + descricao  + "]";
    }

}
