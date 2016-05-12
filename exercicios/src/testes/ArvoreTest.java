package testes;

import algoritmos.Arvore;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by allanmoreira on 11/05/16.
 */
public class ArvoreTest {

    Arvore arvore;
    @Before
    public void setUp() throws Exception {
        arvore = new Arvore();
        arvore.inserir(20);
        arvore.inserir(10);
        arvore.inserir(40);
        arvore.inserir(30);
        arvore.inserir(50);
        arvore.inserir(45);
        arvore.inserir(15);
        arvore.inserir(17);
        arvore.inserir(5);
        arvore.inserir(7);
        arvore.inserir(6);
    }

    @Test
    public void testContem() throws Exception {
        assertEquals(arvore.contem(100), false);
        assertEquals(arvore.contem(1), false);
        assertEquals(arvore.contem(10), true);
        assertEquals(arvore.contem(20), true);
        assertEquals(arvore.contem(30), true);
        assertEquals(arvore.contem(5), true);
        assertEquals(arvore.contem(45), true);
        assertEquals(arvore.contem(6), true);
    }

    @Test
    public void testTamanho() throws Exception {
        assertEquals(arvore.tamanho(), 6);
    }

    @Test
    public void testAltura() throws Exception {
        System.out.println(arvore.printTreeJB());
        System.out.println();
        assertEquals(arvore.altura(), 4);
    }



}