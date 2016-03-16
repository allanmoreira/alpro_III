/**
 * Created by allan on 3/9/16.
 */
public class App {
    public static void main(String [] args){
        Matrizes m = new Matrizes();
        // http://brasilescola.uol.com.br/matematica/multiplicacao-matrizes.htm
        int matriz1 [][] = {{2,5,9}, {3,6,8}};
        int matriz2 [][] = {{2,7},{4,3},{5,2}};

        m.imprimeMatriz(matriz1);
        System.out.println();
        m.imprimeMatriz(matriz2);
        System.out.println();
        m.multiplicaMatrizes(matriz1, matriz2);
    }
}
