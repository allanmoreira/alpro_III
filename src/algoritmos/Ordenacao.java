package algoritmos;

/**
 * Created by allanmoreira on 3/28/16.
 */
public class Ordenacao {

    public static String bubbleSort(int[] v){
        for (int i = 0; i < v.length-1; i++) {
            for (int j = i+1; j < v.length; j++) {
                if(v[j]<v[i]){
                    troca(v, i, j);
                }
            }
        }
        return toString(v);
    }

    public static String bubbleSortOtimizado(int[] v){
        boolean ordenado = false;

        while(ordenado == false) {
            ordenado = true;
            for (int i = 0; i < v.length-1; i++) {
                System.out.println(i);
                if(v[i]>v[i+1]){
                    System.out.println("Trocou " + v[i] + " por " + v[i+1]);
                    troca(v, i, i+1);
                    ordenado = false;
                }
            }
        }
        return toString(v);
    }

    public static String insertionSort(int [] v) {
        int i, chave;

        for (int j = 1; j < v.length; j++) {
            chave = v[j];
            i = j-1;
            while(i>=0 && v[i]>chave){
                v[i+1] = v[i];
                i = i-1;
            }
            v[i+1] = chave;
        }
        return toString(v);
    }

    private static void troca(int[] v, int i, int j) {
        int a = v[i];
        v[i] = v[j];
        v[j] = a;
    }

    private static String toString(int[] v){
        String imp = "{";
        for (int i = 0; i < v.length; i++) {
            imp+= v[i];
            if(i<v.length-1){
                imp+= ", ";
            }
        }
        imp+= "}";
        return imp;
    }
}
