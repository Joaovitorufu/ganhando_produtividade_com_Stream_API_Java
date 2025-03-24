package stream_api.desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio6 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Boolean VerificaSeExisteMaiorQue10 = numeros.stream()
                .anyMatch(numero -> numero > 10);


        System.out.println(VerificaSeExisteMaiorQue10);
    }
}
