package linked_list_fifo;

public class Teste {
    public static void main(String[] args){
        ListaFila lf = new ListaFila();
        lf.insere(1);
        lf.insere(2);
        lf.insere(3);
        lf.insere(4);

        lf.imprimir();
        System.out.println();
        lf.remover();
        lf.imprimir();
        System.out.println();
        lf.remover();
        lf.imprimir();
    }
}
