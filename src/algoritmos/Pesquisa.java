package algoritmos;

/**
 * Created by 12111151 on 4/4/16.
 */
public class Pesquisa {

    public static int pesquisaSequencial(int [] v, int k){
        for (int i = 0; i < v.length; i++)
            if(v[i] == k)
                return i;
        return -1;
    }

    public static int binarySearch(int [] v, int k){
        int low = 0;
        int high = v.length-1;
        int p = low + ((high-low)/2);
        System.out.println(p);
        while(low<high){
            if(k>v[p])
                low = p+1;
            else if(k<v[p])
                high = p-1;
            else
                return p;

            p = low + ((high-low)/2);
        }
        return -1;
    }
}
