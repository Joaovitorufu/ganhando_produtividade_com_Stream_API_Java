package stream_api.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio9 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,3,4,5);


        //cria uma stream e retira todos os numeros repetidos, após isso compara com o tamanho da stream original
        Boolean VerificarSeExisteRepetido = numeros.stream()
                                            .distinct()
                                            .count() != numeros.size();


        System.out.println(VerificarSeExisteRepetido);
    }
}
