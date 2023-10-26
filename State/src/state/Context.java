package state;

public class Context {

    private State state = new Pendente(this);

    private final String nome = "Pendente";

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public String getNome() {
        return nome;
    }
    

}
