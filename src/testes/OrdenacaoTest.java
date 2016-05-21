package testes;

import algoritmos.Ordenacao;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by allanmoreira on 3/28/16.
 */
public class OrdenacaoTest {
    private Ordenacao bb;
    private int [] v;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testeBubbleSort() {
        v = new int [] {5, 2, 4, 6, 1, 3};
        assertEquals("{1, 2, 3, 4, 5, 6}", Ordenacao.bubbleSort(v));
    }

    @Test
    public void testeBubbleSortOtimizado() {
        int [] v = {1,2,3,4,5,6};
        assertEquals("{1, 2, 3, 4, 5, 6}", Ordenacao.bubbleSortOtimizado(v));
    }

    @Test
    public void testInsertionSort() {
        int [] v = {5,2,4,6,1,3};
        assertEquals("{1, 2, 3, 4, 5, 6}", Ordenacao.insertionSort(v));
    }
}