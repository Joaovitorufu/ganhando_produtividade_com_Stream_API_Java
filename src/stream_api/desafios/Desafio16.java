package stream_api.desafios;

import java.util.List;
import java.util.Arrays;

public class Desafio16 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        List<Integer> numerosImpares = numeros.stream()
                .filter(n -> n % 2 != 0)
                .toList();

        System.out.println("Numeros pares: " + numerosPares);
        System.out.println("Numeros impares: " + numerosImpares);

    }
}
