package algoritmos;

/**
 * Created by 12111151 on 3/28/16.
 */
public class Ordenacao {
    private int [] v;
    private int contLoop = 0;

    public Ordenacao(int[] v) {
        this.v = v;
    }

    public void bubbleSort(){
        for (int i = 0; i < v.length; i++) {
            contLoop++;
            for (int j = 0; j < v.length-1; j++) {
                contLoop++;
                if(v[j] > v[j+1]){
                    troca(v, j, j+1);
                }
            }
        }
    }

    public void bubbleSortOtimizado(){
        boolean ordenadado = false;
        while (ordenadado == false){
            contLoop++;
            ordenadado = true;
            for (int i = 0; i < v.length-1; i++) {
                contLoop++;
                if(v[i] > v[i+1]){
                    troca(v, i, i+1);
                    ordenadado = false;
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

    public String getContLoop() {
        int n = contLoop;
        contLoop = 0;
        return "Loop = " + n;
    }

    private void imprimeTroca(int i, int j){
        System.out.print(imprimeArray());
        System.out.println("       <--- Trocou " + i + " por " + j);
    }

    public void insertionSortSlide(){
        int i, j, chave;
        for (j=1; j<v.length; j++) {
            chave = v[j];
            i = j - 1;
            while ((i >= 0) && (v[i] > chave)) {
                imprimeTroca(v[i], v[i+1]);
                v[i+1] = v[i];
                i = i - 1;
            }
            v[i+1] = chave;
        }
    }
}
