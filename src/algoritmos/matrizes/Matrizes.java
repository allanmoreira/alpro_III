package algoritmos.matrizes;

/**
 * Created by allan on 16/03/16.
 */
public class Matrizes {
    public int[][] implementaMatrizEImprimeLinhasEColunas(){
        int [][] matriz = new int[5][6];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i*j;
            }
        }
        return matriz;
    }

    public void multiplicaMatrizes(int [][] matriz1, int [][]matriz2){
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                if(matriz1.length != matriz2[i].length){
                    throw new IllegalArgumentException("algoritmos.matrizes.Matrizes de tamanhos diferentes!");
                }
                // todo continar código
            }

        }
    }

    public void imprimeMatriz(int [][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%2d ",matriz[i][j]);
            }
            System.out.println();
        }
    }
}
