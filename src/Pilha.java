public class Pilha {
    private ListaEncadeada pilha;
    private Node topo;
    public Pilha(){
        this.pilha = new ListaEncadeada();
    }
    public void empilha(int dado){
        pilha.insereUltimo(dado);

    }
    public void desempilha(){
        pilha.removeUltimo();
    }

    Integer topo(){
        Node aux = pilha.getLista();
        while (aux.getProximo() != null){
            aux = aux.getProximo();
        }
        return aux.getInfo();
    }
    public boolean vazia(){
        return  pilha.vazia();
    }
    void mostra_pilha(){
        pilha.imprimir();
    }
}
