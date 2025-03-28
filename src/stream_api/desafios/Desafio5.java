package stream_api.desafios;

import java.util.List;
import java.util.Arrays;

public class Desafio5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Double mediaNumerosMaioresQue5 = numeros.stream()
                .filter(num -> num > 5)
                .mapToDouble(Integer :: doubleValue)
                .average()
                .orElse(0);

        System.out.println(mediaNumerosMaioresQue5);

    }


}
