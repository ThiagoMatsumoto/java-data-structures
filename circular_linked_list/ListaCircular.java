package circular_linked_list;

public class ListaCircular {
    No inicio;
    No fim;

    public ListaCircular(){
        this.inicio = null;
        this.fim = null;
    }

    public void inserir(int num){
        No aux = new No(num);
        if(inicio == null){
            inicio = aux;
            fim = aux;
            aux.prox = inicio;
        }
        else{
            fim.prox = aux;
            fim = aux;
            fim.prox = inicio;
        }
    }

    /**
     * A conexão do fim apontando para o inicio é 
     * a última ligação que será invertida, não a primeira. 
     * Após inverter a direção dos dados 1 -> 2 -> 3 para
     * 1 <- 2 <- 3, basta redefinir que o fim é o seguinte
     * que está apontando para o valor 1 e o inicio é o atual
     * que está apontando para o valor 3. 
     */
    public void inverte(){
        No anterior = null;
        No atual = this.fim.prox;
        No seguinte = atual.prox;
        
        while(atual != this.fim){
            anterior = atual;
            atual = seguinte;
            seguinte = atual.prox;
            atual.prox = anterior;
        }
        seguinte.prox = this.fim;
        this.fim = seguinte;
        this.inicio = atual;
    }

    public void imprime(){
        No atual = this.inicio;
        if(inicio == null){
            System.out.println("Lista Vazia");
        }
        else{
            System.out.println("Lista Circular:");
            while (atual != null){
                System.out.println(atual.num);
                atual = atual.prox;
                if(atual == inicio) break;
            }
        }
    }
}
