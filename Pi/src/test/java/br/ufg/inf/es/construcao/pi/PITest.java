package br.ufg.inf.es.construcao.pi;

import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class PITest {

    @Test(expected = IllegalArgumentException.class)
    public void testParametroInvalido() throws Exception {
        PI.pi(0);
    }

    @Test
    public void testPI() {
        assertEquals(4 - 4 / 3, PI.pi(2));
        assertEquals(4 - (4 / 3) + (4 / 5), PI.pi(3));
    }
}