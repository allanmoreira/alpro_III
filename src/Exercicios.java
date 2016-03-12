import java.util.ArrayList;

/**
 * Created by 12111151 on 3/9/16.
 */
public class Exercicios {

    public int somatorio(int n){
        if(n == 0){
            return 0;
        }
        return n+somatorio(n-1);
    }

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

    public int findBiggest(ArrayList<Integer> ar){
        int biggest = 0;
        return 0;
    }

    public int findBiggest0(ArrayList<Integer> ar, int pos){
        if(pos == 0){
            return ar.get(0);
        }
        return findBiggest0(ar, pos-1);
    }
}