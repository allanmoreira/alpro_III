package algoritmos;

import java.util.List;

/**
 * Created by allanmoreira on 20/05/16.
 */
public interface OperacoesArvore <T> {

    void inserir(int chave);
    boolean contem(int chave);
    int tamanho(); // números de nós de uma árvore
    int nivel(int chave);
    int altura();
    List<T> caminho(int chave);
    List<T> folhas();
    List<T> valoresNoNivel(int nivel);
    String toString();
}
