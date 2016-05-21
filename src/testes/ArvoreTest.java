package testes;

import algoritmos.Arvore;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by allanmoreira on 20/05/16.
 */
public class ArvoreTest {
    private Arvore arvore;
    @Before
    public void setUp() throws Exception {
        arvore = new Arvore();
        // teste 1
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

        // teste 2
//        arvore.inserir(30);
//        arvore.inserir(20);
//        arvore.inserir(40);
//        arvore.inserir(15);
//        arvore.inserir(25);
//        arvore.inserir(35);
//        arvore.inserir(45);
//        arvore.inserir(60);

        System.out.println(arvore.toString());
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
        assertEquals(arvore.tamanho(), 11);
    }

    @Test
    public void testAlturaDeUmNodo() throws Exception {
        assertEquals(arvore.altura(30), 0);
        assertEquals(arvore.altura(20), 4);
        assertEquals(arvore.altura(10), 3);
    }

    @Test
    public void testAlturaArvore() throws Exception {
        assertEquals(arvore.altura(), 4);
    }

    @Test
    public void testCaminho() throws Exception {
        List<Integer> listaArvore = arvore.caminho(45);
        List<Integer> listaEsperada = new ArrayList<>();
        listaEsperada.add(20);
        listaEsperada.add(40);
        listaEsperada.add(50);
        assertEquals(listaArvore.toString(), listaEsperada.toString());
    }

    @Test
    public void testFolhas() throws Exception {
        List<Integer> listaArvore = arvore.folhas();
        List<Integer> listaEsperada = new ArrayList<>();
        listaEsperada.add(6);
        listaEsperada.add(17);
        listaEsperada.add(30);
        listaEsperada.add(45);
        assertEquals(listaArvore.toString(), listaEsperada.toString());
    }

    @Test
    public void testValoresNoNivel() throws Exception {
        List<Integer> listaArvore = arvore.valoresNoNivel(0);
        List<Integer> listaEsperada = new ArrayList<>();
        listaEsperada.add(20);
        assertEquals(listaArvore.toString(), listaEsperada.toString());
    }
}