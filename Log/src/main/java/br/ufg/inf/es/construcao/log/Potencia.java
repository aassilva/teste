package br.ufg.inf.es.construcao.log;

/**
 * Implementa��o de algoritmo que calcula a potencia de um n�mero x em um
 * expoente y, utilizando apenas multiplica��es simples;
 */
public class Potencia {
    public static int potencia(int x, int y) {

        if (x <= 0 || y < 0) {
            throw new IllegalArgumentException("x ou y invalido");
        }

        int i = 1;
        int p = 1;
        while ( i <= y) {
            p = p * x;
            i = i + 1;
        }

        return p;
    }
}