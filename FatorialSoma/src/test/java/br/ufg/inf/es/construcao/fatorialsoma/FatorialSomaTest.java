package br.ufg.inf.es.construcao.fatorialsoma;

import org.junit.Assert;
import org.junit.Test;

public class FatorialSomaTest {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        FatorialSoma.fatorialsoma(0);
    }

    @Test
    public void testCasoDeFroteira() {
        Assert.assertEquals(1, FatorialSoma.fatorialsoma(1));
    }

    @Test
    public void testFatorialSoma() {
        Assert.assertEquals(6, FatorialSoma.fatorialsoma(3));
        Assert.assertEquals(2, FatorialSoma.fatorialsoma(2));
    }
}
