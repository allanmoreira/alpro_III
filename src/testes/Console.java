package testes;

import algoritmos.Arvore;
import algoritmos.ArvoreAVLMangan;
import algoritmos.Ordenacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 12111151 on 3/28/16.
 */
public class Console {
    public static void main(String[] args) {
        ArvoreAVLMangan arvore = new ArvoreAVLMangan();
        arvore.inserir(20);
        arvore.inserir(30);
//        arvore.inserir(40);
//        arvore.inserir(30);
//        arvore.inserir(50);
//        arvore.inserir(45);
//        arvore.inserir(15);
//        arvore.inserir(17);
//        arvore.inserir(5);
//        arvore.inserir(7);
//        arvore.inserir(6);

        List<String> lista = arvore.dump();
        for (String s : lista) {
            System.out.println(s);
        }
    }
}
