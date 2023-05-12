package br.com.renner.Requests;

import java.util.Random;

public class ExternalId {

    public static void main(String[] args) {
        String numero = gerarDigitosAleatorios(12);
        System.out.println(numero);
    }

    private static String gerarDigitosAleatorios(int digitos) {
        StringBuilder text = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < digitos; i++) {
            text.append(random.nextInt(10)); // gerar um número aleatório entre 0 e 9
        }
        return text.toString();
    }


}
