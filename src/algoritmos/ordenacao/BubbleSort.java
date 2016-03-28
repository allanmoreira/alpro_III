package algoritmos.ordenacao;

/**
 * Created by 12111151 on 3/28/16.
 */
public class BubbleSort {
    private int [] v;

    public BubbleSort(int[] v) {
        this.v = v;
    }

    public void ordena(){
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length-1; j++) {
                if(v[j] > v[j+1]){
                    troca(v, j, j+1);
                }
            }
        }
    }

    private void troca(int [] v, int i, int j) {
        int n = v[j];
        v[j] = v[i];
        v[i] = n;
    }

    public String imprimeArray(){
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

    public String imprimeArray2(){
        String imp = null;
        for (int i = 0; i < v.length; i++) {
            imp+= v[i] + " ";
        }
        return imp;
    }


}
