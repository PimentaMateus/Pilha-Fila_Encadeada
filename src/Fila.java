public class Fila {
    private ListaEncadeada fila;
    public Fila(){
        this.fila = new ListaEncadeada();
    }
    void insere(int dado){
        fila.insereUltimo(dado);
    }
    public void remove(){
        fila.removePrimeiro();
    }
    public boolean vazia(){
        return  fila.vazia();
    }
    void mostra_fila(){
        fila.imprimir();
    }
}
