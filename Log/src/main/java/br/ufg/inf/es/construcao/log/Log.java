package br.ufg.inf.es.construcao.log;

/**
 * Algoritmo que implementa o log natural simples.
 */
public class Log {
    public static int log(int n, int k) {
        if (n < 1 || k < 2) {
            throw new IllegalArgumentException("n ou k inv�lido");
        }

        int i = 2;
        int e = n + 1;
        while (i <= k) {
            int p = Potencia.potencia(n, i);
            int f = Fatorial.fatorial(i);
            e = e + p / f;
            i = i + 1;
        }

        return e;
    }
}
