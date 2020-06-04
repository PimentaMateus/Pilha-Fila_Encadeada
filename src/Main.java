public class Main {
    public static void main(String[] args) {
        ListaEncadeada list = new ListaEncadeada();
        System.out.println("**************Teste Lista Enc ********");
        list.insereOrdenado(78);
        list.insereOrdenado(54);
        list.insereOrdenado(21);
        list.insereOrdenado(15);
        list.insereDepois(list.getNode(21), 30);
        list.removeUltimo();
        list.imprimir();
        Pilha p = new Pilha();
        System.out.println("**************Teste Pilha************");
        p.empilha(78);
        p.empilha(10);
        p.empilha(54);
        p.desempilha();
        p.mostra_pilha();
        System.out.println("Topo da pilha " + p.topo());
       System.out.println("**************Teste Fila**************");
        Fila f = new Fila();
        f.insere(1);
        f.insere(2);
        f.insere(3);
        f.remove();
        f.mostra_fila();



    }
}
