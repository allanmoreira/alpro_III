package algoritmos;

import java.util.*;

/**
 * Created by allanmoreira on 27/04/16.
 */
public class Arvore {

    private Nodo raiz;
    private int contador;

    public class Nodo {
        Nodo esquerdo;
        Nodo direito;
        int chave;

        public Nodo(int chave) {
            this.chave = chave;
        }
    }

    public void inserir(int chave){
        raiz = inserir0(raiz, chave);
    }

    private Nodo inserir0(Nodo nodo, int chave) {
        if(nodo == null){
            contador++;
            return new Nodo(chave);
        }

        if(chave < nodo.chave)
            nodo.esquerdo = inserir0(nodo.esquerdo, chave);
        else if (chave > nodo.chave)
            nodo.direito = inserir0(nodo.direito, chave);

        return nodo;
    }

    public boolean contem(int chave){
        return contem0(raiz, chave);
    }

    private boolean contem0(Nodo nodo, int chave) {
        if(nodo == null)
            return false;
        if(chave < nodo.chave)
            return contem0(nodo.esquerdo, chave);
        else if(chave > nodo.chave)
            return contem0(nodo.direito, chave);
        return true;
    }

    public int tamanho(){
        return contador;
    }

    public String toString(){
        return new ImprimeArvore().imprime(raiz);
    }

    private Nodo getNodo(int chave){
        return getNodo0(raiz, chave);
    }

    private Nodo getNodo0(Nodo nodo, int chave) {
        if(nodo == null)
            throw new IllegalArgumentException("Chave inexistente!");
        if(chave < nodo.chave)
            return getNodo0(nodo.esquerdo, chave);
        else if(chave > nodo.chave)
            return getNodo0(nodo.direito, chave);
        return nodo;
    }

    public int altura(){
        return altura0(raiz, raiz.chave);
    }

    // O número de subárvores de um nó
    public int altura(int chave){
        return altura0(getNodo(chave), chave);
    }

    private int altura0(Nodo nodo, int chave) {
        if(nodo == null)
            return -1;
        int altDir = 1 + altura0(nodo.direito, chave);
        int altEsq = 1 + altura0(nodo.esquerdo, chave);

        return Math.max(altDir, altEsq);
    }

    public List<Integer> caminho(int chave){
        ArrayList<Integer> resposta = new ArrayList<>();
        caminho0(raiz, resposta, chave);
        return resposta;
    }

    private void caminho0(Nodo nodo, ArrayList<Integer> resposta, int chave) {
        if(nodo == null){
            resposta.clear();
            return;
        }
        if(chave < nodo.chave){
            resposta.add(nodo.chave);
            caminho0(nodo.esquerdo, resposta, chave);
        }
        else if(chave > nodo.chave){
            resposta.add(nodo.chave);
            caminho0(nodo.direito, resposta, chave);
        }
    }

    public List<Integer> folhas() {
        List<Integer> resposta = new ArrayList<>();
        folhas0(raiz, resposta);
        return resposta;
    }

    private void folhas0(Nodo nodo, List<Integer> resposta) {
        if(nodo != null){
            if(nodo.esquerdo == null && nodo.direito == null){
                resposta.add(nodo.chave);
                return;
            }
            folhas0(nodo.esquerdo, resposta);
            folhas0(nodo.direito, resposta);
        }
    }

    public List<Integer> valoresNoNivel(int nivel){
        ArrayList<Integer> resposta = new ArrayList<>();
        int cont = 0;
        valoresNoNivel0(raiz, nivel, cont, resposta);
        return resposta;
    }

    private void valoresNoNivel0(Nodo nodo, int nivel, int cont, ArrayList<Integer> resposta) {
        if(nodo == null){
            return;
        }

        if(cont == nivel){
            resposta.add(nodo.chave);
            cont--;
        }
        cont++;
        valoresNoNivel0(nodo.esquerdo, nivel, cont, resposta);
        valoresNoNivel0(nodo.direito, nivel, cont, resposta);
    }

    /**
     * Caminhamento em largura, conhecido como Breadth First Traversal. Percorre a árvore imprimindo nível a nível
     */
    public String caminhamentoEmLagura(){
        StringBuilder sb = new StringBuilder();
        Queue<Nodo> fila = new LinkedList<>();
        fila.add(raiz);
        sb.append("[");
//        while(fila.size() > 0){
        while(!fila.isEmpty()){
            Nodo n = fila.remove();

            sb.append(n.chave).append(", ");
            if(n.esquerdo != null)
                fila.add(n.esquerdo);
            if(n.direito != null)
                fila.add(n.direito);
        }
        sb.delete(sb.length()-2, sb.length()-1);
        sb.append("]");
        return sb.toString();
    }
}
