package testes;

import algoritmos.Pesquisa;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by allanmoreira on 4/4/16.
 */
public class PesquisaTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testPesquisaSequencialEncontrou()  {
        int [] v = {4,2,6,5,7,8,6,9,3,1};
        assertEquals(-1, Pesquisa.pesquisaSequencial(v, 10));
    }

    @Test
    public void testPesquisaSequencialNaoEncontrou() {
        int [] v = {4,2,6,5,7,8,6,9,3,1};
        assertEquals(3, Pesquisa.pesquisaSequencial(v, 5));
    }

    @Test
    public void testBinarySearch() {
        int [] v = {1,2,3,4,5,6,7,8,9,5};
        assertEquals(8, Pesquisa.binarySearch(v, 9));
    }
}