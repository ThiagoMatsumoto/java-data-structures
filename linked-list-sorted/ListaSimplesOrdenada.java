package linked-list-sorted;

public class ListaSimplesOrdenada {
    No inicio;
    public ListaSimplesOrdenada(){
        this.inicio = null;
    }

    /**
     * Implementar um método insere que
     * já ordena os valores a serem passados
     * https://www.netjstech.com/2019/03/sorted-linked-list-in-java.html
     */

    public void insere(int num){
        No novoNo = new No(num);
        No atual = this.inicio;
        No anterior = null;

        while(atual != null && num > atual.num){
            anterior = atual;
            atual = atual.prox;
        }

        if(anterior == null){
            this.inicio = novoNo;
        } else{
            anterior.prox = novoNo;
        }
        novoNo.prox = atual;
        
    }

    public void imprime(){
        No atual = this.inicio;

        while(atual != null){
            System.out.println(atual.num);
            atual = atual.prox;
        }
    }
}
