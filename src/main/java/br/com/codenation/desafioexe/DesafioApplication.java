package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Desafio Fibonacci application.
 */
public class DesafioApplication {

    private static final int SEQUENCE_LIMIT = 350;

    /**
     * @param n
     * @return Integer fibonacci item sequence
     */
    private static Integer getItem(Integer n) {
        return (n <= 1) ? n : getItem(n - 2) + getItem(n - 1);
    }

    /**
     * Fibonacci list.
     *
     * @return the list
     */
    public static List<Integer> fibonacci() {

        Integer index = 0;
        Boolean isValidSequence = true;
        List<Integer> sequence = new ArrayList<>();

        while (isValidSequence) {
            Integer item = getItem(index++);
            sequence.add(item);
            isValidSequence = (item < SEQUENCE_LIMIT);
        }
        return sequence;
    }

    /**
     * Is fibonacci boolean.
     *
     * @param a the a
     * @return the boolean
     */
    public static Boolean isFibonacci(Integer a) {
        return fibonacci().contains(a);
    }
}