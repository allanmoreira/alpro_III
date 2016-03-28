
import java.util.ArrayList;

/**
 * Created by allan on 3/9/16.
 */
public class Recursividade {

    /*
    1 - Implemente um método recursivo que
        calcule o somatório de um número n
        passado como parâmetro
     */
    public int somatorio(int n){
        if(n == 0){
            return 0;
        }
        return n+somatorio(n-1);
    }

    /*
    2 - Implemente um método recursivo que
        calcule o somatório de um número k à
        um número j, passados como
        parâmetro
     */
    public  int somatorioDeKaJ(int k, int j){
        if(k>j){
            throw new IllegalArgumentException(j + " é maior do que " + k);
        }

        if(k==j){
            return j;
        }

//        return k+somatorioDeKaJ(k++,j);
        return k+somatorioDeKaJ(++k,j);
    }

    /*
   3 - Implemente um método recursivo que
       calcule o somatório dos números
       contidos em um ArrayList de inteiros,
       passado como parâmetro
    */
    public int somatorioNumerosDeArrayList(ArrayList<Integer> lista){
        if(lista.isEmpty()){
            throw new IllegalArgumentException("A lista está vazia!");
        }
        return somatorioNumerosDeArrayList0(lista, lista.size()-1);
    }


    private int somatorioNumerosDeArrayList0(ArrayList<Integer> lista, int pos){
        if(pos == 0){
            return lista.get(pos);
        }

        return lista.get(pos)+somatorioNumerosDeArrayList0(lista, pos-1);
    }

    /*
    4 - Implemente um método recursivo para
        encontrar o maior elemento de um
        ArrayList
        int findBiggest(ArrayList<Integer> ar)
     */
    public int findBiggest(ArrayList<Integer> ar) {
        if(ar.isEmpty()){
            throw new IllegalArgumentException("A lista está vazia");
        }
        if(ar.size() == 1){
            return ar.get(0);
        }
        return findBiggest0(ar, 0, ar.size(), 0);
    }

    private int findBiggest0(ArrayList<Integer> ar, int pos, int fix, int biggest){
        if(pos == fix){
            return biggest;
        }

        if(ar.get(pos) > biggest){
            biggest = ar.get(pos);
        }
        return findBiggest0(ar, pos+1, ar.size(), biggest);
    }

    /*
    5 - Implemente um método recursivo que
        recebe um String e retorna true se este
        String for um palíndromo, false caso
        contrário
        Boolean isPal(String s)
     */

    public boolean isPal(String s){
        return isPal0(s);
    }

    private boolean isPal0(String s){
        if(s.length() == 1 || s.length() == 0){
            return true;
        }
        char a = s.charAt(0);
        char b = s.charAt(s.length()-1);
        if(a == b){
            return isPal0(s.substring(1, s.length()-1));
        }
        return false;
    }

    /*
    6 - Implemente um método recursivo que
        recebe um inteiro e retorna um String
        com o número em binário
        String convBase2(int n)
        (NÃO CONCLUÍDO!)
     */
    public String convBase2(int n){
        return convBase20(n, 0, "");
    }

    private String convBase20(int n, int restoDivisao, String binario) {
        if(n == 1){
            return binario;
        }

        restoDivisao = n%2;
        n = n/2;
        binario = restoDivisao + binario;

        return convBase20(n, restoDivisao, binario);
    }


}