package state;

public class Atrasada implements State {

    private String nome = "concluida";
    private Context tarefa;

    

    public Atrasada( Context tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public void atrasada() {
        System.out.println("Já está atrasada");

    }

    @Override
    public void concluida() {
        tarefa.setState(new Concluida(tarefa));

    }

    @Override
    public void pendente() {
        System.out.println("Já está atrasada");

    }
    @Override
    public String toString() {
        return "Novo estado da tarefa: " + nome;
    }

}
