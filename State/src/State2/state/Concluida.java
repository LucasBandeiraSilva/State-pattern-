package State2.state;

import State2.Context.Tarefa;

public class Concluida implements Estado {
    private Tarefa tarefa;

    private String nome = "Tarefa concluida";


    public Concluida(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public void atrasada() {
        System.out.println("tarefa ja concluida");
    }

    @Override
    public void concluida() {
       System.out.println("tarefa concluida com sucesso");
    }

    @Override
    public void pendente() {
        tarefa.setEstado(new Pendente(tarefa));
    }

    @Override
    public String toString() {
        return "Concluida [tarefa=" + tarefa + ", nome=" + nome + "]";
    }
    
}
