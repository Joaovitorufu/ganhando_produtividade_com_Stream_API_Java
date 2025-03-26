package stream_api.desafios;

import java.util.List;
import java.util.Arrays;

public class Desafio11 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,3,4,5);

        Integer SomaQuadrados = numeros.stream()
                .map(n -> n*n)
                .reduce(0, Integer::sum);

        System.out.println(SomaQuadrados);
    }
}
