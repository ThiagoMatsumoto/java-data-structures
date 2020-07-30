package linked-list-type-lifo;

/**
 * LIFO - Last in First Out
 */

public class ListaPilha {
    No inicio;
    No fim;
    public ListaPilha(){
        this.inicio = null;
        this.fim = null;
    }

    public void insere(int num){
        No aux = new No(num);
        aux.prox = this.inicio;
        this.inicio = aux;
               
    }

    public void remove(){
        No atual = this.inicio;
        No seguinte = atual.prox;
        atual.prox = this.inicio;
        this.inicio = seguinte;   
    }

    public void imprime(){
        No atual = this.inicio;
        while(atual != this.fim){
            System.out.println(atual.num);
            atual = atual.prox;
        }
    }
}
