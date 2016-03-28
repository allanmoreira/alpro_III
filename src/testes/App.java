package testes;

import algoritmos.ordenacao.BubbleSort;

/**
 * Created by 12111151 on 3/28/16.
 */
public class App {
    public static void main(String[] args) {
        int [] v = new int [] {5, 2, 4, 6, 1, 3};
//        int [] v = new int [] {1,2,3,4,5,6};
//        int [] v = new int [] {6,5,4,3,2,1};
        BubbleSort bb = new BubbleSort(v);

        System.out.println("Antes:  " + bb.imprimeArray());
        bb.ordena();
        System.out.println("Depois: " + bb.imprimeArray());
    }
}
