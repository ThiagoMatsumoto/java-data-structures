package linked_list_fifo;

/**
 * FIFO - First In First Out
 */
public class ListaFila {
    No inicio;
    No fim;
    public ListaFila(){
        this.inicio = null;
        this.fim = null;
    }

    public void insere(int num){
        if(this.inicio == null){
            this.fim = new No(num);
            this.inicio = this.fim;
        } else {
            this.fim.prox = new No(num);
            this.fim = fim.prox;
        }
    }

    public void imprimir(){
        No p = this.inicio;
        while(p != this.fim){
            System.out.println(p.num);
            p = p.prox;
            if (p == this.fim) System.out.println(p.num);
        }
    }

    public void remover(){
        this.inicio = this.inicio.prox;
    }
}
