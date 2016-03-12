import java.util.ArrayList;

/**
 * Created by 12111151 on 3/9/16.
 */
public class App {
    public static void main(String [] args){
        Exercicios e = new Exercicios();
        /*
        System.out.println(e.somatorio(1));
        System.out.println(e.somatorio(2));
        System.out.println(e.somatorio(3));
        System.out.println(e.somatorio(4));
        System.out.println(e.somatorio(5));
        */

//        System.out.println(e.somatorioDeKaJ(1,5));

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(10);
        lista.add(1);
        lista.add(1);
        System.out.println(e.somatorioNumerosDeArrayList(lista));

    }
}
