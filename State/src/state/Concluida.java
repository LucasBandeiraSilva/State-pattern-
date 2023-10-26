package state;

public class Concluida implements State {

    private String nome = "Concluída";
    private Context tarefa;

    public Concluida(Context tarefa) {
        this.tarefa = tarefa;
    }


    @Override
    public void atrasada() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atrasada'");
    }

    @Override
    public void concluida() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'concluida'");
    }

    @Override
    public void pendente() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pendente'");
    }


    @Override
    public String toString() {
        return "Novo estado da tarefa: " + nome;
    }

    
}
