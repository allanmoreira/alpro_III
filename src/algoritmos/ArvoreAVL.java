package algoritmos;

/**
 * Created by allanmoreira on 27/04/16.
 */
public class ArvoreAVL {
    private Nodo raiz;

    public class Nodo {
        Nodo esquerdo;
        Nodo direito;
        int chave;

        public Nodo (int chave) {
            this.chave = chave;
        }
    }

    public void inserir(int chave){
        raiz = inserir0(raiz, chave);
    }

    private Nodo inserir0(Nodo nodo, int chave){
        return nodo;
    }

    public String toString(){
        return new ImprimeArvore().imprime(raiz);
    }
}
