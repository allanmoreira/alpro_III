package testes;


import algoritmos.recursividade.Recursividade;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 12111151 on 3/28/16.
 */
public class RecursividadeTest {
    private Recursividade r = new Recursividade();

    @Test
    public void somatorioTest(){
        assertEquals(10, r.somatorio(4));
    }
}