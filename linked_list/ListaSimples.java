package linked_list;

public class ListaSimples {
    No inicio;
    public ListaSimples(){
        this.inicio = null;
    }

    public void insere(int num){
        No aux = new No(num);
        aux.prox = this.inicio;
        this.inicio = aux;
    }

    public void intercala(ListaSimples lista){
        No atual1 = this.inicio;
        No seguinte1 = null;

        No atual2 = lista.inicio;
        No seguinte2 = null;

        while(atual1 != null){
            seguinte1 = atual1.prox;
            seguinte2 = atual2.prox;

            atual1.prox = atual2;
            atual1 = seguinte1;

            atual2.prox = atual1;
            atual2 = seguinte2;
        }
    }
    
    public void concatena(ListaSimples lista){
        No anterior = null;
        No atual = this.inicio;
        while(atual != null){
            anterior = atual;
            atual = atual.prox;
        }
        anterior.prox = lista.inicio;
    }
    
    public int posicao(int numero){
        int i = 0;
        No p = this.inicio;
        while(p != null){
            i++;
            p = p.prox;
            if(p == null) {
                System.out.println("Valor não encontrado!");
                return -1;
            }
        }
        return i;
    }
    
    /**
     * inicio -> null
     * método insere 1, 2, 3
     * Ordem de impressão 3 -> 2 -> 1 -> null
     * Porque o atributo prox do nó auxiliar aponta para o inicio
     * 
     */
    //Gambiarra: cria uma nova lista e a partir dela inverte os valores
    public void inverteGambiarra(){
        ListaSimples nova = new ListaSimples();
        No p = nova.inicio;
        while(p != null){
            insere(p.num);
            p = p.prox;
        }
        imprime();
    }

    //inverter a lista orginal, sem criar outra https://www.geeksforgeeks.org/reverse-a-linked-list/
    public void inverte(){
        No anterior = null;
        No atual = inicio;
        No seguinte = null;
        while(atual != null){
            seguinte = atual.prox;
            atual.prox = anterior;
            anterior = atual;
            atual = seguinte;
        }
        this.inicio = anterior;
    }
    /**
     * 3 -> 2 -> 1 -> null
     * Laço 1
     * null (ant e seg) 3(at) -> 2 -> 1 -> null
     * null (ant) 3 (at) -> 2(seg) -> 1 -> null
     * null (ant) <- 3 (at) 2(seg) -> 1 -> null
     * null <- 3 (at e ant) 2(seg) -> 1 -> null
     * null <- 3 (ant) 2(at e seg) -> 1 -> null
     * 
     * Laço 2
     * null <- 3 (ant) 2(at) -> 1(seg) -> null
     * null <- 3 (ant) <- 2(at) 1(seg) -> null
     */

    public void imprime(){
        No p = this.inicio;
        while(p != null){
            System.out.println(p.num);
            p = p.prox;
        }
    }
}
