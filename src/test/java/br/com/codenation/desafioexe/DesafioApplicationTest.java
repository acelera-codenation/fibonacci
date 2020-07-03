package br.com.codenation.desafioexe;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class DesafioApplicationTest {

    @Test
    public void fibonacci() {
        assertNotNull(DesafioApplication.fibonacci());
    }

    @Test
    public void isFibonacci() {

        // Check bounds true
        Integer[] checksTrue = {0, 233};
        Arrays.stream(checksTrue).forEach(number -> {
            assertTrue(DesafioApplication.isFibonacci(number));
        });

        // Check bounds false
        Integer[] checksFalse = {-1, 378};
        Arrays.stream(checksFalse).forEach(number -> {
            assertFalse(DesafioApplication.isFibonacci(number));
        });
    }

    @Test
    public void fibonacciSequenceValidate() {
        List<Integer> sequence = DesafioApplication.fibonacci();
        List<Integer> expected = Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377);
        sequence.forEach(value -> {
            assertTrue(expected.contains(value));
        });
    }

}
