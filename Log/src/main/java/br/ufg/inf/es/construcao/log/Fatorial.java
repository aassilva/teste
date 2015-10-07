package br.ufg.inf.es.construcao.log;

/**
 * Algoritmo que calcula o fatorial de um n�mero.
 */
public class Fatorial {
    public static int fatorial(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n inv�lido");
        }

        int i = 2;
        int f = 1;

        while (i <= n) {
            f = f * i;
            i = i + 1;
        }

        return f;
    }
}
