package tdd.rodizio.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tdd.rodizio.entities.Dia;
import tdd.rodizio.entities.DiaFactory;
import tdd.rodizio.entities.impl.Placa;

/**
 *
 * @author Fernando Bontorin, 31568343 <fernandorbontorin@gmail.com>
 */
public class RodizioTeste {

    Dia d;

    public RodizioTeste() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testarRodizioDiaSegunda() {
        d = DiaFactory.getDia("Segunda");
        assertFalse(d.pode(new Placa("ABC-0001")));
        assertFalse(d.pode(new Placa("ABC-0002")));
        assertTrue(d.pode(new Placa("ABC-0003")));
    }

    @Test
    public void testarRodizioDiaTerca() {
        d = DiaFactory.getDia("Terca");
        assertFalse(d.pode(new Placa("ABC-0003")));
        assertFalse(d.pode(new Placa("ABC-0004")));
        assertTrue(d.pode(new Placa("ABC-0005")));
    }

    @Test
    public void testarRodizioDiaQuarta() {
        d = DiaFactory.getDia("Quarta");
        assertFalse(d.pode(new Placa("ABC-0005")));
        assertFalse(d.pode(new Placa("ABC-0006")));
        assertTrue(d.pode(new Placa("ABC-0007")));
    }

    @Test
    public void testarRodizioDiaQuinta() {
        d = DiaFactory.getDia("Quinta");
        assertFalse(d.pode(new Placa("ABC-0007")));
        assertFalse(d.pode(new Placa("ABC-0008")));
        assertTrue(d.pode(new Placa("ABC-0009")));
    }

    @Test
    public void testarRodizioDiaSexta() {
        d = DiaFactory.getDia("Sexta");
        assertFalse(d.pode(new Placa("ABC-0009")));
        assertFalse(d.pode(new Placa("ABC-0000")));
        assertTrue(d.pode(new Placa("ABC-0001")));
    }

    @Test
    public void testarRodizioDiaSabado() {
        d = DiaFactory.getDia("Sabado");
        assertTrue(d.pode(new Placa("ABC-0001")));
        assertTrue(d.pode(new Placa("ABC-0002")));
        assertTrue(d.pode(new Placa("ABC-0003")));
        assertTrue(d.pode(new Placa("ABC-0004")));
        assertTrue(d.pode(new Placa("ABC-0005")));
        assertTrue(d.pode(new Placa("ABC-0006")));
        assertTrue(d.pode(new Placa("ABC-0007")));
        assertTrue(d.pode(new Placa("ABC-0008")));
        assertTrue(d.pode(new Placa("ABC-0009")));
        assertTrue(d.pode(new Placa("ABC-0000")));
    }

    @Test
    public void testarRodizioDiaDomingo() {
        d = DiaFactory.getDia("Domingo");
        assertTrue(d.pode(new Placa("ABC-0001")));
        assertTrue(d.pode(new Placa("ABC-0002")));
        assertTrue(d.pode(new Placa("ABC-0003")));
        assertTrue(d.pode(new Placa("ABC-0004")));
        assertTrue(d.pode(new Placa("ABC-0005")));
        assertTrue(d.pode(new Placa("ABC-0006")));
        assertTrue(d.pode(new Placa("ABC-0007")));
        assertTrue(d.pode(new Placa("ABC-0008")));
        assertTrue(d.pode(new Placa("ABC-0009")));
        assertTrue(d.pode(new Placa("ABC-0000")));
    }

    @Test
    public void testarRodizioPlacaEscritaDiferente() {
        d = DiaFactory.getDia("Segunda");
        assertFalse(d.pode(new Placa("ABC0001")));
        assertFalse(d.pode(new Placa("ABC0002")));
        assertTrue(d.pode(new Placa("ABC0003")));
    }

    @Test
    public void testarRodizioPlacaEscritaErrada() {
        d = DiaFactory.getDia("Segunda");
        assertFalse(d.pode(new Placa("ABC001")));
        assertFalse(d.pode(new Placa("ABC00002")));
        assertFalse(d.pode(new Placa("ABC-001")));
    }

    @Test
    public void testarDiaEscritas() {
        d = DiaFactory.getDia("TeRÇa-Feira ");
        assertFalse(d.pode(new Placa("ABC-0003")));
        assertFalse(d.pode(new Placa("ABC-0004")));
        assertTrue(d.pode(new Placa("ABC-0005")));
    }
}
