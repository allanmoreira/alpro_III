package testes;

import algoritmos.Arvore;

/**
 * Created by allanmoreira on 3/28/16.
 */
public class Console {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();

        arvore.inserir(20);
        arvore.inserir(10);
        arvore.inserir(40);
        arvore.inserir(30);
        arvore.inserir(50);
        arvore.inserir(45);
        arvore.inserir(15);
        arvore.inserir(17);
        arvore.inserir(5);
        arvore.inserir(7);
        arvore.inserir(6);

        System.out.println(arvore.caminhamentoEmLagura());
    }
}
