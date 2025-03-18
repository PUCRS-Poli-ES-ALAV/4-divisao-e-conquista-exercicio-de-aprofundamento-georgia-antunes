package br.pucrs;

import java.util.ArrayList;

public class Exercicios {

    public int fatorial(int n) {
        if (n == 0)
            return 1;
        return n * fatorial(n - 1);
    }

    public int somatorio(int n) {
        if (n == 0)
            return 0;
        return n + somatorio(n - 1);
    }

    public int fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public int somaIntervalo(int k, int j) {
        if (k == j)
            return k;
        return k + somaIntervalo(k + 1, j);
    }

    public boolean isPal(String s) {
        if (s.length() <= 1)
            return true;
        if (s.charAt(0) != s.charAt(s.length() - 1))
            return false;
        return isPal(s.substring(1, s.length() - 1));
    }

    public String convBase2(int n) {
        if (n == 0)
            return "0";
        if (n == 1)
            return "1";
        return convBase2(n / 2) + (n % 2);
    }

    public int somaArrayList(ArrayList<Integer> lista) {
        if (lista.isEmpty())
            return 0;
        return lista.remove(0) + somaArrayList(lista);
    }

    public int findBiggest(ArrayList<Integer> lista) {
        if (lista.size() == 1)
            return lista.get(0);
        int primeiro = lista.remove(0);
        return Math.max(primeiro, findBiggest(lista));
    }

    public boolean findSubStr(String str, String match) {
        if (str.length() < match.length())
            return false;
        if (str.startsWith(match))
            return true;
        return findSubStr(str.substring(1), match);
    }

    public int nroDigit(int n) {
        if (n < 10)
            return 1;
        return 1 + nroDigit(n / 10);
    }

    /**
     * Retorna uma lista com todas as permutações de uma string.
     * Base: se a string tem 1 caractere, retorna uma lista com ela.
     * Passo recursivo: para cada caractere, coloca ele na frente das permutações
     * dos outros caracteres.
     */
    public ArrayList<String> permutations(String s) {
        ArrayList<String> result = new ArrayList<>();
        if (s.length() == 1) {
            result.add(s);
            return result;
        }
        for (int i = 0; i < s.length(); i++) {
            char fixed = s.charAt(i);
            String rest = s.substring(0, i) + s.substring(i + 1);
            for (String perm : permutations(rest)) {
                result.add(fixed + perm);
            }
        }
        return result;
    }
}
