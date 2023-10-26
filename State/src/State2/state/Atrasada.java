package State2.state;

import State2.Context.Tarefa;

public class Atrasada implements Estado {

    private Tarefa tarefa;
    private String nome = "Tarefa Atrasada";

    public Atrasada(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public void atrasada() {
        System.out.println("ja está atrasada");
    }

    @Override
    public void concluida() {
        tarefa.setEstado(new Concluida(tarefa));
    }

    @Override
    public void pendente() {
        System.out.println("ja está atrasada");
    }

    @Override
    public String toString() {
        return "Atrasada [tarefa=" + tarefa + ", nome=" + nome + "]";
    }
   

}
