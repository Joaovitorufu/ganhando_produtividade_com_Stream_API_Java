package stream_api.desafios;

import java.util.List;
import java.util.Arrays;

public class Desafio3 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Boolean isAllPositive = numeros.stream()
                .allMatch(num -> num > 0);

        System.out.println(isAllPositive);
    }
}
