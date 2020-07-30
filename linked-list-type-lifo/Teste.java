package linked-list-type-lifo;

public class Teste {
    public static void main(String[] args){
        ListaPilha lp = new ListaPilha();

        lp.insere(1);
        lp.insere(2);
        lp.insere(3);
        lp.insere(4);
        lp.insere(5);

        lp.imprime();
        System.out.println();
        lp.remove();
        lp.imprime();
        System.out.println();
        lp.remove();
        lp.imprime();
    }   
}
