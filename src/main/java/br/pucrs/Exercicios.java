package br.pucrs;

import java.util.ArrayList;

public class Exercicios {

    /**
     * Calcula o fatorial de um número n.
     * Base: fatorial(0) = 1.
     * Passo recursivo: fatorial(n) = n * fatorial(n - 1).
     */
    public int fatorial(int n) {
        if (n == 0)
            return 1;
        return n * fatorial(n - 1);
    }

    /**
     * Calcula o somatório de um número n até 0.
     * Base: somatorio(0) = 0.
     * Passo recursivo: somatorio(n) = n + somatorio(n - 1).
     */
    public int somatorio(int n) {
        if (n == 0)
            return 0;
        return n + somatorio(n - 1);
    }

    /**
     * Retorna o n-ésimo número da sequência de Fibonacci.
     * Base: fib(0) = 0, fib(1) = 1.
     * Passo recursivo: fib(n) = fib(n - 1) + fib(n - 2).
     */
    public int fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * Calcula o somatório dos números inteiros entre k e j.
     * Base: se k == j, retorna k.
     * Passo recursivo: soma(k, j) = k + soma(k + 1, j).
     */
    public int somaIntervalo(int k, int j) {
        if (k == j)
            return k;
        return k + somaIntervalo(k + 1, j);
    }

    /**
     * Verifica se uma string é um palíndromo.
     * Base: strings de tamanho 0 ou 1 são palíndromos.
     * Passo recursivo: verifica se o primeiro e último caractere são iguais e chama
     * a função para o meio da string.
     */
    public boolean isPal(String s) {
        if (s.length() <= 1)
            return true;
        if (s.charAt(0) != s.charAt(s.length() - 1))
            return false;
        return isPal(s.substring(1, s.length() - 1));
    }

    /**
     * Converte um número decimal para binário.
     * Base: se n == 0, retorna "0".
     * Passo recursivo: divide n por 2 e concatena o resto.
     */
    public String convBase2(int n) {
        if (n == 0)
            return "0";
        if (n == 1)
            return "1";
        return convBase2(n / 2) + (n % 2);
    }

    /**
     * Soma os elementos de um ArrayList de inteiros.
     * Base: lista vazia retorna 0.
     * Passo recursivo: remove o primeiro elemento e soma ao resultado da chamada
     * recursiva.
     */
    public int somaArrayList(ArrayList<Integer> lista) {
        if (lista.isEmpty())
            return 0;
        return lista.remove(0) + somaArrayList(lista);
    }

    /**
     * Encontra o maior elemento de um ArrayList.
     * Base: lista de um elemento retorna esse elemento.
     * Passo recursivo: compara o primeiro elemento com o maior dos restantes.
     */
    public int findBiggest(ArrayList<Integer> lista) {
        if (lista.size() == 1)
            return lista.get(0);
        int primeiro = lista.remove(0);
        return Math.max(primeiro, findBiggest(lista));
    }

    /**
     * Verifica se uma string ocorre dentro de outra.
     * Base: se match for maior que str, retorna false.
     * Passo recursivo: verifica se começa com match ou chama a função para o
     * restante da string.
     */
    public boolean findSubStr(String str, String match) {
        if (str.length() < match.length())
            return false;
        if (str.startsWith(match))
            return true;
        return findSubStr(str.substring(1), match);
    }

    /**
     * Determina o número de dígitos de um inteiro.
     * Base: se n < 10, retorna 1.
     * Passo recursivo: remove o último dígito e soma 1.
     */
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
