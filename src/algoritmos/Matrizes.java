package algoritmos;

/**
 * Created by allanmoreira on 16/03/16.
 */
public class Matrizes {
    /*
        1 -Implemente um método ou “main” que:
            ◦ Crie uma matriz 5X6 (5 "linhas" e 6 "colunas")
            ◦ Inicialize cada posição com o valor da soma da
                coordenada de sua linha com a coordenada de sua
                coluna;
            ◦ Exiba todos os elementos, linha após linha;
            ◦ Exiba todos os elementos, coluna após coluna;
    */
    public int[][] implementaMatrizEImprimeLinhasEColunas(){
        int [][] matriz = new int[5][6];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i*j;
            }
        }
        return matriz;
    }

    /*
        2. Implemente um método que receba
            duas matrizes e retorna o resultado da
            multiplicação (lembre-se das
            restrições para se multiplicar
            matrizes). Teste-o.
    */
    public void multiplicaMatrizes(int [][] matriz1, int [][]matriz2){
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                if(matriz1.length != matriz2[i].length){
                    throw new IllegalArgumentException("Matrizes de tamanhos diferentes!");
                }
                // TODO continar código do exercício 2
            }

        }
    }

//    TODO fazer exercício 3
//    TODO fazer exercício 4

    // Método auxiliar que imprime a matriz, para facilitar
    public void imprimeMatriz(int [][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%2d ",matriz[i][j]);
            }
            System.out.println();
        }
    }
}
