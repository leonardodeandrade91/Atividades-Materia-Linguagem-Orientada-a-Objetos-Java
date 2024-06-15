package pootiposgenericos;

public class Generico<E> {
    private E entidade;
    
    public E getEntidade() {
        return this.entidade;
    }
    
    public void setEntidade(E entidade) {
        this.entidade = entidade;
    }
}