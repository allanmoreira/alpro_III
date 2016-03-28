package testes;

import algoritmos.ordenacao.BubbleSort;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 12111151 on 3/28/16.
 */
public class BubbleSortTest {
    private BubbleSort bb;
    private int [] v;

    @Before
    public void setUp() throws Exception {
        v = new int [] {5, 2, 4, 6, 1, 3};
        bb = new BubbleSort(v);
        bb.ordena();
    }

    @Test
    public void testOrdena() {
        assertEquals("{1, 2, 3, 4, 5, 6}", bb.imprimeArray());
    }
}