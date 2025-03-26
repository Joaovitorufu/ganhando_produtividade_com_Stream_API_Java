package stream_api.desafios;

import java.util.List;
import java.util.Arrays;

public class Desafio19 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer SomaNumeros = numeros.stream()
                .filter(n -> n % 3 == 0 && n % 5 == 0)
                .reduce(0, Integer :: sum);

        System.out.println(SomaNumeros);
    }
}
