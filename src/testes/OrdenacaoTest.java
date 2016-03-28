package testes;

import algoritmos.Ordenacao;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 12111151 on 3/28/16.
 */
public class OrdenacaoTest {
    private Ordenacao bb;
    private int [] v;

    @Before
    public void setUp() throws Exception {
        v = new int [] {5, 2, 4, 6, 1, 3};
        bb = new Ordenacao(v);
        bb.bubbleSort();
    }

    @Test
    public void bubbleSort() {
        assertEquals("{1, 2, 3, 4, 5, 6}", bb.imprimeArray());
    }
}