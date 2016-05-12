package algoritmos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/**
 * Created by allanmoreira on 27/04/16.
 */
public class ArvoreAVL {

    private Nodo raiz;
    private int contador;

    private class Nodo {
        Nodo esquerdo;
        Nodo direito;
        int chave;

        public Nodo(int chave) {
            this.chave = chave;
        }
    }


    public void inserir(int chave) {
        raiz = inserir0(raiz, chave);
    }

    private Nodo inserir0(Nodo nodo, int chave) {
        if(nodo == null){
            return new Nodo(chave);
        }
        if(chave > nodo.chave){
//            nodo.direito
        }
        return nodo;
    }

    public boolean contem(int chave) {
        return contem0(raiz, chave);
    }

    private boolean contem0(Nodo nodo, int chave) {
        if (nodo == null)
            return false;
        if (chave > nodo.chave)
            return contem0(nodo.direito, chave);
        else if (chave < nodo.chave)
            return contem0(nodo.esquerdo, chave);
        return true;
    }

    public int tamanho() {
        return contador;
    }

    public int altura() {
        return altura0(raiz);
    }

    private int altura0(Nodo nodo) {
        if (nodo == null)
            return -1;
        int altDir = 1 + altura0(nodo.direito);
        int altEsq = 1 + altura0(nodo.esquerdo);
//        int maior = Math.max(altDir, altEsq);
//        System.out.println("Altura do nodo " + nodo.chave + " é " + maior);
        return Math.max(altDir, altEsq);
    }

    public List<Integer> caminho(int chave){
        List<Integer> resposta = new ArrayList<>();
        return caminho0(raiz, chave, resposta);
    }

    private List<Integer> caminho0(Nodo nodo, int chave, List<Integer> resposta) {
        if(nodo == null)
            throw new IllegalArgumentException("Chave não encontrada!");
        resposta.add(nodo.chave);
        if(chave > nodo.chave)
            return caminho0(nodo.direito, chave, resposta);
        if(chave < nodo.chave)
            return caminho0(nodo.esquerdo, chave, resposta);
        return resposta;
    }

    public List<Integer> folhas(){
//      TODO implementar o método folhas
        return null;
    }

    public int nivel(int chave){
//      TODO implementar o método nivel
        return 0;
    }

//    public String toString(){}

    /*
    * Métodos utilizados para impressão da árvore, utilizados no trabalho de 2015/2.
    * Código completo em https://github.com/nolram/trabalho_alpro_III
    * */
    public String printTreeJB(){
        return printTreeJB0(raiz);
    }

    private String printTreeJB0(ArvoreAVL.Nodo nodo) {
        int contador = 15;
        int pos;
        int contASCII;
        Stack<ArvoreAVL.Nodo> filaAtual = new Stack<>();
        Stack<ArvoreAVL.Nodo> proximaFila = new Stack<>();
        StringBuilder textTemp = new StringBuilder();
        StringBuilder textFinal = new StringBuilder();
        ArvoreAVL.Nodo node;
        HashMap<Integer, Integer> hashPosition = fillPosition();
        contador += hashPosition.size();
        if(nodo != null){
            filaAtual.push(nodo);
        }
        do{
            contador += 9;
            while (filaAtual.size() > 0){
                contador += 13;
                node = filaAtual.pop();
                pos = hashPosition.get(node.chave);
                if(node.esquerdo != null) {
                    contador += 15;
                    contASCII = hashPosition.get(node.esquerdo.chave);
                    textTemp.append(stringBuilder(" ", contASCII - textTemp.length()));
                    textTemp.append("|");
                    textTemp.append(stringBuilder("-", pos - contASCII - 1));
                    proximaFila.push(node.esquerdo);
                } else {
                    contador += 4;
                    textTemp.append(stringBuilder(" ", pos - textTemp.length()));
                }
                textTemp.append(node.chave);
                if(node.direito != null) {
                    contador += 11;
                    contASCII = hashPosition.get(node.direito.chave);
                    textTemp.append(stringBuilder("-", contASCII - pos - 1));
                    textTemp.append("|");
                    proximaFila.push(node.direito);
                }
            }
            //System.out.print(textTemp);
            textFinal.append(textTemp);
            textTemp = new StringBuilder();
            textFinal.append("\n");
            //System.out.println();
            while (proximaFila.size() > 0){
                contador += 4;
                filaAtual.push(proximaFila.pop());
            }
        } while (filaAtual.size() > 0);
        //System.out.println("Contador: "+Integer.toString(contador));
        return textFinal.toString();
        //return contador;
    }

    private HashMap<Integer, Integer> fillPosition(){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        fillPosition0(raiz, 1, hashMap);
        return hashMap;
    }

    private int fillPosition0(ArvoreAVL.Nodo nodo, int cont, HashMap<Integer, Integer> hashMap){
        if(nodo != null){
            cont = fillPosition0(nodo.esquerdo, cont, hashMap);
            String chave = Integer.toString(nodo.chave);
            cont = cont + chave.length();
            hashMap.put(nodo.chave, cont);
            cont = fillPosition0(nodo.direito, cont, hashMap);
        }
        return cont;
    }

    private String stringBuilder(String letter, int n){
        StringBuilder texto = new StringBuilder();
        for(int i=0; i < n; i++){
            texto.append(letter);
        }
        return texto.toString();
    }

}
