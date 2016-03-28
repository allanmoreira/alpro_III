package algoritmos;

/**
 * Created by 12111151 on 3/28/16.
 */
public class Ordenacao {
    private int [] v;

    public Ordenacao(int[] v) {
        this.v = v;
    }

    public void bubbleSort(){
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v.length-1; j++) {
                if(v[j] > v[j+1]){
                    troca(v, j, j+1);
                    System.out.println(imprimeArray());
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


}
