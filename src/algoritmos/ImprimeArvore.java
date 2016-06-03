package algoritmos;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by allanmoreira on 20/05/16.
 */
public class ImprimeArvore {

    private Arvore.Nodo raiz;
    private ArvoreAVL.Nodo raizAVL;

    public String imprime(Arvore.Nodo raiz){
        this.raiz = raiz;
        return printTreeJB0(raiz);
    }

    public String imprime(ArvoreAVL.Nodo raiz){
        this.raizAVL = raiz;
        return printTreeJB0(raiz);
    }

    private String printTreeJB0(Arvore.Nodo nodo) {
        int contador = 15;
        int pos;
        int contASCII;
        Stack<Arvore.Nodo> filaAtual = new Stack<>();
        Stack<Arvore.Nodo> proximaFila = new Stack<>();
        StringBuilder textTemp = new StringBuilder();
        StringBuilder textFinal = new StringBuilder();
        Arvore.Nodo node;
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

    public HashMap<Integer, Integer> fillPosition(){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        fillPosition0(raiz, 1, hashMap);
        return hashMap;
    }

    private int fillPosition0(Arvore.Nodo nodo, int cont, HashMap<Integer, Integer> hashMap){
        if(nodo != null){
            cont = fillPosition0(nodo.esquerdo, cont, hashMap);
            String key = Integer.toString(nodo.chave);
            cont = cont + key.length();
            hashMap.put(nodo.chave, cont);
            cont = fillPosition0(nodo.direito, cont, hashMap);
        }
        return cont;
    }

    private int fillPosition0(ArvoreAVL.Nodo nodo, int cont, HashMap<Integer, Integer> hashMap){
        if(nodo != null){
            cont = fillPosition0(nodo.esquerdo, cont, hashMap);
            String key = Integer.toString(nodo.chave);
            cont = cont + key.length();
            hashMap.put(nodo.chave, cont);
            cont = fillPosition0(nodo.direito, cont, hashMap);
        }
        return cont;
    }

    public String stringBuilder(String letter, int n){
        StringBuilder texto = new StringBuilder();
        for(int i=0; i < n; i++){
            texto.append(letter);
        }
        return texto.toString();
    }
}
