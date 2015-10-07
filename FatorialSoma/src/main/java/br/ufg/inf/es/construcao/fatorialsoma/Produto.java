package br.ufg.inf.es.construcao.fatorialsoma;

/**
 * Classe que implementa produto usando apenas somas.
 */
public class Produto {
    public static int produto(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("a ou b inv�lido");
        }

        int i = 1;
        int s = 0;
        while (i <= b) {
            s = s + a;
            i = i + 1;
        }

        return s;
    }
}