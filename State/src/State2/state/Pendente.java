package State2.state;

import State2.Context.Tarefa;

public class Pendente implements Estado {

    private String nome = "Tarefa pendente";
    private Tarefa tarefa;

    public Pendente() {
    }

    public Pendente( Tarefa tarefa) {
       
        this.tarefa = tarefa;
    }

    @Override
    public void atrasada() {
        tarefa.setEstado(new Atrasada(tarefa));
    }

    @Override
    public void concluida() {
        tarefa.setEstado(new Concluida(tarefa));
        }

    @Override
    public void pendente() {
       System.out.println("ja está pendente");
    }

    @Override
    public String toString() {
        return "Pendente [nome=" + nome + ", tarefa=" + tarefa + "]";
    }
    
}
