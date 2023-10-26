package state;

public class Pendente implements State {

    private final String nome = "Pendente";
    private Context tarefa;

    public Pendente(Context tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public void atrasada() {
        tarefa.setState(new Atrasada(tarefa));
    }

    @Override
    public void concluida() {
        tarefa.setState(new Concluida(tarefa));
    }

    @Override
    public void pendente() {
        System.out.println("Já está pendente");

    }

    @Override
    public String toString() {
        return "Novo estado da tarefa: " + nome;
    }


}
