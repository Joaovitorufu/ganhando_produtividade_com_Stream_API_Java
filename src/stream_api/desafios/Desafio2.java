package stream_api.desafios;

import java.util.Arrays;
import java.util.List;


public class Desafio2 {
    public static void main(String[] args) {


        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer SomaPares = numeros.stream()
                .filter(num -> num % 2 == 0)
                .reduce(0, Integer::sum);

        System.out.println(SomaPares);
    }
}

